package org.stepik.lesson12;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_12_5 {
    /*
     * Вопрос:
     *
     * Write a program that reads numbers and stores them to a deque. An even number should be added as the first element, an odd number - as the last. After, the program must output all elements from the first to the last.
     * The first string contains the number of elements. Each line followed the first one contains an element.
     * Sample Input:
     *
     * 4
     * 1
     * 2
     * 3
     * 4
     * Sample Output:
     *
     * 4
     * 2
     * 1
     * 3
     * Ответ: см.ниже
     * */

    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                queue.addFirst(number);
            } else {
                queue.addLast(number);
            }
        }
        for (int number : queue) {
            System.out.println(number);
        }
    }
}
