package machine;
import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        NewCoffeeMachine machine1 = new NewCoffeeMachine(scanner);
        machine1.mainMenu();

    }
}


class NewCoffeeMachine {
    int waterHas;
    int milkHas;
    int beansHas;
    int cupsHas;
    int moneyHas;
    Scanner scanner;
    State state = State.RUNNING;

    public NewCoffeeMachine(Scanner scanner) {
        this.scanner = scanner;
        this.waterHas = 400;
        this.milkHas = 540;
        this.beansHas = 120;
        this.cupsHas = 9;
        this.moneyHas = 550;

    }

    boolean checkRemains(int waterCheck, int milkCheck, int beansCheck) {
        boolean checkResult = true;
        String notEnough = "";
        if (this.waterHas < waterCheck) {
            checkResult = false;
            notEnough = "water";
        }
        if (this.milkHas < milkCheck && checkResult) {
            checkResult = false;
            notEnough = "milk";
        }
        if (this.beansHas < beansCheck && checkResult) {
            checkResult = false;
            notEnough = "beans";
        }
        if (this.cupsHas < 1 && checkResult) {
            checkResult = false;
            notEnough = "cups";
        }
        if (!checkResult) {
            System.out.println("Sorry, not enough " + notEnough + "!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
        }
        return checkResult;
    }

    void changeRemains(int waterChange, int milkChange, int beansChange,
                              int moneyChange) {
        this.waterHas -= waterChange;
        this.milkHas -= milkChange;
        this.beansHas -= beansChange;
        this.moneyHas += moneyChange;
        this.cupsHas--;
    }

    void buy() {
        String clientInput;
        CoffeeType selectedCoffee = null;
        boolean checkResult;
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte,"
                + "3 - cappuccino, back - to main menu:");
        clientInput = this.scanner.next();
        if (clientInput.equals("back")) {
            return;
        }
        switch (clientInput) {
            case "1" :
                selectedCoffee = CoffeeType.ESPRESSO;
                break;
            case "2" :
                selectedCoffee = CoffeeType.LATTE;
                break;
            case "3":
                selectedCoffee = CoffeeType.CAPPUCCINO;
                break;
        }
        checkResult = checkRemains(selectedCoffee.getWater(), selectedCoffee.getMilk(),
                selectedCoffee.getBeans());
        if (checkResult) {
            changeRemains(selectedCoffee.getWater(), selectedCoffee.getMilk(),
                    selectedCoffee.getBeans(), selectedCoffee.getCosts());
        }

    }

    void take() {
        System.out.println("I gave you $" + this.moneyHas);
        this.moneyHas = 0;
    }

    void fill() {
        System.out.println("Write how many ml of water you want to add:");
        this.waterHas += this.scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        this.milkHas += this.scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        this.beansHas += this.scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        this.cupsHas += this.scanner.nextInt();

    }

    void printCoffeeMachineHas() {
        System.out.println("The coffee machine has:");
        System.out.println(this.waterHas + " ml of water");
        System.out.println(this.milkHas + " ml of milk");
        System.out.println(this.beansHas + " g of coffee beans");
        System.out.println(this.cupsHas + " disposable cups");
        System.out.println("$" + this.moneyHas + " of money");
    }
    void mainMenu() {
        boolean stopFlag = true;
        String action;
        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = this.scanner.next();

            switch (action) {
                case "buy":
                    state = State.BUYING;
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    printCoffeeMachineHas();
                    break;
                case "exit":
                    stopFlag = false;
                    break;
            }
        } while (stopFlag);

    }

}

enum CoffeeType {
    ESPRESSO(250, 0, 16, 4),
    LATTE(350, 75, 20, 7),
    CAPPUCCINO(200, 100, 12, 6);

    private final int water;
    private final int milk;
    private final int beans;
    private final int costs;

    CoffeeType(int water, int milk, int beans, int costs) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.costs = costs;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getBeans() {
        return beans;
    }

    public int getCosts() {
        return costs;
    }
}

enum State {
    RUNNING, OFF, FILLING_WATER, FILLING_MILK, FILLING_BEANS, BUYING
}