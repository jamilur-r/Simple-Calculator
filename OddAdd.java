import java.util.Scanner;
public class OddAdd{
    public void aOdd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter quantity");
        int qn= sc.nextInt();
        int sum=0;
        for(int i=1; i<=qn; i++){
            System.out.println("Please enter a number");
            int num=sc.nextInt();
            if(num%2!=0){
                sum= sum+num;
            }
        }
        System.out.println("Result = "+sum);
    }
}