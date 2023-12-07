package com.teachmeskills.lesson_11.task_2;

import com.teachmeskills.lesson_11.task_2.service.Utils;

import java.util.Scanner;

/**
 * Дана строка произвольной длины с произвольными словами.
 * Найти самое короткое слово в строке и вывести его на экран.
 * Найти самое длинное слово в строке и вывести его на экран.
 * Если таких слов несколько, то вывести последнее из них.
 */

public class Runner {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();

        Utils.showWords(str);

    }

}
