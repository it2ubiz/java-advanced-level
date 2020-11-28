package org.stepik.lesson16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_16_3 {
    /*
     * Вопрос:
     *
     * Given a table of integer numbers. You should rotate rows of the table by the specified distance.
     * Try to use collections and standard methods for them.
     *
     * Input data format
     *
     * The first line contains two numbers: a number of rows and a number of columns of the table.
     *
     * The following lines describe rows of the table. In each row, all elements are separated by spaces.
     *
     * The last line consists of one number - the distance for rotating.
     *
     * Output data format
     *
     * Output the resulting table. Separate numbers by a single space in the output.
     *
     * Sample Input:
     *
     * 3 3
     * 1 1 1
     * 2 2 2
     * 3 3 3
     * 1
     * Sample Output:
     *
     * 3 3 3
     * 1 1 1
     * 2 2 2
     *
     * Ответ: см.ниже
     * */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        List<String> list = new ArrayList<>();
        scan.nextLine();
        for (int i = 0; i < rows; i++) {
            list.add(scan.nextLine());
        }
        int rotateForInput = scan.nextInt();
        int rotateFor = rotateForInput % rows;
        List<String> tailList = list.subList(rows - rotateFor, rows);
        List<String> headList = list.subList(0, rows - rotateFor);
        List<String> newList = new ArrayList<>(tailList);
        newList.addAll(headList);
        for (String elem : newList) {
            System.out.println(elem);
        }
    }
}
