package org.stepik.lesson10;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_10_4 {
    /*
     * Вопрос:
     *
     * Generic pairs
     * Implement the generic class Pair which contains a pair of objects (of any types). The objects can be null.
     *
     * You should implement the methods getFirst(), getSecond(), equals() and hashCode() and the static method of() for creating instances as well. The constructor must be private.
     *
     * Be careful with nulls when implementing equals() and hashCode().
     *
     * If your class has been implemented correctly, the following code should be compiled and work successfully.
     *
     * Pair<Integer, String> pair = Pair.of(1, "hello");
     * Integer i = pair.getFirst(); // 1
     * String s = pair.getSecond(); // "hello"
     *
     * Pair<Integer, String> pair2 = Pair.of(1, "hello");
     * boolean mustBeTrue = pair.equals(pair2); // true!
     * boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
     * Do not change the access modifier of the class Pair.
     *
     * Ответ: см.ниже
     * */

    static class Pair<A, B> {
        private A first;
        private B second;

        public Pair(A first, B second) {
            super();
            this.first = first;
            this.second = second;
        }

        public static <A, B> Pair<A, B> of(A first, B second) {
            return new Pair<A, B>(first, second);
        }

        public int hashCode() {
            int hashFirst = first != null ? first.hashCode() : 0;
            int hashSecond = second != null ? second.hashCode() : 0;

            return (hashFirst + hashSecond) * hashSecond + hashFirst;
        }

        public boolean equals(Object other) {
            if (other instanceof Pair) {
                Pair otherPair = (Pair) other;
                return
                        ((this.first == otherPair.first ||
                                (this.first != null && otherPair.first != null &&
                                        this.first.equals(otherPair.first))) &&
                                (this.second == otherPair.second ||
                                        (this.second != null && otherPair.second != null &&
                                                this.second.equals(otherPair.second))));
            }
            return false;
        }

        public A getFirst() {
            return first;
        }

        public B getSecond() {
            return second;
        }
    }

}
