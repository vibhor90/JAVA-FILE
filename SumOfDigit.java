import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int sum = 0;
        int a = n;

        while(a>0){
            int rem = a%10;
            sum = sum + rem;
            a = a/10;
        }
        System.out.println("The sum of digits is " + sum);
        
    }
    
}

