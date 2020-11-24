package ru.geekbrains.lesson1.obstacle;

import ru.geekbrains.lesson1.participants.Participants;

public class RunTrack implements Obstacle {
    private int distance;

    public RunTrack(int distance) {
        this.distance = distance;
    }

    @Override
    public void passTheObstacle(Participants participants) {
        participants.run(distance);
    }
}
