package ru.geekbrains.lesson7.server;

import ru.geekbrains.lesson7.authentication.AuthenticationService;

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
