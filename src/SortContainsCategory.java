public class SortContainsCategory {
    public static Integer getScore(String search, String source, String category) {
        char[] searchArray = search.toCharArray();
        char[] sourceArray = source.toCharArray();
        char[] categoryArray = category.toCharArray();
        Integer resultScore = 0;
        for (int i = 0; i < searchArray.length; i++) {
            for (int j = 0; j < sourceArray.length; j++) {
                for (int k = 0; k < categoryArray.length; k++) {
                    if ((searchArray[i] == sourceArray[j] && categoryArray[k] == sourceArray[j]) && i == j && k == j) {
                        resultScore = resultScore + 7;
                    } else if ((searchArray[i] == sourceArray[j] && categoryArray[k] == sourceArray[j]) && i == j || k == j) {
                        resultScore = resultScore + 6;
                    } else if ((Character.toUpperCase(searchArray[i]) == Character.toUpperCase(sourceArray[j]) && Character.toUpperCase(categoryArray[k]) == Character.toUpperCase(sourceArray[j])) && i == j && k == j) {
                        resultScore = resultScore + 5;
                    } else if ((Character.toUpperCase(searchArray[i]) == Character.toUpperCase(sourceArray[j]) && Character.toUpperCase(categoryArray[k]) == Character.toUpperCase(sourceArray[j])) && i == j || k == j) {
                        resultScore = resultScore + 4;
                    } else if (searchArray[i] == sourceArray[j] && categoryArray[k] == sourceArray[j]) {
                        resultScore = resultScore + 3;
                    } else if (Character.toUpperCase(searchArray[i]) == Character.toUpperCase(sourceArray[j]) && Character.toUpperCase(categoryArray[k]) == Character.toUpperCase(sourceArray[j])) {
                        resultScore = resultScore + 2;
                    } else if (Character.toUpperCase(categoryArray[k]) == Character.toUpperCase(sourceArray[j])) {
                        resultScore = resultScore + 1;
                    }
                }
            }
        }
        return resultScore;
    }
}

