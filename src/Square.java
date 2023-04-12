public class Square extends Rectangle{
//instance variables


    //constructor

    public Square(double sideLength){
        super(sideLength, sideLength);
    }
    //getSideLength
    public double getSideLength(){
        return super.getHeight();
    }
    //toString @override
    @Override
    public String toString(){
        return "Square with side length of: "+ getSideLength();
    }
}
