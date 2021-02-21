package eu.senla.task7;

import java.util.Random;

public class FactorySecond implements Factory {

    @Override
    public <T> Enum robotProduction() {
        int number = new Random().nextInt(Head.values().length);
        return Head.values()[number];
    }
}