import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        int row;
        Scanner scan = new Scanner(System.in);
        row = scan.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
