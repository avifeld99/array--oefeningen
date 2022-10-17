package be.intecbrussel;

public class oef03NogWatAnders {

    public static void main(String[] args) {

        int[] intArray = {1, 50, 6, 20, 10, 12};

        for (int index = 0; index < intArray.length -1; index++) {

            if (intArray[index] < intArray[index + 1]) {
                System.out.println(intArray[index] +
                        " is kleiner dan " + intArray[index + 1]);

            }

        }

    }

}
