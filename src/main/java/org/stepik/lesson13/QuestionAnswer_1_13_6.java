package org.stepik.lesson13;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_13_6 {
    /*
     * Вопрос:
     *
     * Write a program that reads a sequence of strings from the standard input and displays them in a lexicographic order without duplicates.
     * Try to write your solution using a set.
     *
     * Input data format
     *
     * The first line contains the size of a string sequence. Next lines contain strings.
     *
     * Output data format
     *
     * A sorted sequence of strings without duplicates. Each string must be in a new line.
     *
     * Sample Input:
     *
     * 6
     * postgres
     * sqlite
     * oracle
     * mongodb
     * postgres
     * mssql
     * Sample Output:
     *
     * mongodb
     * mssql
     * oracle
     * postgres
     * sqlite
     *
     * Ответ: см.ниже
     * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        int size = sc.nextInt();
        Set<String> nameSet = new TreeSet<>();
        for (int i = 0; i <= size; i++) {
            word = sc.nextLine();
            nameSet.add(word);
        }
        Iterator iterator = nameSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
