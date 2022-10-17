package be.intecbrussel;

import java.util.Arrays;

public class Oefening03Anders {

    public static void main(String[] args) {

        int[] arr = {(int) (Math.random() * 100),
                (int) (Math.random() * 100), (int)
                (Math.random() * 100),

                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100)};

        int max = Integer.MIN_VALUE;

        System.out.println(Arrays.toString(arr));

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] > max) {

                System.out.println(arr[i] + " is larger than every number to the right of it");

                max = arr[i];

            }

        }

    }

}
