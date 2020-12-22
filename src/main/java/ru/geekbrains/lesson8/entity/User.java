package ru.geekbrains.lesson8.entity;

/**
 * Java Core. Advanced level. Lesson 8
 *
 * @author Zurbaevi Nika
 */
public class User {
    private String nick;
    private String password;

    public User(String nick, String password) {
        this.nick = nick;
        this.password = password;
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }
}
