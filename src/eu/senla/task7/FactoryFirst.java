package eu.senla.task7;

import java.util.Random;

public class FactoryFirst implements Factory {

    @Override
    public <T> Enum robotProduction() {
        int number = new Random().nextInt(Body.values().length);
        return Body.values()[number];
    }
}