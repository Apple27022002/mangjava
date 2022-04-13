package Shape;

public class Circle extends Shape implements Resizeable {
    private double radius =1.0 ;

    public Circle(){
    }
    public Circle(double radius){
        this.radius =radius;
    }
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }
    public double getRadius(){
        return radius;

    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArena(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return radius *2*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                " radius= " + radius + "," +
                super.toString()+
                " area= " + getArena()+
                " perimeter " + getPerimeter()+
                '}';
    }

    @Override
    public void resize(double percent) {
        this.radius=(this.radius*(percent/100));
    }
}
