package org.stepik.lesson12;

import java.util.ArrayDeque;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_12_1 {
    /*
     * Вопрос:
     *
     * Create ArrayDeque by name queue in any way known to you and push the following four numbers 2, 0, 1, 7.
     * The code for displaying the queue is already written.
     * Sample Input:
     *
     * Sample Output:
     *
     * [2, 0, 1, 7]
     *
     * Ответ: см.ниже
     * */

    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
        queue.add(2);
        queue.add(0);
        queue.add(1);
        queue.add(7);
        System.out.println(queue);
    }
}
