public class Score {
    public static Integer getScore(String search, String source, String brand, String category) {
        FirstMethodCompare firstMethodCompare = new FirstMethodCompare();
        Integer resultValue = 0;
        resultValue = firstMethodCompare.compareRusNames(search, source)
                + BonusScoreForNumber.getScore(search, source)
                + MonolitScore.getScore(search, source)
                + DeleterSpamInfo.getBonusForSpam(source, brand, category);

        return resultValue;
    }
}
