package org.stepik.lesson14;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_14_1 {
    /*
     * Вопрос:
     *
     * Create TreeMap by name map in any way known to you and fill it with the following three key - value pairs:
     * Omega - 24
     * Alpha - 1
     * Gamma - 3
     *
     * where strings - keys and numbers - values.
     *
     * The code for displaying the map is already written.
     * Sample Input:
     *
     * Sample Output:
     *
     * {Alpha=1, Gamma=3, Omega=24}
     *
     * Ответ: см.ниже
     * */

    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("Gamma", 3);
        map.put("Omega", 24);
        map.put("Alpha", 1);
        System.out.println(map);
    }
}
