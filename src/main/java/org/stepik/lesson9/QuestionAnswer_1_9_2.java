package org.stepik.lesson9;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_9_2 {
    /*
     * Вопрос:
     * There is a class named Account. It includes three fields: id, code and balance.
     * Override the method toString() in this class. The method should return a string representation of the account instance.
     * Use the provided template. Do not make the class public.
     *
     * Example
     *
     * Account{id=10, code='123-456-789', balance=2000}
     *
     * Ответ: см.ниже
     * */

    class Account {

        private long id;
        private String code;
        private Long balance;

        public Account(long id, String code, Long balance) {
            this.id = id;
            this.code = code;
            this.balance = balance;
        }

        // Override toString() here
        public String toString() {
            return "Account{id=" + id + ", code='" + code + "', balance=" + balance + "}";
        }
    }
}