import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeleterSpamInfo {

    public static Integer getBonusForSpam(String source,String brand,String category){
        Integer result = detectedSpam(source, brand, category);
        System.out.println(result.toString());
        return result;
    }
    private static Integer detectedSpam(String source, String brand, String category) {
        char[] brandArray = brand.toUpperCase().toCharArray();
        for (int i = brandArray.length; i > 1; i--) {
            char[] matchArray = new char[i];
            for (int j = 0; j < matchArray.length; j++) {
                matchArray[j] = brandArray[j];
            }
            boolean flag = matcher(source, matchArray.toString());
            if (flag) {
                System.out.println("Looking here:" + matchArray.length);
                return matchArray.length;
            }

        }
        return 0;
    }

    private static boolean matcher(String source, String match) {
        Pattern p = Pattern.compile("^" + source + "$");
        Matcher m = p.matcher(match);
        return m.matches();
    }
}
