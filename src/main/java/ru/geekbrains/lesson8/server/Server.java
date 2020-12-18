package ru.geekbrains.lesson8.server;

import ru.geekbrains.lesson8.authentication.AuthenticationService;

/**
 * @author Zurbaevi Nika
 */
public interface Server {
    void broadcastMessage(String message);

    void sendPrivateMessage(ClientHandler sender, String nickname, String message);

    boolean isLoggedIn(String nickname);

    void subscribe(ClientHandler client);

    void unsubscribe(ClientHandler client);

    AuthenticationService getAuthenticationService();
}
