package humphrey.jeriah.LabsJan12;
import java.util.Scanner;
/**
 * Created by jeriahhumphrey on 1/13/17.
 */
public class SumProductChoice {

    public int Sum(int range) {

        int sum = 0;
        for (int i = 1; i <= range; i++) {
            sum += i;

        }
        System.out.println(sum);
        return sum;
    }
    public int Product(int range){

        int sum=1;
        for(int i=1;i<=range;i++){
            sum *= i;

        }
        System.out.println(sum);
        return sum;
    }
    public int choice(String option, int number){
        option=option.toUpperCase();
        SumProductChoice c1= new SumProductChoice();
        int result=0;
          if(option.equals("SUM")){
            result= c1.Sum(number);
        } else if(option.equals("PRODUCT")) {
              result = c1.Product(number);
          }
            else{
                  System.out.println("Invalid Choice. Please type Sum or Product");
              }
              return result;
        }


    public static void main (String [] args){
        SumProductChoice spc= new SumProductChoice();
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter Sum or Product to perform the operation, and enter a number.");
        spc.choice(input.next(),input.nextInt());

    }
}
