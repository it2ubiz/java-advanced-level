package org.stepik.lesson14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_14_5 {
    /*
     * Вопрос:
     *
     * At some point in the Bioinformatics Institute, biology students no longer understood what did the computer science students said: they spoke a strange set of sounds.
     * And one of the biologists had suddenly discovered the secret of computer science students: they used the substitution cipher in their communication, i.e. they replaced each symbol of the initial message to the corresponding another symbol. Biologists gained the key to the cipher and now they need help:
     *
     * Write a program that can encode and decode the substitution cipher. The program accepts two input strings of the same length; the first line contains the characters of the original alphabet, the second line - the symbols of a resulting alphabet, then goes a line you need to encode by the transmitted key, and another line to be decrypted.
     *
     * For example, the program takes the following input:
     * abcd
     * *d%#
     * abacabadaba
     * #*%*d*%
     * It means that symbol a of the initial message is changed to symbol * in the cipher, b changed to d, c — to% and d — to #. You need to encode the string abacabadaba and decode the string #*%*d*% using this cipher. So you get the following lines, which you should be the output of the program:
     *
     * *d*%*d*#*d*
     * dacabac
     * Sample Input:
     *
     * abcd
     * *d%#
     * abacabadaba
     * #*%*d*%
     * Sample Output:
     *
     * *d*%*d*#*d*
     * dacabac
     *
     * Ответ: см.ниже
     * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] original = scanner.nextLine().toCharArray();
        char[] secretKey = scanner.nextLine().toCharArray();
        char[] encryption = scanner.nextLine().toCharArray();
        char[] decrypt = scanner.nextLine().toCharArray();
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < original.length; i++) {
            map.put(original[i], secretKey[i]);
        }
        for (char value : encryption) {
            System.out.print(map.get(value));
        }
        System.out.println("");
        for (char c : decrypt) {
            for (Object key : map.keySet()) {
                if (map.get(key).equals(c)) {
                    System.out.print(key);
                }
            }
        }
    }
}
