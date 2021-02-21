package eu.senla.task7;

public class Main {
    public static void main(String[] args) {
    FactoryFirst bodies = new FactoryFirst();
    FactorySecond heads = new FactorySecond();
    Robot names = new Robot();
    Robot[] allRobot = new Robot[9];
        for (int i = 0; i < 9; i++) {
            allRobot[i] = new Robot(bodies.robotProduction(), heads.robotProduction(), names.getName());
            System.out.println(allRobot[i].toString());
        }
    }
}