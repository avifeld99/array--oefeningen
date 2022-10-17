package be.intecbrussel;

import java.util.Arrays;

public class Arrays2D {

    public static void main(String[] args) {


        int[][] myArr = new int[2][5];
        myArr[0][0] = 1;
        myArr[0][1] = 2;
        myArr[0][2] = 3;
        myArr[0][3] = 4;
        myArr[0][4] = 5;
        myArr[1][0] = 10;
        myArr[1][1] = 20;
        myArr[1][2] = 30;
        myArr[1][3] = 40;
        myArr[1][4] = 50;
        for (int index = 0; index < myArr.length; index++) {
            for (int indexJ = 0; indexJ < myArr[index].length; indexJ++){
                System.out.println("arr[" + index + "][" + indexJ + "] = " + myArr[index]
                        [indexJ]);
            }
        }

        int[][][] myArr1 = {{{12, 6, 7},{8, 54, 9},{98, 65, 3}}};
        for (int index = 0; index < myArr1.length; index++) {
            for (int indexJ = 0; indexJ < myArr1[index].length; indexJ++) {
                for (int indexK = 0; indexK < myArr1[index][indexJ].length; indexK++) {

                    System.out.println("myArr [" + index + "][" + indexJ + "][" +
                            indexK + "] = " + myArr1[index][indexJ][indexK]);
                }
            }
        }

        int intArr[] = { 300, 200, 100, 400, 500 };
        //System.out.println("Before sorting value at index 0 " + intArr[0]);
        //System.out.println("Before sorting value at index 2 " + intArr[2]);
        Arrays.sort(intArr);
        //System.out.println("After sorting value at index 0 " + intArr[0]);
        //System.out.println("After sorting value at index 2 " + intArr[2]);
        int keyElement = 300;

        System.out.println(keyElement + " found at index = " + Arrays.binarySearch(intArr,
                keyElement));


    }
}
