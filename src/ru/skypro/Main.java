package ru.skypro;

public class Main {

    public static void main(String[] args) {

        //Задача 1.1, 2

        int[] intArray = new int[3];
        int j = 1;
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = j;
            j++;
            System.out.print(intArray[i]);
            if (i < intArray.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        //Задача 1.2 , 2

        double[] doubleArray = {1.57, 7.654, 9.986};
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i]);
            if (i < doubleArray.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        //Задача 1.3 , 2

        double[] randomArray = new double[5];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (Math.random() * 901 + 100);
            System.out.print(Math.round(randomArray[i]));
            if (i < randomArray.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        //Задача 3

        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.print(intArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = doubleArray.length - 1; i >= 0; i--) {
            System.out.print(doubleArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = randomArray.length - 1; i >= 0; i--) {
            System.out.print(Math.round(randomArray[i]));
            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        //Задача 4

        for (int i = 0; i < intArray.length; i++) {
            boolean theNumberIsOdd = intArray[i] % 2 != 0;
            if (theNumberIsOdd) {
                intArray[i] = intArray[i] + 1;
            }
            System.out.print(intArray[i]);
            if (i < intArray.length - 1) {
                System.out.print(", ");
            }
        }

    }
}
