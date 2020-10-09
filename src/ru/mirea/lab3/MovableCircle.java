package ru.mirea.lab3;

public class MovableCircle implements Movable {
    int radius;
    MovablePoint center;

    public MovableCircle(int x,int y,int xSpeed, int ySpeed,int radius){
        this.center.x = x;
        this.center.y = y;
        this.center.xSpeed = xSpeed;
        this.center.ySpeed = ySpeed;
        this.radius = radius;

    }

    @Override
    public void moveUp() {
        this.center.y += center.ySpeed;
    }

    @Override
    public void moveDown() {
        this.center.y -= center.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.center.x -= center.xSpeed;
    }

    @Override
    public void moveRight() {
        this.center.x += center.xSpeed;
    }
}
