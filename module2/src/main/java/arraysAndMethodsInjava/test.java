package arraysAndMethodsInjava;

public class test {
    protected int sum(int a, int b) {
       return a+b;
   }
   public static void main(String[] args) {
       test d = new test();
       int s = d.sum(10, 20);
       System.out.println(s);
   }

//    private int sum1(int a, int b) {
//        return a+b;
//    }
//    public static void main(String[] args) {
//        test d = new test();
//        int s = d.sum1(10, 15);
//        System.out.println(s);
//    }

//    punlic int sum1(int a, int b) {
//        return a+b;
//    }
//    public static void main(String[] args) {
//        test d = new test();
//        int s = d.sum1(10, 15);
//        System.out.println(s);
//    }

}

