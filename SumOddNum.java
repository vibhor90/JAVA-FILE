import java.util.Scanner;
public class SumOddNum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int sum =0;
        for( int i=1; i<=n; i++){
        if(i%2 !=0){
            sum = sum + i;
        } 

    }
   System.out.println("The sum of odd numbers  " + n + " is " + sum);
    
}

}