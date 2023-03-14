package arraysAndMethodsInjava;

public class fan1 {
    public static void main(String[] args) {
        fan fan1 = new fan();
        fan1.setSpeed(fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        fan fan2 = new fan();
        fan2.setSpeed(fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");

        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
    }
}
