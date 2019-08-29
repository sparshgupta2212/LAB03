import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int i;
        float sum = 0;
        for (i = 1; i <= n; i++) {
            sum = sum + (float) 1 / i;
        }
        System.out.println("sum of harmonic series of n=" + sum);
    }
}
