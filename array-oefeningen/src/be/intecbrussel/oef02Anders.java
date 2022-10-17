package be.intecbrussel;

import java.util.Arrays;

public class oef02Anders {

    public static void main(String[] args) {

        int[] myArry = {1, 4, 16, 88, 10, 12};

        Arrays.sort(myArry);

        System.out.println(Arrays.toString(myArry));

        int second_largest = 0;

        for (int i = myArry.length - 2; i > 0; i--) {

            if (myArry[i] != myArry[myArry.length - 1]) {
                second_largest = myArry[i];
                break;
            }

        }

        System.out.println("second_largest = " + second_largest);

    }

}
