
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b, c;

        double cevre, alan, u ;

        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Kenari giriniz : ");
        a = scanner.nextInt();

        System.out.print("2. Kenari giriniz : ");
        b = scanner.nextInt();

        System.out.print("3. Kenari giriniz : ");
        c = scanner.nextInt();

        cevre = a + b + c;

        u = cevre / 2 ;

        alan = Math.sqrt(u *(u-a)*(u-b)*(u-c));

        System.out.println("Ucgenin Cevresi : " + cevre );

        System.out.println("Ucgenin Alani : " + alan);
    }
}
