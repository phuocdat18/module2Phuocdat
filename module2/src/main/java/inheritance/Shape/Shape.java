package inheritance.Shape;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    //    private String color ;
//    private boolean filled ;
    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "1 hình có màu "
                + getColor()
                + " và "
                + (isFilled() ? "filled" : "not filled");
    }
}
