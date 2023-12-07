package com.teachmeskills.lesson_11.task_3;

import com.teachmeskills.lesson_11.task_3.service.Utils;

import java.util.Scanner;

/**
 * Дана произвольная строка.
 * Вывести на консоль новую строку, которой задублирована каждая буква из
 * начальной строки.
 * Например, "Hello" -> "HHeelllloo".
 */

public class Runner {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();

        Utils.duplicateLetters(str);

    }

}
