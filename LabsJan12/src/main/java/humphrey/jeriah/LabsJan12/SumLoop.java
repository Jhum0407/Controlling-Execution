package humphrey.jeriah.LabsJan12;

import java.util.Scanner;

/**
 * Created by jeriahhumphrey on 1/12/17.
 */
public class SumLoop {
private int range;

    public int getRange(int range){
        this.range=range;
        return range;

    }

    public int Sum(int range){

        int sum=0;
        for(int i=1;i<=range;i++){
            sum += i;

        }
        System.out.println(sum);
        return sum;
    }

public static void main(String[] args){
    Scanner s1 = new Scanner(System.in);
        SumLoop loop = new SumLoop();
    System.out.println("please enter a number");
   loop.Sum(s1.nextInt());

}
}
