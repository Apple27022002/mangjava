package Human;

public class main {
    public static void main(String[] args) {
        Nguoi manh =new Nguoi() ;
        manh.setName("Manh");
        System.out.println("nguoi nay ten la " +manh.getName());
        manh.setAge(20);
        System.out.println(manh.getName()+" co tuoi la"+manh.getAge());
        manh.setWeight(3);
        System.out.println(manh.getName() +" beo vai lon");
        manh.setHeight(185);
        System.out.println(manh.getName()+" cao vai lon luon");
        manh.setSex("male");
        manh.study();
        manh.sleep();

    }
}
