public class BonusScoreForNumber {
    public static Integer getScore(String search,String source){
        Integer resultScore = 0;
        char[] searchArray = search.toCharArray();
        char[] sourceArray = source.toCharArray();
        for(int i =0;i<searchArray.length;i++){
            for(int j = 0; j <sourceArray.length;j++){
                if(Character.isDigit(searchArray[i])&&searchArray[i]==sourceArray[j]&&i==j){
                    resultScore = resultScore+30;
                }
                else if(Character.isDigit(searchArray[i])&&searchArray[i]==sourceArray[j]){
                    resultScore = resultScore +20;
                }
                else if(Character.isDigit(searchArray[i])&&searchArray[i]!=sourceArray[j]&&i==j){
                    resultScore = resultScore - 10;
                }
                else if(Character.isDigit(searchArray[i])&&Character.isDigit(sourceArray[j])&&searchArray[i]!=sourceArray[j]){
                    resultScore = resultScore -5;
                }
            }
        }
        return resultScore;
    }
}
