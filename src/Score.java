public class Score {
    public static Integer getScore(String search, String source, String brand,String category) {
        FirstMethodCompare firstMethodCompare = new FirstMethodCompare();
        Integer resultValue = 0;
        resultValue = firstMethodCompare.compareRusNames(search, brand) - SortContainsBrand.sortContainsBrand(search, source, brand) - SortContainsCategory.getScore(search,source,category)
                -BonusScoreForNumber.getScore(search,source);
        return resultValue;
    }
}
