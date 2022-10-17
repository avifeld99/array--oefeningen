package be.intecbrussel;

public class Oefening02 {

    public static void main(String[] args) {

        int[] array01 = {1, 4, 6, 8, 10, 12};

        int max = array01[0];

        for (int i = 1; i < array01.length; i++) {

            if (array01[i] > max) {
                max = array01[i];

            }
        }

        int max02 = array01[0];

        for (int i = 1; i < array01.length; i++) {

            if (array01[i] > max02 && array01[i] < max)
                max02 = array01[i];

        }

        System.out.println(max02);

    }

}
