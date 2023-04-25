//import AbstractClass_InterFace.Colorable.Circle;
//import AbstractClass_InterFace.Colorable.Rectangle;
//import AbstractClass_InterFace.Colorable.Shape;
//import AbstractClass_InterFace.Colorable.Square;

package AbstractClass_InterFace.Colorable;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2,"blue",true);
        shapes[1] = new Rectangle(3,4,"red",true);
        shapes[2] = new Square(4,"yellow",false);

        System.out.println("Pre-sorted:");
        System.out.println("Diện tích hình tròn là: " + ((Circle) shapes[0]).getArea());
        System.out.println("Diện tích hình chữ nhật là: " + ((Rectangle) shapes[1]).getArea());
        System.out.println("Diện tích hình vuông là: " + ((Square) shapes[2]).getArea());

        double percent = Math.ceil(Math.random()*100);

        System.out.println("After-sorted:");
        System.out.println("Diện tích hình tròn là: " + ((Circle) shapes[0]).resize(percent));
        System.out.println("Diện tích hình chữ nhật là: " + ((Rectangle) shapes[1]).resize(percent));
        System.out.println("Diện tích hình vuông là: " + ((Square) shapes[2]).resize(percent));

        System.out.println(((Square) shapes[2]).howToColor());
    }
}
