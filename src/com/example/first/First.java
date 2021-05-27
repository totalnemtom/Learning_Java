package com.example.first;

public class First {

    public static void main(String[] args) {
        String result = censor("a barom nagyon aranyos barom", "barom", "***");
        System.out.println(result);

        Human firstHuman = new Human();
        Human secondHuman = new Human();

        firstHuman.setName("Gyula");
        System.out.println(firstHuman.printName());
        System.out.println(secondHuman.printName());

    }

    static String censor(String txt, String toChange, String newWord){
        String toReturn = txt.replaceAll(toChange,newWord);

        return toReturn;
    }
}
