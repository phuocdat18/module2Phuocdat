package oop.cylinder;

public class Cylinder extends Circle{

    private float height;

    public Cylinder() {
        // ở đây mặc định là nó gọi đi đâu
        // mặc định hàm khởi tạo của lớp cha
//        super();
    }

    public Cylinder(float height, float radius, String color) {
        // Cách 1: super(radius, color) cái này để làm gì:
        // bằng cách trên ta không cần phải gán lại gái trị cho radius à color trong lớp con
        super(radius, color);


        // Cách 2:  Vì sao ở đây this.color và this.radius được:
        // dùng từ khóa this để truy cập đến các thuộc tính của lớp hiện tại
//        this.color = color;
//        this.radius = radius;

        // Cách 3:     setColor(color);  vì sao gọi được:
        //
//        setColor(color);    // có thể dùng: this.setColor(color); Vì lớp có đợc nên được gọi từ lớp con
//        setRadius(radius);

        // cách 4: super.setColor(color); vì sao gọi được:
        // dùng để gọi lên phuonwg thức của lớp cha
//        super.setColor(color);
//        super.setRadius(radius);

        this.height = height;

    }

    // Tại sao phải ghi đè phương thức getArea()  vì lớp cha cũng có phương thức tính
    // diện tích -> lớp con cũng thừa hưởng được
    @Override
    public float getArea() {
        // Nếu lấy this.getArea() thì chuyện gì sẽ xảy ra: phương thức sẽ gọi đến chính nó và lặp lại vô hạn
        // do đó để tránh gọi đến chính nó, ta sử dụng super.getArea để gọi phương thức
        // getArea ở lớp cha Circle

        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return String.format("Cylinder: %s, color: %s, Area: %s",
                this.radius, color, this.getArea() );
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(3, 10, "RED");
        System.out.println(cylinder);

        // Ở đây sử dụng tính chất đa hình, cho phép một biến thuộc kiểu dữ liệu cha có thể
        // trỏ đến một đối tượng thuộc lớp con
        Circle c1 = new Cylinder(3, 10, "BLUE");

        // c1.getArea();            lấy phương của lớp con để thực hiện
        float area = c1.getArea();
        System.out.println("Area c1: " + area);
    }
}