import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n1, n2, select;
        System.out.print("İlk sayıyı giriniz :");
        n1 = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        n2 = scanner.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = scanner.nextInt();

        switch (select){
            case 1:
                System.out.println("Sonuç : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Sonunç : " +(n1 - n2));
                break;
            case 3:
                System.out.println("Sonunç : " +(n1 * n2));
                break;
            case 4:
                if(n2 != 0){
                    System.out.println("Sonunç : " +(n1 / n2));
                }else {
                    System.out.println("Bir sayı Sıfıra bölünemez. ");
                }
                break;
            default:
                System.out.println("Hatalı giriş yaptınız. Lütfen Tekrar Deneyin");
        }



    }
}
