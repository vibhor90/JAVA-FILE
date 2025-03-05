import java.util.Scanner;
public class StrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        int fact = 1;
    while (temp != 0) {
            int rem = temp % 10;	
            fact = 1;
            for (int i = 1; i <= rem; i++) {
                fact *= i;
            }
   sum = sum+ fact;
 temp = temp / 10;
        }
    if (sum == n) {
            System.out.println(n + " is a special number");
        }
        else {
            System.out.println(n + " is not a special number");
        }
    }
}                     
