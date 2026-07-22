package Chuong5_Bai2;

public class Circle extends Shape{
    private double radius;
    public Circle(){
        super();//Goi constructor mac dinh cua lop cha
        this.radius=1.0;
    }
    public Circle(double radius){
        super();
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    //Tinh dien tich 
    @Override
    public double getArea() {
        return Math.PI *radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2* Math.PI *radius;
    }

    @Override
    public String toString() {
        return "Circle[radius="+ radius + ",color" + getColor() + ", filled=" + isFilled() + "]";
        
    }
}
