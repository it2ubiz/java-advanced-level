package org.stepik.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_11_3 {
    /*
     * Вопрос:
     * The list of strings is given.
     * List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
     * Output each its element in the loop. Each element must be in new line.
     *
     * Sample Input:
     *
     * Sample Output:
     *
     * Mr.Green
     * Mr.Yellow
     * Mr.Red
     *
     * Ответ: см.ниже
     * */

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        String[] strArray = nameList.toArray(new String[0]);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
    }
}
