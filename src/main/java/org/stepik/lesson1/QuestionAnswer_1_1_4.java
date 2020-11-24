package org.stepik.lesson1;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_1_4 {
    /*
     * Вопрос:
     * У вас есть класс GeometricCube с конструктором с тремя аргументами:
     * public GeometricCube(int width, int height, int length)
     *
     * Напишите программу, которая считывает ширину, высоту и длину, создает экземпляр с именем cube и выводит результат cube.toString ().
     *
     * Используйте предоставленный шаблон, не меняйте его!
     *
     * Ответ: см.ниже
     * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int length = scanner.nextInt();
        GeometricCube cube = new GeometricCube(width, height, length);
        System.out.println(cube.toString());
    }

    static class GeometricCube {
        private int width;
        private int height;
        private int length;

        public GeometricCube(int width, int height, int length) {
            this.width = width;
            this.height = height;
            this.length = length;
        }

        @Override
        public String toString() {
            return "Cube(" +
                    "w=" + width +
                    ", h=" + height +
                    ", l=" + length + ')';
        }
    }
}