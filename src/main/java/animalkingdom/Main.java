package animalkingdom;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

        public static String animalDiet (animalclass [] pet) {
            for (int i = 0; i < pet.length; i++){
                if (pet[i] instanceof Cat){
                    System.out.println(pet[i].getFood());
                }else if(pet[i] instanceof Dog){
                    System.out.println(pet[i].getFood());
                }else if (pet[i] instanceof Panther){
                    System.out.println(pet[i].getFood());
                }
            }
            return " ";
        }
        public static void main(String[] args) {
            Scanner askUser = new Scanner(System.in);
            System.out.println("How many pets do you have?:");
            int numbOfPets = askUser.nextInt();
            ArrayList<String> petKind = new ArrayList<>();
            ArrayList<String> petName = new ArrayList<String>();
            Scanner petScan = new Scanner(System.in);
            for (int i = 0; i < numbOfPets; i++) {
                System.out.println("What kind of pet do you have,Dog,Cat, or Panther?:" );
                petKind.add(petScan.nextLine());
                System.out.println("What's their name?:");
                petName.add(petScan.nextLine());
            }
            for (int x = 0; x < petName.size(); x++){
                if (petKind.get(x).equalsIgnoreCase("cat")){
                    animalclass c = new Cat(petName.get(x),"catfood");
                    System.out.println(" ");
                    System.out.println(c.speak() + " : " + c.getName());
                } else if (petKind.get(x).equalsIgnoreCase("Panther")) {
                    animalclass p = new Panther(petName.get(x),"Meat");
                    System.out.println(" ");
                    System.out.println(p.speak() + " : " + p.getName());
                } else if (petKind.get(x).equalsIgnoreCase("dog")){
                    animalclass d = new Dog(petName.get(x),"dogfood");
                    System.out.println(" ");
                    System.out.println(d.speak() + " : " + d.getName());
                }
            }
        }
}

