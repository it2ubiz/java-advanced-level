package org.stepik.lesson11;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_11_4 {
    /*
     * Вопрос:
     * The list of GreekLetter objects is given.
     * List<GreekLetter> letterList = new ArrayList<>();
     * Convert it to the object array by name objArray.
     *
     * The code for displaying the array is already written.
     * Sample Input:
     *
     * Sample Output:
     *
     * {letter='Gamma', position=3}
     * {letter='Omega', position=24}
     * {letter='Alpha', position=1}
     *
     * Ответ: см.ниже
     * */

    public static void main(String[] args) {

        List<GreekLetter> letterList = new ArrayList<>();
        letterList.add(new GreekLetter("Gamma", 3));
        letterList.add(new GreekLetter("Omega", 24));
        letterList.add(new GreekLetter("Alpha", 1));

        Object[] objArray = letterList.toArray();

        for (Object o : objArray) {
            System.out.println(o);
        }
    }

    static class GreekLetter {

        private String letter;
        private Integer position;

        public GreekLetter(String letter, Integer position) {
            this.letter = letter;
            this.position = position;
        }

        @Override
        public String toString() {
            return "{" +
                    "letter='" + letter + '\'' +
                    ", position=" + position +
                    '}';
        }
    }
}
