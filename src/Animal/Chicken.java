package Animal;

public class Chicken extends Animal implements Edible{
    @Override
    public String MakeSound() {
        return "Chicken go Quac Quac";
    }

    @Override
    public String howtoEat() {
return "could be fried";
    }
}
