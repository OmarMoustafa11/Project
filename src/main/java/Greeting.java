import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        //creating scanner object
        while(true){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name");
        String name = input.nextLine();
        int age = input.nextInt();


        // if statements
         if (name.equals("Bob") ){
            System.out.println("Hello welcome " + name + " you are " + age + " years old ") ;
            break;
        }
         else if(name.equals("Alice")) {
             System.out.println("Hello welcome " + name + " you are " + age + " years old ");
         break;}

        else{
            System.out.println("You do not belong here!!!!");}

}}}
