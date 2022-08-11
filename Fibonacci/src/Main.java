import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci Serisinin Eleman Sayısını Giriniz : ");
        int number = scanner.nextInt();
        int result = 0;
        int first = 0 , second = 1;
        int tempResult;
        System.out.print("0 1 ");
        for(int i = 0; i<=number-2; i++){
            result = first + second;
            System.out.print(result + " ");

            first = second;
            second = result;
        }


    }
}
