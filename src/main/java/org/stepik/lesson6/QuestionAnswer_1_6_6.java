package org.stepik.lesson6;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_6_6 {
    /*
     * Вопрос:
     * You have four classes: Animal, Cat, Dog and Duck. The class animal has a method say(). The method do nothing.
     *
     * Override the method in all subclasses. Overridden methods should output what these animals say (using System.out.println).
     *
     * Cat: meow-meow
     * Dog: arf-arf
     * Duck: quack-quack
     *
     * Ответ: см.ниже
     * */

    class Animal {
        public void say() {
        }
    }

    class Cat extends Animal {
        @Override
        public void say() {
            System.out.println("meow-meow");
        }

    }

    class Dog extends Animal {
        @Override
        public void say() {
            System.out.println("arf-arf");
        }
    }

    class Duck extends Animal {
        @Override
        public void say() {
            System.out.println("quack-quack");
        }

    }
}
