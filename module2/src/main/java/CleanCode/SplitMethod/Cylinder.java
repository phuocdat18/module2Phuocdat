package CleanCode.SplitMethod;

public class Cylinder {
    public static double getVolume(int radius, int height){
        double Area = getArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = height * Area;
        return volume;
    }

    private static double getPerimeter(int radius) {
        return 2 * Math.PI  * radius;
    }

    private static double getArea(int radius) {
        return Math.PI * radius * radius;
    }
}