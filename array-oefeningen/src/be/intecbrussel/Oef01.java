package be.intecbrussel;

import java.util.Arrays;

public class Oef01 {

    public static void main(String[] args) {

        int[] originalArray = {1, 4, 6, 8, 10, 12};

        for (int index = 0; index < originalArray.length; index++) {

            System.out.println(originalArray[index] + " ");

        }

        int[] newArray = Arrays.copyOf(originalArray, 8);

        for (int index = 0; index < newArray.length; index++) {

            System.out.println(newArray[index] + " ");

        }

    }

}
