package humphrey.jeriah.LabsJan12;
import java.util.Scanner;


/**
 * Created by jeriahhumphrey on 1/13/17.
 */
public class SecretNumber {
    int counter = 1;
    String message = "";
    public static int secret=((int) (Math.random() * (10-1)) + 1);



    public String condition(int guess, int secret) {
        if (guess > secret) {
            this.message = "You're too high";
            System.out.println(message);

        } else if (secret > guess) {
            this.message = "You're too low";
            System.out.println(message);
        }


        return message;
        }





    public void numberCheck(int guess) {
        Scanner input = new Scanner(System.in);
        SecretNumber s1 = new SecretNumber();
        int comparison=0;
        while (guess != secret) {
            s1.condition(guess, secret);
            s1.guessComparison(guess,comparison);
            comparison = guess;
            guess=input.nextInt();
            if (guess==secret){
                s1.countMessage();
                break;
            }

        }
    }

    public int guessComparison(int guess, int comparison) {

        if (guess != comparison) {
           this.counter++;
        } else {

        }
        return this.counter;
    }

    public String countMessage() {
        String countMessage = "You took " + this.counter + " tries";
        System.out.println(countMessage);
        return countMessage;


    }
    public static void main(String[]args){
        SecretNumber s2= new SecretNumber();
        Scanner input=new Scanner(System.in);
        System.out.println("Guess the secret number");
        s2.numberCheck(input.nextInt());

    }














    }



