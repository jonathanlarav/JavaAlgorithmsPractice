package JavaAlgorithmsPractice.algorithms.search;

/**
 * Created with IntelliJ IDEA.
 * User: jlara
 * Date: 5/7/14
 * Time: 11:52 AM
 */
public class BasicSearchExamples extends BasicDummyData{

    private String linearSearch(int valueToSearch) {
        String resultIndexes = "";
        for (int i = 0 ; i < _arrraySize ; i++) {
            if (_theArray[i] == valueToSearch){
                resultIndexes += i + " ";
            }
        }
        return resultIndexes == "" ? "No value found" : resultIndexes;
    }

    public static void main(String[] args){
        BasicSearchExamples basicSearchExamples = new BasicSearchExamples();
        int valueToSearch = 17;
        String indexes = basicSearchExamples.linearSearch(valueToSearch);
        System.out.print("Value "+valueToSearch + " found on indexes: " + indexes);
    }
}
