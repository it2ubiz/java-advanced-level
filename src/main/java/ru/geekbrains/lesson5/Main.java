package ru.geekbrains.lesson5;

/**
 * @author Zurbaevi Nika
 */
public class Main {
    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) {
        System.out.println("Execution time of the 1st method: " + firstMethod());
        System.out.println("Execution time of the 2st method: " + secondMethod());
    }

    private static long firstMethod() {
        float[] array = new float[size];
        for (int i = 0; i < size; i++) {
            array[i] = 1;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + (float) i / 5) * Math.cos(0.2f + (float) i / 5) * Math.cos(0.4f + (float) i / 2));
        }
        return System.currentTimeMillis() - a;
    }

    private static long secondMethod() {
        float[] array = new float[size];
        for (int i = 0; i < size; i++) {
            array[i] = 1;
        }
        float[] firstArray = new float[h];
        float[] secondArray = new float[h];
        long a = System.currentTimeMillis();
        System.arraycopy(array, 0, firstArray, 0, h);
        System.arraycopy(array, h, secondArray, 0, h);
        Thread firstThread = new Thread(() -> {
            for (int i = 0; i < h; i++) {
                firstArray[i] = (float) (firstArray[i] * Math.sin(0.2f + (float) i / 5) * Math.cos(0.2f + (float) i / 5) * Math.cos(0.4f + (float) i / 2));
            }
        });
        firstThread.start();
        Thread secondThread = new Thread(() -> {
            for (int i = 0; i < h; i++) {
                secondArray[i] = (float) (secondArray[i] * Math.sin(0.2f + (float) (i + h) / 5) * Math.cos(0.2f + (float) (i + h) / 5) * Math.cos(0.4f + (float) (i + h) / 2));
            }
        });
        secondThread.start();
        try {
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(firstArray, 0, array, 0, h);
        System.arraycopy(secondArray, 0, array, h, h);
        return System.currentTimeMillis() - a;
    }
}
