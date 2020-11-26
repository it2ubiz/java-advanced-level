package org.stepik.lesson8;

/**
 * @author Zurbaevi Nika
 */
public class QuestionAnswer_1_8_4 {
    /*
     * Вопрос:
     *
     * Given an interface named AccountService. The interface has two abstract methods:
     * findAccountByOwnerId(long id) returns Account found by owner id or null.
     * countAccountsWithBalanceGreaterThan(long balance) returns number of accounts with the balance greater than the passed value.
     * Also there are two another classes: Account (id, balance, owner) and User (id, firstName, lastName). See the provided code template.
     *
     * You need to implement the AccountService interface and its two methods. Your implementation must be named AccountServiceImpl. It should have a constructor with one argument - an array of accounts. The implementation must keep the array inside. The first method should search an account by owner id in the array, the second one - count number of accounts by condition in the array.
     *
     * An example of creating an instance:
     *
     * Account[] accounts = ...
     * AccountService service = new AccountServiceImpl(accounts);
     * Do not make classes and the interface public.
     *
     * Ответ: см.ниже
     * */

    interface AccountService {

        abstract Account findAccountByOwnerId(long id);

        abstract long countAccountsWithBalanceGreaterThan(long value);
    }

    class AccountServiceImpl implements AccountService {
        private Account[] accounts;
        private User own;

        public AccountServiceImpl(Account[] arr) {
            this.accounts = arr;
        }

        @Override
        public Account findAccountByOwnerId(long id) {
            Account X = null;
            for (Account acc : accounts) {
                own = acc.getOwner();
                if (own.getId() == id) {
                    X = acc;
                    break;
                }
            }
            if (X != null) {
                return X;
            } else {
                return null;
            }
        }

        @Override
        public long countAccountsWithBalanceGreaterThan(long value) {
            long sum = 0L;
            long count = 0L;
            for (Account acc : accounts) {
                sum = acc.getBalance();
                if (sum > value) {
                    count++;
                }
            }
            return count;
        }
    }

    class Account {

        private long id;
        private long balance;
        private User owner;

        public Account(long id, long balance, User owner) {
            this.id = id;
            this.balance = balance;
            this.owner = owner;
        }

        public long getId() {
            return id;
        }

        public long getBalance() {
            return balance;
        }

        public User getOwner() {
            return owner;
        }
    }

    class User {

        private long id;
        private String firstName;
        private String lastName;

        public User(long id, String firstName, String lastName) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public long getId() {
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }
}
