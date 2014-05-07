package JavaAlgorithmsPractice.algorithms.search;

/**
 * Created with IntelliJ IDEA.
 * User: jlara
 * Date: 5/7/14
 * Time: 2:25 PM
 */
public class BasicDummyData {

    protected int[] _theArray = new int[50];

    protected int _arrraySize = 10;

    public BasicDummyData() {
        generateRandomArray();
        printArray();
    }


    protected void generateRandomArray(){
        for (int i = 0; i < _theArray.length; i++){
            _theArray[i] = (int) ((Math.random()*10)+10);
        }
    }

    protected void printArray(){
        System.out.print("----------\n");
        for (int i = 0; i < _arrraySize; i++) {
            System.out.println(i  + " - " + _theArray[i]);
        }
        System.out.print("----------\n");
    }
}
