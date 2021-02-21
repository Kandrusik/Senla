package eu.senla.task7;

public class Robot {
    String name;
    Head robotHead;
    Body robotBody;
    int index = 0;

    public Robot() {
    }

    public Robot(Enum robotProduction, Enum robotProduction1, String name) {
        this.name = name;
        this.robotHead = (Head) robotProduction1;
        this.robotBody = (Body) robotProduction;
    }

    public String getName() {
        String[] names = new String[]{"Паша","Саша","Антон","Богдан","Егор","Женя","Влад","Марья","Руслан"};
        String robotNames = names[index];
        index++;
        return robotNames;
    }

    @Override
    public String toString() {
        return "Робот: " +
                "Имя = " + name +
                ", Голова = " + robotHead.getHeadName() +
                ", Тело = " + robotBody.getBodyName();
    }
}