package JavaAlgorithmsPractice.algorithms.util;

/**
 * Created by Jonathan on 30/11/2014.
 */
public class Util {

    public static int[] generateRandomArray(int arraySize) {
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = (int) (Math.random() * 50) + 10;
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

    public static void printHorzArray(int[] theArray, int arraySize, int i, int j) {

        for (int n = 0; n < 61; n++)
            System.out.print("-");

        System.out.println();

        for (int n = 0; n < arraySize; n++) {

            System.out.format("| %2s " + " ", n);

        }

        System.out.println("|");

        for (int n = 0; n < 61; n++)
            System.out.print("-");

        System.out.println();

        for (int n = 0; n < arraySize; n++) {

            System.out.print(String.format("| %2s " + " ", theArray[n]));

        }

        System.out.println("|");

        for (int n = 0; n < 61; n++)
            System.out.print("-");

        System.out.println();

        if (i != -1) {

            // Number of spaces to put before the F

            int spacesBeforeFront = 5 * i + 1;

            for (int k = 0; k < spacesBeforeFront; k++)
                System.out.print(" ");

            System.out.print("L");

            // Number of spaces to put before the R

            int spacesBeforeRear = (5 * j + 1 - 1) - spacesBeforeFront;

            for (int l = 0; l < spacesBeforeRear; l++)
                System.out.print(" ");

            System.out.print("H");

            System.out.println("\n");

        }

    }

    public static void swapValues(int[] theArray, int indexOne, int indexTwo) {
        int temp = theArray[indexOne];
        theArray[indexOne] = theArray[indexTwo];
        theArray[indexTwo] = temp;
    }
}
