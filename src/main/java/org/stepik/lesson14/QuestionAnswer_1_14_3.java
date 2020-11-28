package org.stepik.lesson14;

import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_14_3 {
    /*
     * Вопрос:
     *
     * When Anthony read "War and Peace", he wondered how many words and how much of them were used in this book.
     * Help Anthony to write a simplified version of a program that can count the words, separated by a space and output the resulting statistics.
     *
     * The program must read one line from the standard input and for each unique word in this line output the count of its repeated occurrence (case insensitive) in the "word amount" format (see the output example).
     *
     * The order of words output may be arbitrary. Each unique word must appear in the output only once.
     *
     * Sample Input:
     *
     * a aa abC aa ac abc bcd a
     * Sample Output:
     *
     * a 2
     * aa 2
     * abc 2
     * ac 1
     * bcd 1
     *
     * Ответ: см.ниже
     * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        SortedMap<String, Integer> map = new TreeMap<>();
        for (String word : line) {
            String i = word.toLowerCase();
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (Map.Entry<String, Integer> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
