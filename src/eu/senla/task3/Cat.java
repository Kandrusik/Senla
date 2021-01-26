package eu.senla.task3;

public class Cat {

    public Cat(String Kitty, int i) {
    }

    public void catDoWhile() {
        int i=0;
        Cat cat3 = new Cat("Kitty", 5);
        do {
            System.out.println("name " + cat3.name + " age " + cat3.age);
        }
        while (i++ < 9);
}
