package org.stepik.lesson11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_11_7 {
    /*
     * Вопрос:
     * Given a sequence of strings separated by spaces. Read the sequence from the standard input and store all strings to the list. Output the list to the standard output using System.out.println(yourList). The order of elements must be the same as in the input.
     * Sample Input:
     *
     * Google Oracle JetBrains
     * Sample Output:
     *
     * [Google, Oracle, JetBrains]
     *
     * Ответ: см.ниже
     * */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> myList = new ArrayList<>();

        while (scan.hasNext())
            myList.add(scan.next());

        System.out.println(myList);
    }
}
