 import java.util.Scanner;

public class PascalTriangle {
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static long nCr(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
    public static void printPascalsTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(nCr(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        scanner.close();

        System.out.println("Pascal's Triangle:");
        printPascalsTriangle(rows);
    }
}
