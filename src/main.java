import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double fah;
        double ceh;
        Scanner scan = new Scanner(System.in);
        fah = scan.nextDouble();
        ceh = ((fah - 32) / 1.8);
        System.out.println(ceh);
    }
}
