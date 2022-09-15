import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        //creating scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name");
        String name = input.nextLine();
        //name = input.next();
        int age = input.nextInt();
        // if statements
         if (name.equals("Bob") ){
            System.out.println("Hello welcome " + name + " you are " + age + " years old ") ;
        }
         else if(name.equals("Alicia")){
        System.out.println("Hello welcome " + name + age + " you are " + age + " years old ");}
        else{
            System.out.println("You are not either");}

}}
