public class Main {
    public static void main(String [] args){
        /*
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
        */
        firstGoodTest();
        lastProductTest();
    }

    public static void firstGoodTest(){

        FirstMethodCompare firstMethodCompare = new FirstMethodCompare();

        String source = "Увлажнитель воздуха Supra HDS-205 grey";

        String rightV1 = "Увлажнитель воздуха Supra НDS-205 grey";

        String rightV2 = "Увлажнитель воздуха Supra HDS-205 grеy";

        String rightV3 = "Увлажнитель воздуха Supra HDS 205 grey";

        String rightV4 = "Увлажнитель воздуха Supra HDS205 grey";

        String rightV5 = "Увлажнитель воздуха Supra HDS/205 grey";

        String rightV6 = "Supra HDS-205 grey";

        String anotherPr = "Увлажнитель воздуха Supra MBT-125 grey";

        String anotherPr2 = "Увлажнитель воздуха Supra НDS-205 black";

        String anotherPr3 = "Увлажнитель  Supra HDS/205 grey";

        Integer right1Score =  firstMethodCompare.compareRusNames(rightV1,source);

        Integer right2Score = firstMethodCompare.compareRusNames(rightV2,source);

        Integer right3Score = firstMethodCompare.compareRusNames(rightV3,source);

        Integer right4Score= firstMethodCompare.compareRusNames(rightV4,source);

        Integer right5Score = firstMethodCompare.compareRusNames(rightV5,source);

        Integer right6Score = firstMethodCompare.compareRusNames(rightV6, source);

        Integer notRight1Score = firstMethodCompare.compareRusNames(anotherPr,source);

        Integer notRight2Score = firstMethodCompare.compareRusNames(anotherPr2,source);

        Integer notRight3Score = firstMethodCompare.compareRusNames(anotherPr3,source);

        System.out.println(right1Score.toString());
        System.out.println(right2Score.toString());
        System.out.println(right3Score.toString());
        System.out.println(right4Score.toString());
        System.out.println(right5Score.toString());
        System.out.println(right6Score.toString());
        System.out.println("not right:");
        System.out.println(notRight1Score.toString());
        System.out.println(notRight2Score.toString());
        System.out.println(notRight3Score.toString());

        String categoryName = "Увлажнители воздуха";
        String brandName = "Supra";
        System.out.println("new score:");
        System.out.println(Score.getScore(rightV1,source,brandName,categoryName));
        System.out.println(Score.getScore(rightV6,source,brandName,categoryName).toString());
        System.out.println(Score.getScore(anotherPr,source,brandName,categoryName).toString());
    }

    public static void lastProductTest(){
        System.out.println("Last product test: ");
        String source = "Ультразвуковой увлажнитель Cooper&Hunter CH-800-1 BD";
        String brand = "Cooper Hunter";
        String category = "Ультразвуковые увлажнители";
        String rightName1 = "Ультразвуковой увлажнитель Cooper&Hunter CH-800-1 (BD)";
        String rightName2="Ультразвуковой увлажнитель Cooper&Hunter CH-8OO-1 (BD)";
        String rightName3 = "Увлажнитель Cooper Hunter CH-800-1 (BD)";


        String falseName1 = "Ультразвуковой увлажнитель Cooper&Hunter CH-820-1 (BD)";
        String falseName2 = "Ультразвуковой увлажнитель Cooper&Hunter CH-8OO-1 (CA)";
        String falseName3="Увлажнитель Cooper  CH-810-1 (BD)";

        Integer score1Right = Score.getScore(rightName1,source,brand,category);
        Integer score2Right=Score.getScore(rightName2,source,brand,category);
        Integer score3Right=Score.getScore(rightName3,source,brand,category);

        Integer score1False = Score.getScore(falseName1,source,brand,category);
        Integer score2False = Score.getScore(falseName2,source,brand,category);
        Integer score3False = Score.getScore(falseName3,source,brand,category);

        System.out.println(score1Right.toString());
        System.out.println(score2Right.toString());
        System.out.println(score3Right.toString());
        System.out.println("False: " );
        System.out.println(score1False.toString());
        System.out.println(score2False.toString());
        System.out.println(score3False.toString());
    }

}
