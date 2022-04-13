package cat;

public class main {
    public static void main(String[] args) {
        aaaa meo =new aaaa();
        meo.setName("meo");
        System.out.println("ten cua con meo la "+meo.getName());
        meo.setWeight(3);
        System.out.println("con meo nang "+meo.getWeight());
        meo.setColor("black");
        System.out.println("no co mau "+meo.getColor());
        meo.move();
        meo.sleep();
        
        
        aaaa Miu =new aaaa();
        Miu.setName("Miu");
        Miu.setColor("Mau vang");
        Miu.setAge(4);
        System.out.println("con meo ten la "+Miu.getName());
        System.out.println("no co "+Miu.getColor());
        System.out.println("No da "+Miu.getAge()+"");
        Miu.move();
        Miu.sleep();
    }
}
