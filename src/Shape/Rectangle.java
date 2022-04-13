package Shape;

public class Rectangle extends Shape implements Resizeable {
    private double width =1.0;
    private double length =1.0;
    public Rectangle(){

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getDienTich(){
        return width*length;
    }
    public double getChuvi(){
        return (length+width)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                "chu vi=" +getChuvi()+
                "dien tich"+getDienTich()+
                '}';
    }

    @Override
    public void resize(double percent) {
        this.width = (this.width * (percent/100));
        this.length = (this.length * (percent/100));

    }
}
