package Shape;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle();
        shapes[1]=new Rectangle();
        for (Shape i : shapes){
            System.out.println(i);

        }
        int random = (int)Math.round(Math.random()*100 + 1);

        for (Shape i : shapes){

//            System.out.println(i);
            if (i instanceof Circle) {
                ((Circle) i).resize(random);
                System.out.println(i);
            } else if (i instanceof Rectangle){
                ((Rectangle) i).resize(random);
                System.out.println(i);
            }
//            else {
//                System.out.println("Loi");
//            }


        }
    }
}
