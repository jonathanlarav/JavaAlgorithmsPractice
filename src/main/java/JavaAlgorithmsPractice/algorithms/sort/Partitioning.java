package JavaAlgorithmsPractice.algorithms.sort;

import java.util.Arrays;

import static JavaAlgorithmsPractice.algorithms.util.Util.*;

/**
 * Created by Jonathan on 30/11/2014.
 */
public class Partitioning {

    private static int[] theArray;
    private static int arraySize;

    public static void main(String[] args) {
        Partitioning partitioning = new Partitioning(10);

        System.out.println(Arrays.toString(theArray));
        partitioning.partitionArray(35);
        System.out.println(Arrays.toString(theArray));
    }

    public void partitionArray(int pivot) {
        int leftPointer = -1;
        int rightPointer = arraySize;

        while (true) {

            while (leftPointer < (arraySize - 1) && theArray[++leftPointer] < pivot)
                ;

            printHorzArray(theArray, arraySize, leftPointer, rightPointer);

            System.out.println(theArray[leftPointer] + " in index " + leftPointer +
                    " is bigger then the pivot value " + pivot);

            while (rightPointer > 0 && theArray[--rightPointer] > pivot)
                ;

            printHorzArray(theArray, arraySize, leftPointer, rightPointer);

            System.out.println(theArray[rightPointer] + " in index " + rightPointer
                    + " is smaller then the pivot value " + pivot);

            printHorzArray(theArray, arraySize, leftPointer, rightPointer);

            if (leftPointer >= rightPointer) break;
            else {
                swapValues(theArray, leftPointer, rightPointer);

                System.out.println(theArray[leftPointer] + " was swapped to " + theArray[rightPointer]);
            }
        }
    }

    Partitioning(int newArraySize) {
        arraySize = newArraySize;
        theArray = generateRandomArray(arraySize);
    }

}