package cat;

public class aaaa {
    private String name;
    private int age;
    private String color;
    private String eyesColor;
    private int weight;
    public void move (){
        System.out.println(name+ " Is runing ");
        this.name=name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println(name+" Is eating");
    }
    public void sleep(){
        System.out.println(name+" It sleeping");
    }
    public void speak(){
        System.out.println(name+" say Meo");
    }

}
