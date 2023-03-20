package inheritance.Circle_Cylinder;

public class Cylinder {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle("red", 5.0, 3.3);
        System.out.println(circle);

        circle = new Circle("black", 2.0, 2.5);
        System.out.println(circle);
    }
}
