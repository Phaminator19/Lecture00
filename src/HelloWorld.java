import java.util.Scanner;

public class HelloWorld {
    public void greet() {
        String greeting = "Hello";
        System.out.println(greeting + "world");
    }
    public static void main(String[] args){
        System.out.println("in main");

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = scan.nextLine();
        System.out.println(name);





        /*
        for(String a : args){
            System.out.println(a);
        }
         */
    }
}


