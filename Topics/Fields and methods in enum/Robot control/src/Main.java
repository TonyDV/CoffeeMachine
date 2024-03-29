class Move {

    public static void moveRobot(Robot robot, int toX, int toY) {

        //robot.stepForward(); // your implementation here
        System.out.println(robot.getX());
        while (robot.getX() != toX || robot.getY() != toY) {
            if (robot.getX() != toX) {
                if (robot.getX() > toX) {
                    if (robot.getDirection() != Direction.LEFT) {
                        if ( robot.getDirection() == Direction.UP
                                || robot.getDirection() == Direction.RIGHT) {
                            robot.turnLeft();
                        } else {
                            robot.turnRight();
                        }
                    } else {
                        robot.stepForward();
                    }
                } else {
                    if (robot.getDirection() != Direction.RIGHT) {
                        if (robot.getDirection() == Direction.UP
                                || robot.getDirection() == Direction.LEFT) {
                            robot.turnRight();
                        } else {
                            robot.turnLeft();
                        }
                    } else {
                        robot.stepForward();
                    }
                }
            } else {
                if (robot.getY() > toY && robot.getY() != toY) {
                    if (robot.getDirection() != Direction.DOWN) {
                        if (robot.getDirection() == Direction.LEFT) {
                            robot.turnLeft();
                        } else {
                            robot.turnRight();
                        }
                    } else {
                        robot.stepForward();
                    }
                } else {
                    if (robot.getDirection() != Direction.UP) {
                        if (robot.getDirection() == Direction.RIGHT) {
                            robot.turnLeft();
                        } else {
                            robot.turnRight();
                        }
                    } else {
                        robot.stepForward();
                    }
                }
            }
        }


    }
}

//Don't change code below

enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnRight() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            default:
                throw new IllegalStateException();
        }
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}