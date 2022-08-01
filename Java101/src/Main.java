import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int userValue;
        int total = 0;
        do {
            System.out.print("Bir sayı giriniz : ");
            userValue = scanner.nextInt();
            if(userValue % 4 ==0){
                total += userValue;
            }

        }while (userValue % 2 == 0);

        System.out.println("Toplam : " + total);
    }
}
