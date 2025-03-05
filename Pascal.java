
    import java.util.Scanner;
    public class Pascal {
    public static void printPascalsTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            int num = 1; 
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1); 
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


