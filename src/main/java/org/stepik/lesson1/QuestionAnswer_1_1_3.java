package org.stepik.lesson1;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_1_3 {
    /*
     * Вопрос:
     *
     * Implement a class Application.
     *
     * The class should has:
     * a string field which contains the name of the application instance;
     * a public constructor with single argument - application name.
     * This argument should be assigned to the corresponding field;
     * a method run that takes array of strings.
     * The method should output the name of the application and then all arguments, each in a new line.
     *
     * There is a prepared template for your class. Do not make the class public.
     * An output example after calling the run method:
     *
     * SimpleApplication
     * arg1
     * arg2
     * arg3
     *
     * Ответ: см.ниже
     * */

    class Application {

        String name;

        Application(String word) {
            this.name = word;
        }

        public void run(String[] args) {
            System.out.println(name);
            for (String arg : args) {
                System.out.println(arg);
            }
        }
    }
}
