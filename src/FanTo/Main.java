package FanTo;

public class Main {
    public static void main(String[] args) {
        Fan fan1 =new Fan(3,true,5,"red");
        Fan fan2 =new Fan(2,false,8,"yellow");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
