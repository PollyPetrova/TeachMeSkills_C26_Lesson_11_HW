package com.teachmeskills.lesson_11.task_1.service;

public class Utils {

    public static void showTwoBlocks(String documentNumber){
        String[] block=documentNumber.split("-");
        for (int i = 0; i < block.length-1; i=i+2) {
            System.out.print(block[i]+" ");
        }
    }


    public static void changeLettersWithSymbols(String documentNumber){
        String[] block=documentNumber.split("-");
        for (int i = 1; i < block.length; i=i+2) {
            block[i]="***";
        }
        for (int i = 0; i < block.length; i++) {
            if(i<block.length-1){
                System.out.print(block[i]+"-");
            }else {
                System.out.print(block[i]);
            }
        }
    }

    public static void showOnlyLetters(String documentNumber){
        String[] block=documentNumber.toLowerCase().split("-");
        for (int i = 1; i < block.length; i=i+2){
            System.out.print(block[i]+"/");
        }
        System.out.print(documentNumber.toLowerCase().charAt(19)+"/"+documentNumber.toLowerCase().charAt(21));
    }

    public static void changeLettersToUpperCase(String documentNumber){
        System.out.print("Letters: ");
        StringBuilder letters=new StringBuilder();
        String[] block=documentNumber.toUpperCase().split("-");
        for (int i = 1; i < block.length; i=i+2){
            letters.append(block[i]);
            letters.append("/");
        }
        letters.append(documentNumber.charAt(19));
        letters.append("/");
        letters.append(documentNumber.charAt(21));

        System.out.println(letters);
    }

    public static void isContain(String documentNumber){
        if(documentNumber.toLowerCase().contains("abc")){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void isStartWith(String documentNumber){
        if(documentNumber.startsWith("555")){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void isEndWith(String documentNumber){
        if(documentNumber.endsWith("1a2b")){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
