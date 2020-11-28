package org.stepik.lesson12;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_12_7 {
    /*
     * Вопрос:
     *
     * Write a program that implements a simple load balancer.
     * The program must read tasks from the standard input and distribute them between two queues. Tasks will be processed by a system (in future). Each task has a unique identifier and a number indicating the load on the system (in parrots).
     *
     * The balancer should distribute tasks between queues by the following rule - the task is added to the lower-load queue (by the total load). If both queues have the same total load indicator, the task must be added to the first queue.
     *
     * It's guaranteed, the input data contain at least two tasks.
     *
     * Input data format
     *
     * The first line contains the number of tasks. Other lines consist of task descriptions - an identifier and a load indicator (separated by a space).
     *
     * Output data form
     *
     * The first line should contain identifiers of tasks in the first queue, the second line - in the second queue.
     * Sample Input:
     *
     * 6
     * 1 1
     * 2 1
     * 3 1
     * 4 3
     * 5 1
     * 6 1
     * Sample Output:
     *
     * 1 3 5 6
     * 2 4
     *
     * Ответ: см.ниже
     * */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfLines = scan.nextInt();
        Queue<Integer> q1 = new ArrayDeque<>();
        Queue<Integer> q2 = new ArrayDeque<>();
        int load1 = 0;
        int load2 = 0;
        for (int i = 0; i < numberOfLines; i++) {
            int id = scan.nextInt();
            int load = scan.nextInt();
            if (load1 > load2) {
                q2.offer(id);
                load2 += load;
            } else {
                q1.offer(id);
                load1 += load;
            }
        }
        while (!q1.isEmpty()) {
            System.out.print(q1.remove() + " ");
        }
        System.out.println();
        while (!q2.isEmpty()) {
            System.out.print(q2.remove() + " ");
        }

    }
}
