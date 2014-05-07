package JavaAlgorithmsPractice.algorithms.search;

/**
 * Created with IntelliJ IDEA.
 * User: jlara
 * Date: 5/7/14
 * Time: 11:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class LinearSearch {

    private int[] _theArray = new int[50];

    private int _arrraySize = 10;


    private void generateRandomArray(){
        for (int i = 0; i < _theArray.length; i++){
            _theArray[i] = (int) ((Math.random()*10)+10);
        }
    }

    public static void main(String[] args){

    }

}
