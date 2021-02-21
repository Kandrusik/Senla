package eu.senla.task5.Container;

public class ContainerCone extends Container{
    @Override
    protected void getQ() {
        q = (int) (((double) 1 / 3) * Math.PI * Math.pow(super.getDiagonal(), 2) / 4 * height);
    }

    @Override
    public String toString() {
        return "Конусный контейнер {" +
                "Высота = " + height +
                ", объем = " + q +
                '}';
    }
}
