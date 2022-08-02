import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int userValue = scanner.nextInt();
        System.out.println("Dordun kuvvetleri : ");
        for(int i = 1; i<=userValue; i *= 4){
            System.out.println(i);
        }
        System.out.println("Besin Kuvvetleri : ");
        for(int j=1; j<=userValue; j *= 5){
            System.out.println(j);
        }
    }
}
