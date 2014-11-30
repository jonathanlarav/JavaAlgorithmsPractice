package JavaAlgorithmsPractice.algorithms.util;

/**
 * Created by Jonathan on 30/11/2014.
 */
public class Util {

    public static int[] generateRandomArray(int arraySize) {
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = (int) (Math.random() * 10) + 10;
        }
        return array;
    }

    public static void printArray(int[] theArray) {
        System.out.println("----------");
        for (int i = 0; i < theArray.length; i++) {
            System.out.print("|" + i + " | ");
            System.out.println(theArray[i] + " |");
        }
        System.out.println("----------");
    }

    public static void printHorzArray(int[] theArray, int arraySize, int leftPointer, int rightPointer) {

        for (int n = 0; n < 51; n++) System.out.print("-");

        System.out.println();

        for (int n = 0; n < arraySize; n++) {

            System.out.print("| " + n + "  ");

        }

        System.out.println("|");

        for (int n = 0; n < 51; n++) System.out.print("-");

        System.out.println();

        for (int n = 0; n < arraySize; n++) {

            System.out.print("| " + theArray[n] + " ");

        }

        System.out.println("|");

        for (int n = 0; n < 51; n++) System.out.print("-");

        System.out.println();

        // END OF FIRST PART


        // ADDED FOR BUBBLE SORT

        if (rightPointer != -1) {

            // ADD THE +2 TO FIX SPACING

            for (int k = 0; k < ((rightPointer * 5) + 2); k++) System.out.print(" ");

            System.out.print(rightPointer);

        }


        // THEN ADD THIS CODE

        if (leftPointer != -1) {

            // ADD THE -1 TO FIX SPACING

            for (int l = 0; l < (5 * (leftPointer - rightPointer) - 1); l++) System.out.print(" ");

            System.out.print(leftPointer);

        }

        System.out.println();

    }

    public static void swapValues(int[] theArray, int indexOne, int indexTwo) {
        int temp = theArray[indexOne];
        theArray[indexOne] = theArray[indexTwo];
        theArray[indexTwo] = temp;
    }
}
