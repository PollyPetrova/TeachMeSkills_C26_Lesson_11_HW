package com.teachmeskills.lesson_11.task_2.service;

public class Utils {

    public static void showWords(String str){
        String[] strToFind=str.split(" ");
        String longestWord=strToFind[0];
        String shortestWord=strToFind[0];
        for (int i = 1; i < strToFind.length; i++) {
            if(longestWord.length()<=strToFind[i].length()){
                longestWord=strToFind[i];
            }
            if(shortestWord.length()>=strToFind[i].length()){
                shortestWord=strToFind[i];
            }
        }
        System.out.println("Longest word: "+ longestWord);
        System.out.println("The shortest word: "+ shortestWord);
    }

}
