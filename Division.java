import java.util.Scanner;
public class Division{
    public void divi(){
        //Division code-------------------------------------------
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Will be devided as \n (1st number/2nd number)");
        System.out.println("Please enter a number" );
        double a=sc.nextDouble();
        System.out.println("Please enter a number");
        double b=sc.nextDouble();
        
        System.out.printf("Result = %.3f\n" ,(a/b));
    }
}
        