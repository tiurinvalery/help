public class Main {
    public static void main(String [] args){
        FirstMethodCompare firstMethodCompare = new FirstMethodCompare();
        String source = "АЛЬФА БАНК";
        String firstVariant = "Фа Банк";
        String secondVariant="АЛЬФА БАНК";
        String thirdVariand = "альфа банк";
        String fourthVariant="АЛЬФАБАНК";

        Integer score1 = firstMethodCompare.compareRusNames(firstVariant,source);
        Integer score2 = firstMethodCompare.compareRusNames(secondVariant,source);
        Integer score3 = firstMethodCompare.compareRusNames(thirdVariand,source);
        Integer score4=firstMethodCompare.compareRusNames(fourthVariant,source);
        System.out.println(score1.toString());
        System.out.println(score2.toString());
        System.out.println(score3.toString());
        System.out.println(score4.toString());

        String rozetkaPhone = "Samsung Galaxy J3 2016 J320H/DS Black";
        String citrusRight = "Samsung J320H Galaxy J3 (2016) Black";
        String citrusAnothreColor = "Samsung J320H Galaxy J3 (2016) Gold";

        Integer scoreR = firstMethodCompare.compareRusNames(citrusRight,rozetkaPhone);
        Integer scoreA = firstMethodCompare.compareRusNames(citrusAnothreColor,rozetkaPhone);
        System.out.println(scoreR.toString());
        System.out.println(scoreA.toString());
    }
}
