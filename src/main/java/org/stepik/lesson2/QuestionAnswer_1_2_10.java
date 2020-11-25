package org.stepik.lesson2;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_2_10 {
    /*
     * Вопрос:
     * Implement a class named Cat with two instance fields: string name and int age, and one static int field counter. The static counter field allows you to known how many cats have been already created.
     *
     * The class should have a constructor for initializing the instance fields. During the initialization of a new cat, the static field should be incremented. If the counter > 5, the message "You have too many cats" must be printed out in the System.out.
     *
     * Also, you need to implement a static method getNumberOfCats. It should return the current numbers of created cats.
     *
     * Use the provided template, do not make the class public.
     *
     * Example. Let's assume seven instances of the class Cat have been already created, then the correct implemented method Cat.getNumberOfCats() should return 7 and the message "You have too many cats" has to appear twice.
     *
     * Ответ: см.ниже
     * */

    static class Cat {

        static int counter = 0;
        String name;
        int age;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;

            if (++counter > 5) {
                System.out.println("You have too many cats");
            }
        }

        public static int getNumberOfCats() {
            return counter;
        }
    }
}
