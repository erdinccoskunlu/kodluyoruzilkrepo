import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // Kullanıcıdan aldığım bilgileri tutabilmek  için değişken tanımlayıp bilgileri bu değişkenlere atama yapmam gerek
        double matematik, fizik, kimya, turkce, tarih, muzik;

        // Şimdi kullanıcıdan bilgileri almalıyım

        Scanner scanner = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz :");
        matematik = scanner.nextDouble();

        System.out.print("Fizik notunuzu giriniz :");
        fizik = scanner.nextDouble();

        System.out.print("Kimya notunuzu giriniz :");
        kimya = scanner.nextDouble();

        System.out.print("Türkçe notuzunu giriniz :");
        turkce = scanner.nextDouble();

        System.out.print("Tarih notuzunu giriniz :");
        tarih = scanner.nextDouble();

        System.out.print("Müzik notuzunu giriniz :");
        muzik = scanner.nextDouble();

        // Kullanıcının girmiş olduğu bilgilere göre not ortalamasını hesaplatalım

        double result = (matematik + fizik + kimya + turkce + tarih + muzik)/6;

        System.out.println("Not ortalamanız : " + result);

        String valid = result >= 60 ? "geçti" : "kaldı";
        System.out.println(valid);



    }
}
