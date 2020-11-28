package org.stepik.lesson13;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_13_2 {
    /*
     * Вопрос:
     *
     * The set of strings is given.
     * Set<String> nameSet = new TreeSet<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
     *
     * Output each its element in the loop with a new line.
     * Sample Input:
     *
     * Sample Output:
     *
     * Mr.Green
     * Mr.Red
     * Mr.Yellow
     *
     * Ответ: см.ниже
     * */

    public static void main(String[] args) {
        Set<String> nameSet = new TreeSet<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        for (String name : nameSet)
            System.out.println(name);
    }
}
