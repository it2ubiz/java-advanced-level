package org.stepik.lesson12;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_12_4 {
    /*
     * Вопрос:
     *
     * Write a program that reads the input elements and outputs them in the reverse order.
     * The first string contains the number of elements. Each line followed the first one contains an element.
     * Sample Input:
     *
     * 3
     * 1
     * 2
     * 3
     * Sample Output:
     *
     * 3
     * 2
     * 1
     *
     * Ответ: см.ниже
     * */

    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            queue.add(sc.nextInt());
        }
        Iterator<Integer> integerIterator = queue.descendingIterator();
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }
    }
}
