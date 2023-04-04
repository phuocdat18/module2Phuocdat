package CleanCode.SplitMethod;


public class CylinderTest extends Cylinder {
    public static void main(String[] args) {
        int radius = 1;
        int height = 1;
        double volume = getVolume(radius, height);
        System.out.println("Thể tích khối trụ có bán kính " + radius + " và chiều cao là " + height + " là "+ volume);
    }

}