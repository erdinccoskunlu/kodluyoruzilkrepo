import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int yariCap, alfa ;
        double alan, pi = 3.14;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz : ");
        yariCap = scanner.nextInt();
        System.out.print("Dairenin merkez açı ölçüsünü giriniz : ");
        alfa = scanner.nextInt();

        alan = (pi * yariCap * yariCap * alfa)/360;

        System.out.println("Daire Diliminin Alanı : " + alan);

    }
}
