import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n , k ;
        System.out.print("Üssü Alınacak Sayı : ");
        n = scanner.nextInt();
        System.out.print("Üs Olacak Sayı : ");
        k = scanner.nextInt();

        // 3 ^ 4 = 3*3*3*3
        int total = 1;

        for(int i=1 ; i<=k; i++){
            total = total * n;
        }
        System.out.println("Sonuç : " +total);
    }
}
