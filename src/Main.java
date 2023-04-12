public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(6,5);
        System.out.println(rect1);
        System.out.println("Area is: "+ rect1.getArea());
        Square sq1 = new Square(7.0);
        System.out.println(sq1);
        System.out.println("Area is: "+ sq1.getArea());
    }
}