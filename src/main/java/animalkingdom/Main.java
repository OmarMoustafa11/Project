package animalkingdom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        animalclass dog = new animalclass("Athena","woof woof");
        animalclass cat = new animalclass("Nina","Meow Meow");
        animalclass Panther = new animalclass("Wakanda","ROAR!!!");
        System.out.println("How many pets do you have?");
        scan.nextLine();
        System.out.println("Pet Kind? ");
        String animal = scan.nextLine();
        System.out.println("Pet name and sound? ");
        while(true){
            if(animal.equalsIgnoreCase("dog")){
            System.out.println("Pet name and sound is " + dog.getName()+" "+dog.getSound());
            scan.nextLine();}
            else if(animal.equalsIgnoreCase("cat")){
                System.out.println("Pet name and sound is " + cat.getName()+" "+cat.getSound());
                scan.nextLine();}
            else if(animal.equalsIgnoreCase("Panther")){
                System.out.println("Pet name and sound is " + Panther.getName()+" "+Panther.getSound());
                scan.nextLine();}
            else {
                System.out.println(" YOU DONT HAVE THIS PET!!");
            }
            break;

            }

        }
    }

