package be.intecbrussel;

public class oefening03 {

    public static void main(String[] args) {

        // Dit controleert de getallen met het laatste nummer.

        int[] array01 = {1, 50, 6, 20, 10, 12};

        for (int i = 0; i <= array01.length -1; i++) {

            if (array01[i] > array01[array01.length -1 ]) {
                System.out.println(array01[i]);

            }

        }

    }

}


