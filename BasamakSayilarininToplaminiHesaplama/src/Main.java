import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Enter a Number : ");
        number = scanner.nextInt();
        int tempNumber = number;
        int basamakValue;
        int result = 0;
        while(tempNumber != 0){
            basamakValue = tempNumber % 10;
            result += basamakValue;
            tempNumber = tempNumber /10;
        }
        System.out.println("The sum of the digits of the entered number : " + result);


    }
}
