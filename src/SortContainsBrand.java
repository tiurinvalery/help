public class SortContainsBrand {

    public static Integer sortContainsBrand(String search, String source, String brand) {
        char[] searchArray = search.toCharArray();
        char[] sourceArray = source.toCharArray();
        char[] brandArray = brand.toCharArray();
        Integer resultScore = 0;
        for (int i = 0; i < searchArray.length; i++) {
            for (int j = 0; j < sourceArray.length; j++) {
                for (int k = 0; k < brandArray.length; k++) {
                    if ((searchArray[i] == sourceArray[j] && brandArray[k] == sourceArray[j]) && i == j && k == j) {
                        resultScore = resultScore + 7;
                    } else if ((searchArray[i] == sourceArray[j] && brandArray[k] == sourceArray[j]) && i == j || k == j) {
                        resultScore = resultScore + 6;
                    }
                    else if((Character.toUpperCase(searchArray[i]) == Character.toUpperCase(sourceArray[j]) && Character.toUpperCase(brandArray[k]) == Character.toUpperCase(sourceArray[j])) && i == j && k == j) {
                        resultScore = resultScore + 5;
                    }
                    else if((Character.toUpperCase(searchArray[i]) == Character.toUpperCase(sourceArray[j]) && Character.toUpperCase(brandArray[k]) == Character.toUpperCase(sourceArray[j])) && i == j || k == j) {
                        resultScore = resultScore + 4;
                    }

                    else if (searchArray[i] == sourceArray[j] && brandArray[k] == sourceArray[j]) {
                        resultScore = resultScore + 3;
                    }
                    else if(Character.toUpperCase(searchArray[i]) == Character.toUpperCase(sourceArray[j]) && Character.toUpperCase(brandArray[k]) == Character.toUpperCase(sourceArray[j])) {
                        resultScore = resultScore + 2;
                    }
                   /* else if(Character.toUpperCase(brandArray[k]) == Character.toUpperCase(sourceArray[j])) {
                        resultScore = resultScore + 1;
                    }*/
                }
            }
        }
        return resultScore;
    }
}
