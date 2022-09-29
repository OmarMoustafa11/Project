package animalkingdom;

public class Panther extends animalclass {
   public Panther (String name, String food){
      super(name,food);
   }

   @Override
   public void setFood(String food) {
      System.out.println("meat");
   }

   @Override
   public String speak() {
      System.out.println("RAWRR");
      return "";
   }
}
