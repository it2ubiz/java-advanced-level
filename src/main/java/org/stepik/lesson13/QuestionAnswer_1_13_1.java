package org.stepik.lesson13;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_13_1 {
    /*
     * Вопрос:
     *
     * Create TreeSet by name set in any way known to you and fill it with the following three strings "Gamma", "Alpha", "Omega" .
     * The code for displaying the set is already written.
     *
     * Sample Input:
     *
     * Sample Output:
     *
     * [Alpha, Gamma, Omega]
     *
     * Ответ: см.ниже
     * */

    public static void main(String[] args) {
        Set set = new TreeSet();
        set.add("Alpha");
        set.add("Gamma");
        set.add("Omega");
        System.out.println(set);
    }
}
