package Shape;

public class Shape {
    private String color;
    private boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape() {
        color = "green";
        filled = true;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
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
        return "color='" + color + '\'' +
                ", filled=" + filled;
    }


        public static void main(String[] args) {
            Shape shape = new Shape();
            System.out.println(shape);
            shape = new Shape("red", false);
            System.out.println(shape);

        }


}

