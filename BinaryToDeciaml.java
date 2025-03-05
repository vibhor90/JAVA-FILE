import java.util.Scanner;
public class BinaryToDeciaml {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number:");
        int n = sc.nextInt();
        int decimal =0;
        int base = 1;
        int a = n;
         
        while(a>0){
            int rem = a%10;
            decimal = decimal + rem*base;
            a = a/10;
            base = base*2;
        }
        System.out.println("The decimal number is " + decimal);
    }
    