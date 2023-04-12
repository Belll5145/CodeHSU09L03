public class Rectangle {

    //instance variables
    private double height;
    private double length;

    //constructor
    public Rectangle(double height, double length){
        this.height = height;
        this.length = length;
    }
    //getArea

    public double getArea(){
        return height*length;
    }
    public double getHeight(){
        return height;
    }
    //toString
    public String toString(){
        return "Rectangle with length: "+ length +" and height: "+ height;
    }
}
