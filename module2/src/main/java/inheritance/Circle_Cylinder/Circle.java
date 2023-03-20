package inheritance.Circle_Cylinder;

public class Circle {
    private String color = "blue";
    private double length = 5.0;
    private double radius = 3.0;

    public Circle() {
    }

    public Circle(String color, double length, double radius) {
        this.color = color;
        this.length = length;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getPerimeter() {
        return  2 * radius * Math.PI;
    }
     public double getVolumetric() {
        return (radius * radius * Math.PI) * length;
     }

    @Override
//    public String toString() {
//        return "1 hình tròn có màu:"
//                + getColor()
//                + "và bán kính là" + getRadius()
//                + "Diện tích của hình tròn là:" + getArea()
//                + "Chu vi của hình tròn là:" + getPerimeter()
//                + "Với chiều cao là" + getLength() + " thì thể tích của hình trụ là:"
//                + getVolumetric();
//    }

    public String toString() {
        return String.format("(%s, %s, %s)", this.getRadius(), this.getArea(), this.getPerimeter());
    }
}

