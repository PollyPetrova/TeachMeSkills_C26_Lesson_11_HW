package com.teachmeskills.lesson_11.task_3.service;

public class Utils {

    public static void duplicateLetters(String str){
        StringBuilder result=new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char letter=str.charAt(i);
            result.append(letter);
            result.append(letter);
        }
        System.out.println(result);
    }

}
