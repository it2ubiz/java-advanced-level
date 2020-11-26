package org.stepik.lesson9;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_9_3 {
    /*
     * Вопрос:
     * Given the classComplexNumber. Override its methods equals() and hashCode(). The method equals() should compare two instances of ComplexNumber by the fields re and im. The method hashCode() must be consistent with your implementation of equals().
     * Implementation of the method hashCode() returning a constant or not considering a fractional part of re and im, will not be accepted.
     *
     * Example
     *
     * ComplexNumber a = new ComplexNumber(1, 1);
     * ComplexNumber b = new ComplexNumber(1, 1);
     * // a.equals(b) must return true
     * // a.hashCode() must be equal to b.hashCode()
     *
     * Hint 1. Find a static method in the class java.lang.Double that will help in solving this quiz.
     *
     * Hint 2. If you can't solve this quiz anyway, you can use a modern IDE (such as Intellij Idea) for automatically generating correct equals() and hashCode(). But in this case, you need to understand what is generated and why it works.
     *
     * Ответ: см.ниже
     * */

    public final class ComplexNumber {
        private final double re;
        private final double im;

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ComplexNumber that = (ComplexNumber) o;
            return Double.compare(that.re, re) == 0 &&
                    Double.compare(that.im, im) == 0;
        }

        @Override
        public int hashCode() {

            return java.util.Objects.hash(re, im);
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }
    }
}
