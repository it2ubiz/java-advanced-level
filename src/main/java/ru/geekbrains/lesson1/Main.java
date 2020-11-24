package ru.geekbrains.lesson1;

import ru.geekbrains.lesson1.obstacle.Obstacle;
import ru.geekbrains.lesson1.obstacle.RunTrack;
import ru.geekbrains.lesson1.obstacle.Wall;
import ru.geekbrains.lesson1.participants.Cat;
import ru.geekbrains.lesson1.participants.Human;
import ru.geekbrains.lesson1.participants.Participants;
import ru.geekbrains.lesson1.participants.Robot;

/**
 * Java Core. Advanced level. Lesson 1
 *
 * @author Nika Zurbaevi
 * @version dated November 25, 2020
 */
public class Main {
    public static void main(String[] args) {
        Participants[] participants = {
                new Cat("Miles", 1000, 3),
                new Cat("Jones", 3200, 5),
                new Human("Robert", 3000, 1),
                new Human("Nikola", 4200, 0),
                new Robot("IDE21", 5000, 0),
                new Robot("AXX24", 6000, 0)
        };

        Obstacle[] obstacles = {
                new RunTrack(2500),
                new Wall(1)
        };

        for (Participants participant : participants) {
            for (Obstacle obstacle : obstacles) {
                obstacle.passTheObstacle(participant);
                if (!participant.isOnDistance()) {
                    break;
                }
            }
        }
    }
}
