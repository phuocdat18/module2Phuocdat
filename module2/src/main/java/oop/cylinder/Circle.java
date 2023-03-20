package oop.cylinder;

public class Circle {
    protected float radius;
    protected String color;

    public Circle() {

    }

    public Circle(float radius) {
        this.radius = radius;
        this.color = "BLACK";
    }

    public Circle(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public float getRadius() {
        return this.radius;
    }
    // Getter/setter ở đây để làm gì:
    // để kiểm soát quyền truy cập thông tin/ quyền cập nhật thông tin của đối tượng.
    public void setRadius(float radius) {
        if (radius < 0) {
            System.out.println("Bán kính không hợp lệ");
        }else{
            this.radius = radius;
        }
    }

    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public float getArea() {
        return (float) (this.radius*this.radius*Math.PI);
    }

    // Hàm toString để làm gì, từ đâu ra, override là gì:
    // toString mặc định trong obj mà mọi lớp đều được kế thừa từ obj.
    // vì không muốn dùng toString được thừa hưởng từ hàm cha nên cần phải ghi đè lại
    // this.radius lấy thông tin radius được, không cần this. có được ko:
    // được vì nó sẽ tự hiểu được đó chính là this.radius.
    @Override
    public String toString() {
//        return "Cirlce: " + this.radius + " Color: " + this.color + " Area: " + this.getArea();
        return String.format("Circle: %s, color: %s, Area: %s",
                this.radius, color, this.getArea() );
    }
}