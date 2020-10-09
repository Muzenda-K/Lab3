package ru.mirea.lab3;

public class MovableRectangle implements Movable  {
    MovablePoint topLeft;
    MovablePoint bottomRight;

    public MovableRectangle(int x1,int y1,int x2,int y2,int xSpeed,int ySpeed ){
        this.bottomRight.x = x1;
        this.bottomRight.y = y1;
        this.bottomRight.xSpeed = xSpeed;
        this.bottomRight.ySpeed = ySpeed;

        this.topLeft.x = x2;
        this.topLeft.y = y2;
        this.topLeft.xSpeed = xSpeed;
        this.topLeft.ySpeed = ySpeed;

    }

    @Override
    public void moveUp() {
        this.topLeft.y += this.topLeft.ySpeed;
        this.bottomRight.y += this.bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        this.topLeft.y -= this.topLeft.ySpeed;
        this.bottomRight.y -= this.bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.topLeft.x -= this.topLeft.xSpeed;
        this.bottomRight.x -= this.bottomRight.xSpeed;
    }

    @Override
    public void moveRight() {
        this.topLeft.x += this.topLeft.xSpeed;
        this.bottomRight.x += this.bottomRight.xSpeed;
    }
}
