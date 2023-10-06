class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        // write your code here
        String stringTmp;
        int intTmp;

        stringTmp = p1.name;
        intTmp = p1.age;

        p1.name = p2.name;
        p1.age = p2.age;

        p2.name = stringTmp;
        p2.age = intTmp;

    }
}