package humphrey.jeriah.LabsJan12;

import java.util.Scanner;

/**
 * Created by jeriahhumphrey on 1/13/17.
 */
public class Greeting {
    private String name;

    public String getName(String name) {
        this.name = name;
        return name;
    }


    public String nameCheck(String name) {
        String hello ="";
        if (name.equals("Bob") || name.equals("Alice")){

            hello = "Hi " + name;
            System.out.println(hello);

        }

        return hello;
    }

    public static void main(String[] args) {
        Greeting greeting = new Greeting();

        System.out.println("What is your name");
        Scanner input = new Scanner(System.in);
        greeting.nameCheck(input.nextLine());



    }
}