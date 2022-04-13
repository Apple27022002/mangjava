package Human;

public class Nguoi {
    private String name;
    private int age;
    private int Height;
    private int Weight;
    private String sex;
    private String job;
    private String country;

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    private String SkinColor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSkinColor() {
        return SkinColor;
    }

    public void setSkinColor(String skinColor) {
        SkinColor = skinColor;
    }
    public void run(){
        System.out.println(name +" Is runing");}
    public void eat(){
        System.out.println(name+" Is eating");
    }
    public void study(){
        System.out.println(name+" Is studying");
    }
    public void sleep(){
        System.out.println(name +" Is sleeping");
    }
    }


