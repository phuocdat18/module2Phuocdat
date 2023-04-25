package AccessModifier_static.Referencing;

public class test {
    private static int count = 0; // biến static

    public test() {
        count++;
    }

    public static int getTest() {
        return count;
    }
    public static void main(String[] args) {
        test c1 = new test();
        test c2 = new test();
        test c3 = new test();

        System.out.println(test.getTest()); // kết quả là 3
    }
}
