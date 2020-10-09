package ru.mirea.lab3;

public class Circle extends Shape  {
    private  double radius = 1.0;
    final double pi = Math.PI;

    public Circle(){ };

    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius,String color,boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }

    @Override
    public double getArea() {
        return pi*(Math.pow(radius,2));
    }

    @Override
    public double getPerimeter() {
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
