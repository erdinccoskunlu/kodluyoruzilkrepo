import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number ;
        System.out.print("Enter Number : ");
        number = scanner.nextInt();
        double result =0;
        for(double i = 1; i<=number; i++){
            result += (1/i);

        }
        System.out.println("Result : " + result);
    }
}
