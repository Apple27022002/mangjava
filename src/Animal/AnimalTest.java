package Animal;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[]animals=new Animal[2];
        animals[0]=new Chicken();
        animals[1]=new Tiger();
        for (Animal f:animals){
            System.out.println(f.MakeSound());
        }
        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Orange();
        fruit[1] = new Apple();
        for (Fruit i:fruit){
            System.out.println(i.howtoEat());


        }
    }
}
