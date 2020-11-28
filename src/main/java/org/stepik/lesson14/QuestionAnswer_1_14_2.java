package org.stepik.lesson14;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_14_2 {
    /*
     * Вопрос:
     *
     *
     * The map is given. Output each its key-value pair in the loop with a new line.
     * Each line must be in form of key=value (for example, Gamma=3)
     * Sample Input:
     *
     * Sample Output:
     *
     * Alpha=1
     * Gamma=3
     * Omega=24
     *
     * Ответ: см.ниже
     * */

    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("Gamma", 3);
        map.put("Omega", 24);
        map.put("Alpha", 1);
        for (String key : map.keySet())
            System.out.println(key + "=" + map.get(key));
    }
}
