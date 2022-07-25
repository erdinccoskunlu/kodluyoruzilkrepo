import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Değişkenlerimizi tanımlayalım

        double price, kdvOrani, result;

        // Kullanıcıdan fiyat bilgisini alalım

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen hesaplamak istediğiniz fiyatı giriniz :");

        price = scanner.nextDouble();

        kdvOrani = price <= 1000 ? 0.18 : 0.08;

        result = price * kdvOrani;

        System.out.println((price > 0 && price <= 1000) ? "Fiyat 0-1000 TL arası olduğu için KDV oranı : 0,18 dir." :
                "Fiyat 1000 TL'den büyük olduğu için KDV oranı 0,08 dir.");

        System.out.println("KDV : " + result + "TL");



    }
}
