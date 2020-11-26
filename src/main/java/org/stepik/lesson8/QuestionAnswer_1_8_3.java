package org.stepik.lesson8;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_8_3 {
    /*
     * Вопрос:
     * You have the abstract class Shape with two abstract methods: getPerimeter() and getArea(). See the provided code template.
     * You need to declare and implement three classes: Triangle, Rectangle and Circle. The classes must extend the Shape class and implement all abstract methods. To implement the methods the standard class Math may help you. Do not make your classes public.
     * The class Triangle must have a constructor with three double arguments for setting the length of each side. To calculate the area of this shape you may use the Heron's formula.
     * The class Rectangle must have a constructor with two double arguments for setting the length of different sides.
     * The class Circle must have a constructor with one double argument for setting the radius. You may use Math.PI as the PI constant or declare it yourself.
     *
     * Examples
     *
     * A circle has a radius = 10: perimeter = 62.831853..., area = 314.159265....
     * A triangle has three sides a = 3, b = 4 and c = 5: perimeter = 12.0, area = 6.0.
     * A rectangle has two different sides a = 5, b = 10: perimeter = 30.0, area = 50.0.
     *
     * Ответ: см.ниже
     * */

    abstract class Shape {

        abstract double getPerimeter();

        abstract double getArea();
    }

    class Circle extends Shape {
        private static final double PI = Math.PI;
        private double a;

        public Circle(double one) {
            this.a = one;
        }

        public double getPerimeter() {
            return 2 * PI * a;
        }

        public double getArea() {
            double rK2 = Math.pow(a, 2);
            return PI * rK2;
        }
    }

    class Rectangle extends Shape {
        private double a;
        private double b;

        public Rectangle(double one, double two) {
            this.a = one;
            this.b = two;
        }

        public double getPerimeter() {
            return (a + b) * 2;
        }

        public double getArea() {
            return a * b;
        }
    }

    class Triangle extends Shape {
        private double a;
        private double b;
        private double c;

        public Triangle(double one, double two, double thre) {
            this.a = one;
            this.b = two;
            this.c = thre;
        }

        public double getPerimeter() {
            return a + b + c;
        }

        public double getArea() {
            double pdiv2 = (a + b + c) / 2;
            return Math.sqrt(pdiv2 * ((pdiv2 - a) * (pdiv2 - b) * (pdiv2 - c)));
        }
    }
}
