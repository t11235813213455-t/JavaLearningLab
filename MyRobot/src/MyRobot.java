public class MyRobot {

    public static void main(String[] args) {
        Robot robi = new Robot();
        moveRobot(robi, -1, -1);
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        int fromX = robot.getX();
        int fromY = robot.getY();
        if (fromX < toX) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnLeft();
                    break;
                case RIGHT:
                    break;
                case LEFT:
                    robot.turnRight();
                    robot.turnRight();
                    break;
            }
            for (int i = 1; i <= Math.abs(toX - fromX); i++) {
                robot.stepForward();
            }
        } else if (fromX > toX) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnLeft();
                    break;
                case DOWN:
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case LEFT:
                    break;
            }
            for (int i = 1; i <= Math.abs(fromX - toX); i++) {
                robot.stepForward();
            }
        }
        if (fromY < toY) {
            switch (robot.getDirection()) {
                case UP:
                    break;
                case DOWN:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnRight();
                    break;
            }
            for (int i = 1; i <= Math.abs(toY - fromY); i++) {
                robot.stepForward();
            }
        } else if (fromY > toY) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case DOWN:
                    break;
                case RIGHT:
                    robot.turnRight();
                    break;
                case LEFT:
                    robot.turnLeft();
                    break;
                    }
            for (int i = 1; i <= Math.abs(fromY - toY); i++) {
                robot.stepForward();
            }
        }
    }
}