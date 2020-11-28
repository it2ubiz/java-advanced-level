package org.stepik.lesson16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_16_1 {
    /*
     * Вопрос:
     *
     * Write a program to sequentially swap elements by their indexes in a given list. Indexes of the elements start with 0 and always less than the size of the list.
     *
     * Try to use standard methods for processing collections.
     *
     * Input data format
     *
     * The first line contains elements of the list. The second line contains the number of swaps. Then follows the lines with descriptions of the swaps. Each line contains two numbers - indexes of swapped elements.
     *
     * Output data format
     *
     * All elements of the modified list separated by spaces must be output in one line.
     *
     * Sample Input:
     *
     * 1 2 3 4 5 6
     * 2
     * 0 1
     * 3 4
     * Sample Output:
     *
     * 2 1 3 5 4 6
     *
     * Ответ: см.ниже
     * */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputLine = scanner.nextLine().split(" ");
        ArrayList<String> outputList = new ArrayList<>(Arrays.asList(inputLine));
        int swapCount = scanner.nextInt();

        for (int i = 0; i < swapCount; i++) {
            int index1 = scanner.nextInt();
            int index2 = scanner.nextInt();
            Collections.swap(outputList, index1, index2);
        }
        for (String i : outputList) {
            System.out.print(i + " ");
        }
    }
}