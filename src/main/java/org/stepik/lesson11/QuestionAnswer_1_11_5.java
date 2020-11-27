package org.stepik.lesson11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_11_5 {
    /*
     * Вопрос:
     * Write a program that reads the list of integer number separated by spaces from the standard input and then remove all numbers with even indexes (0, 2, 4, and so on). After, the program should output the result sequence in the reverse order.
     * Sample Input:
     *
     * 1 2 3 4 5 6 7
     * Sample Output:
     *
     * 6 4 2
     *
     * Ответ:
     * */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (scan.hasNextInt()) {
            list.add(scan.nextInt());
        }
        System.out.println();
        for (int i = list.size() - 1; i >= 0; i--) {
            if (i % 2 != 0) {
                System.out.print(list.get(i) + " ");
            }
        }
    }
}
