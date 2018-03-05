public class FirstMethodCompare {

    public FirstMethodCompare() {

    }


    public Integer compareRusNames(String search, String istochnik) {
        Integer resultScore = 0;
        char[] searchSymbols = search.toCharArray();
        char[] istochnickSymbols = istochnik.toCharArray();
        for (int i = 0; i < searchSymbols.length; i++) {
            for (int j = 0; j < istochnickSymbols.length; j++) {
                if (searchSymbols[i] == istochnickSymbols[j] && i == j) {
                    resultScore = resultScore + 50;
                } else if (Character.toUpperCase(searchSymbols[i]) == Character.toUpperCase(istochnickSymbols[j]) && i == j) {
                    resultScore = resultScore + 40;
                } else if (searchSymbols[i] == istochnickSymbols[j]) {
                    resultScore = resultScore + 30;
                } else if (Character.toUpperCase(searchSymbols[i]) == Character.toUpperCase(istochnickSymbols[j])) {
                    resultScore = resultScore + 20;
                } else if (searchSymbols[i] != istochnickSymbols[j] && i == j) {
                    resultScore = resultScore - 10;
                } else if (Character.toUpperCase(searchSymbols[i]) == Character.toUpperCase(istochnickSymbols[j]) && i == j) {
                    resultScore = resultScore - 5;
                }
            }
        }
        return resultScore;

    }
}
