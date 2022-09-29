package animalkingdom;

public class Dog extends animalclass {


    public Dog(String name, String food) {
        super(name, food);
    }

    @Override
    public void setFood(String food) {
        System.out.println("dogfood");
    }

    @Override
    public String speak() {
        System.out.println("WOOF");
        return "";
    }
}

