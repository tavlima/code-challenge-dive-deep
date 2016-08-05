package com.github.tavlima.deepdive.domain;

import org.springframework.stereotype.Component;

/**
 * Created by thiago on 8/5/16.
 */
@Component
public class Submarine {

    private int x;
    private int y;
    private int z;
    private Direction direction;

    public Submarine() {
        this.direction = Direction.NORTE;
    }

    public Submarine(int x, int y, int z, Direction direction) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}
