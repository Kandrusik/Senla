package eu.senla.task3;

import eu.senla.task3.Cat;

public class Main {

    public static void main(String[] args) {
        Cat Cat = new Cat("Matilda", 5);

        Cat.task1(); //task 1.

        Cat.setAge2(6); //task 2
        Cat.setName2("Emmy");
        String catName = Cat.getName2();
        int catAge = Cat.getAge2();
        for (int i = 0; i < 10; i++) {

            System.out.println("Name: " + catName + ", Age: " + catAge + "y.o");
        }

        int index = 0; //task 3
        do {
            index++;
            System.out.println("Name: " + Cat.name + ", Age: " + Cat.age);
        } while (index < 10);



        Cat.setName2("Belik"); //task 4
        Cat.setAge2(3);
        int[] cotik = new int[4];
        for (int i : cotik) {
            System.out.println("Name: " + Cat.getName2() + ", Age: " + Cat.getAge2());
        }

        Cat Cat1 = new Cat (); //task 3.1
        Cat Cat2 = new Cat ();
        Cat1.name = "Anton";
        Cat2.name = "Anton";
        Cat1.age = 8;
        Cat2.age = 10;
        System.out.println(Cat1 == Cat2);
        System.out.println(Cat1.name.equals(Cat2.name));
    }




}