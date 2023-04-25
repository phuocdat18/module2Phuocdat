package oop.point;

import java.util.Arrays;

public class Point2D {
    // Biến x này là gì: là biến instance của đối tượng
    private float x;          // 0.0f
    private float y;

    // Hàm khoi tạo để làm gì:
    // để khởi tạo đối tượng( trùng tên lớp và không có giá trị trả về)
    // trong hàm khởi tạo cập nhật thuộc tính của đối tượng
    public Point2D() {

    }
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    // Getter, setter để làm gì: getter để truy cập giá trị của 1 thuộc tính
    // setter sử dụng để cập nhật giá trị của 1 thuộc tính.
    public float getX() {
        return this.x;
    }
    public float getY() {
        return this.y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float [] getXY() {
        float[] xy = new float[2];
        xy[0] = x;
        xy[1] = y;
        return xy;
    }

    // phương thức toString() từ đâu ra và nó để làm gì:
    // toString nằm trong lớp obj, 1 lớp được kế thừa lớp obj nên thừa hưởng phương thức toString
    // toString dùng để hiển thị thông tin của đối tượng
    // Tại sao phải ghi đè phương thức này: để cung cấp 1 cách biểu diễn phù hợp với lớp đó
    //
    @Override
    public String toString() {
        // (2,3)
        return String.format("(%s,%s)", this.x, this.y);
    }



}
