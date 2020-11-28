package org.stepik.lesson14;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_14_6 {
    /*
     * Вопрос:
     *
     * Write a program that reads key-value pairs and outputs pairs whose keys belongs to the specified range (inclusive) in the ascending order by the key.
     * Input data format
     *
     * The first line contains two values - range borders. The second line contains the number of key-value pairs. Next lines contain pair (an integer key and a string value separated by a space).
     *
     * Output data format
     *
     * All pairs whose keys belong to the range. Each pair in a new line. The key and the value of a pair must be separated by a space.
     * Sample Input:
     *
     * 2 4
     * 5
     * 1 aa
     * 5 ee
     * 2 bb
     * 4 dd
     * 3 cc
     * Sample Output:
     *
     * 2 bb
     * 3 cc
     * 4 dd
     *
     * Ответ: см.ниже
     * */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SortedMap<Integer, String> map = new TreeMap<>();
        int fromKey = scan.nextInt();
        int toKey = scan.nextByte();
        int numberOfPairs = scan.nextInt();
        for (int i = 0; i < numberOfPairs; i++) {
            int key = scan.nextInt();
            String value = scan.next();
            map.put(key, value);
        }
        SortedMap<Integer, String> subMap = map.subMap(fromKey, toKey + 1);
        subMap.forEach((k, v) -> System.out.printf("%d %s\n", k, v));
    }
}
