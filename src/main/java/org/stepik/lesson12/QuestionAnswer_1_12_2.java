package org.stepik.lesson12;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_12_2 {
    /*
     * Вопрос:
     *
     * There is a queue of 4 elements. Put in it one more element - the number 5, and then get 2 items out of the queue.
     * Sample Input:
     *
     * Sample Output:
     *
     * [3, 4, 5]
     *
     * Ответ: см.ниже
     * */

    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4));
        queue.removeFirst();
        queue.removeFirst();
        queue.addLast(5);
        System.out.println(queue);
    }
}
