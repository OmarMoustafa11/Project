package animalkingdom;

public class Cat extends animalclass{

    public Cat(String name, String food) {
        super(name, food);
    }

    @Override
    public void setFood(String food) {
        System.out.println("catfood");
    }

    @Override
    public String speak() {
        System.out.println("meow");
        return "";
    }


}
