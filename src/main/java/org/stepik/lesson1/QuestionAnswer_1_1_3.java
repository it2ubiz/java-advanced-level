package org.stepik.lesson1;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_1_3 {
    /*
     * Вопрос:
     *
     * Реализуйте класс Application.
     * В классе должны быть: строковое поле, которое содержит имя экземпляра приложения;
     * публичный конструктор с единственным аргументом - именем приложения.
     * Этот аргумент следует присвоить соответствующему полю; запуск метода, который принимает массив строк.
     * Метод должен вывести имя приложения, а затем все аргументы, каждый в новой строке.
     * Есть готовый шаблон для вашего класса. Не делайте класс публичным.
     * Пример вывода после вызова метода run:
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
