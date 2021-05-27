package com.example.first;


public class First {

    public static void main(String[] args) {
        String result = censor("a barom nagyon aranyos barom", "barom", "***");
        System.out.println(result);

        Human firstHuman = new Human();
        Human secondHumanWhoIsEnglish = new EnglishMan();
        secondHumanWhoIsEnglish.setName("Lajos");

        String isFristHumanHasName = firstHuman.printName();
        String isSecondHumanHasName = secondHumanWhoIsEnglish.printName();

        System.out.println(isFristHumanHasName);
        System.out.println(isSecondHumanHasName);

    }

    static String censor( String txt, String toChange, String newWord){
        String toReturn = txt.replaceAll(toChange,newWord);

        return toReturn;
    }
}
