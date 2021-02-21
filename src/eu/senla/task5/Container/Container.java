package eu.senla.task5.Container;

public abstract class Container {
    protected int height;
    private int pH;
    private int diagonal;
    protected int q;
    protected abstract void getQ();

    public Container() {
        this.pH = getPH();
        this.diagonal = getDiagonal();
        this.height = (int) ((Math.random() * 90) + 10);
        getQ();
    }
    public int getDiagonal(){
        if ((int) (Math.random()*2)+1 == 1) {
            this.diagonal = 10;
        }else {
            this.diagonal = 20;
        }
        return this.diagonal;
    }
    public int getPH() {
        if ((int) (Math.random() * 2) + 1 == 1) {
            this.pH = 1000;
        } else {
            this.pH = 2000;
        }
        return this.pH;
    }
    public int getDensity() {
        return pH;
    }
    public double getVolume() {
        return q;
    }

    @Override
    public String toString() {
        return "Container{" +
                "height=" + height +
                ", pH=" + pH +
                ", diagonal=" + diagonal +
                ", q=" + q +
                '}';
    }
}