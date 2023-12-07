package com.teachmeskills.lesson_11.task_1;

import com.teachmeskills.lesson_11.task_1.service.Utils;

/**
 * Написать программу со следующим функционалом:
 * На вход передать строку (будем считать, что это некий стандартный номер документа в заданном формате).
 * Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это любая цифра, а y — это буква латинского алфавита (могут быть большие и маленькие).
 * 	- Вывести на экран в одну строку два первых блока по 4 цифры.
 * 	- Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
 * 	- Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
 * 	- Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder).
 * 	- Проверить содержит ли номер документа последовательность "abc" и вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
 * 	- Проверить начинается ли номер документа с последовательности 555.
 * 	- Проверить заканчивается ли номер документа на последовательность 1a2b.
 * Все эти методы реализовать в отдельном классе в статических методах, каждая задача - в отдельном методе.
 * Методы на вход (входным параметром) будут принимать вводимую на вход программы строку.
 */

public class Runner {

    public static void main(String[] args) {

        String documentNumber="5552-AbC-5896-Wsm-1a2b";

        Utils.showTwoBlocks(documentNumber);
        System.out.println();
        Utils.changeLettersWithSymbols(documentNumber);
        System.out.println();
        Utils.showOnlyLetters(documentNumber);
        System.out.println();
        Utils.changeLettersToUpperCase(documentNumber);
        Utils.isContain(documentNumber);
        Utils.isStartWith(documentNumber);
        Utils.isEndWith(documentNumber);

    }

}
