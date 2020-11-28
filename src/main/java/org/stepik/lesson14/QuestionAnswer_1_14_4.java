package org.stepik.lesson14;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_14_4 {
    /*
     * Вопрос:
     *
     * The simplest spell checker is based on a list of known words. Every word in the checked text is searched for in this list and, if such a word was not found, it is marked as erroneous.
     * Write this spell checker.
     *
     * The first line of the input contains dd – number of records in the list of known word. Next go dd lines contain one known word per line, next — the number ll of lines of the text, after which — ll lines of the text.
     *
     * Write a program that outputs those words from the text, which are not found in the dictionary (i.e. erroneous). Your shell checker should be case insensitive. The words are entered in an arbitrary order. Words, which are not found in the dictionary, should not be duplicated in the output.
     *
     * Sample Input:
     *
     * 3
     * a
     * bb
     * cCc
     * 2
     * a bb aab aba ccc
     * c bb aaa
     * Sample Output:
     *
     * aaa
     * aab
     * c
     * aba
     * Ответ: см.ниже
     * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        ArrayDeque<String> dictionary = new ArrayDeque<>();
        ArrayDeque<String> words = new ArrayDeque<>();
        scanner.nextLine();
        for (int i = 0; i < size; i++) {
            dictionary.add(scanner.nextLine().toLowerCase());
        }
        int lineCount = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < lineCount; i++) {
            String[] currentLine = scanner.nextLine().toLowerCase().split(" ");
            for (String j : currentLine) {
                if (!words.contains(j)) {
                    words.add(j);
                }
            }
        }
        words.removeAll(dictionary);
        for (String i : words) {
            System.out.println(i);
        }
    }
}
