import java.util.Scanner;
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = sc.nextInt();
    int temp = n;
    int rem = 0;
    int sum = 0;
    int fact = 1;
        if(temp!= 0){
            rem = temp % 10;
            fact = fact * rem;
            sum = sum + rem;
            temp = temp / 10;
        }
        if(sum == n){
            System.out.println(n + " is a special number");
        }
        else{
            System.out.println(n + " is not a special number");
        }
}

            
    