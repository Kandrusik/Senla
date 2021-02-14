package eu.senla.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        String letters = "ASDFGHJKLZXCXZ";
        String[][] mass = new String[10][10];
        String symbol = "";

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (j % 3 == 0) {
                    mass[i][j] = (String.valueOf((Math.random() * 10))).substring(0, 6);
                } else {
                    symbol = "";
                    for (int l = 0; l < 6; l++) {
                        int t = (int) (Math.random() * 10);
                        symbol = symbol + letters.charAt(t);
                    }
                    mass[i][j] = symbol;
                } //System.out.print(mass[i][j] + "\t");
            } //System.out.println();
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.println(Arrays.toString(mass[i]));
        }


        String[] newMass1 = new String[10];
        String[] newMass2 = new String[10];
        for(int i = 0; i<mass.length; i++){
            for (int j = 0; j < mass[i].length; j++) {
                if (i == j) {
                    newMass1[i] = mass[i][j];
                }
                if ((i + j) == (mass.length - 1)) {
                    newMass2[i] = mass[i][j];
                }
            }
        } System.out.println();
        System.out.println("Главная диагональ: "+Arrays.toString((newMass1)));
        System.out.println("Побочная диагональ: "+Arrays.toString((newMass2)));

        System.out.println("Сравнение диагоналей: "+Arrays.equals(newMass1,newMass2));
        System.out.println();


        String[] both = new String[newMass1.length + newMass2.length];
        int count = 0;

        for(int i = 0; i<newMass1.length; i++) {
            both[i] = newMass1[i];
            count++;
        }
        for(int j = 0; j<newMass2.length; j++) {
            both[count++] = newMass2[j];
        }

        System.out.print("Общаяя диагональ: " + Arrays.toString(both));

        String[] number = new String[8];
        StringBuffer sb = new StringBuffer();
        int index = 0;
        for (int i = 0; i < both.length; i++) {
            try {
                double val = Double.parseDouble(both[i]);
                double hz = val - (int) val;
                if (hz > 0.7) {
                    int newVal = (int)Math.ceil(val);
                    number[index]=newVal + "";
                    index++;
                } else {
                    int newVal = (int)Math.floor(val);
                    number[index]=newVal + "";
                    index++;
                }
            } catch (NumberFormatException e) {
                both[i] = both[i].substring(1, 4);
                sb.append(both[i] + ", ");
            }
        }
        for (index = 0; index <= 7; index++) {
            System.out.println(number[index] + "_");
        }
        System.out.println();
        System.out.println(sb);
    }
}
