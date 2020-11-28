package org.stepik.lesson12;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_12_8 {
    /*
     * Вопрос:
     *
     * Write a program simulating a stack that can effectively return the current max element. Your program should read a sequence of commands of different types from the standard input.
     * There are three types of commands:
     *
     * push v - add an element (v) to a top of the stack;
     * pop - remove the top element of the stack;
     * max - return the current max in the stack.
     * The time complexity of these operations should not depend on the stack size (constant time, O(1)).
     *
     * Hint: you may use several standard stacks to write a solution.
     *
     * Input data format
     *
     * The first line contains the number of commands. Next lines contain one of the following commands: push v, pop, max.
     *
     * Output data format
     *
     * The program must output the current max for each command max.
     *
     * Sample Input:
     *
     * 5
     * push 2
     * push 1
     * max
     * pop
     * max
     * Sample Output:
     *
     * 2
     * 2
     *
     * Ответ: см.ниже
     * */


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Deque<Integer> q = new ArrayDeque<>();
        Deque<Integer> w = new ArrayDeque<>();
        int count = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            String[] str = scanner.nextLine().trim().split("\\s");
            if (str[0].equals("push")) {
                int v = Integer.parseInt(str[1]);
                q.push(v);
                if (v > count) {
                    w.push(v);
                    count = v;
                } else {
                    w.push(count);
                }
            } else if (str[0].equals("pop")) {
                q.pop();
                w.pop();
                count = w.peek();
            } else if (str[0].equals("max")) {
                System.out.println(w.peek());
            }
        }
    }
}
