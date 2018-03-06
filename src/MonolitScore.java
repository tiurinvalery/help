import java.util.LinkedList;
import java.util.List;

public class MonolitScore {
    public static Integer getScore(String search, String source) {
        char[] searchArray = search.toCharArray();
        char[] sourceArray = source.toCharArray();
        Integer resultScore = 0;

        List<Character> searchArrayLettersAndDigits = new LinkedList<>();
        List<Character> sourceArrayLettersAndDigits = new LinkedList<>();

        for (int i = 0; i < searchArray.length; i++) {
            if (Character.isLetterOrDigit(searchArray[i])) {
                searchArrayLettersAndDigits.add(searchArray[i]);
            }
        }
        for(int i =0;i<sourceArray.length;i++){
            sourceArrayLettersAndDigits.add(sourceArray[i]);
        }

        for(char searchC : searchArrayLettersAndDigits){
            for(char sourceC : sourceArrayLettersAndDigits){
                if(searchC==sourceC){
                    resultScore=resultScore+80;
                }
                else if(Character.toUpperCase(searchC)==Character.toUpperCase(sourceC)){
                    resultScore = resultScore+60;
                }
            }
        }
        return resultScore;


    }
}
