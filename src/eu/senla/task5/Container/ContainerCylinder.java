package eu.senla.task5.Container;

public class ContainerCylinder extends Container{

    @Override
    protected void getQ() {
        q = (int) (Math.PI * Math.pow(super.getDiagonal(), 2) / 4 * height);
    }

    @Override
    public String toString() {
        return "Цилиндрический контейнер {" +
                "Высота = " + height +
                ", объем = " + q +
                '}';
    }
}