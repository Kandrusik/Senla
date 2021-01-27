package eu.senla.task3;

public class Cat {

    String catName = "Gucci";
    String catAge = "2y.o";

    private String name2;
    private int age2;

    public String name = "Vasia";
    public int age = 9;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat() { //Не понял, зачем предложило добавить

    }



   public  void task1() {
        int count = 0;

        while (count < 10) {
            System.out.println("Name: " + catName + ", Age: " + catAge);
            count++;
        }
    }


    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public int getAge2() {
        return age2;
    }

    public void setAge2(int age2) {
        this.age2 = age2;
    }
}