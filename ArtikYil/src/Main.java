import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year, remainder;

        System.out.print("Enter Year : ");
        year = scanner.nextInt();

        remainder = year % 4 ;
        if (remainder == 0){
            System.out.println(year + " is leap year");
        }else {
            System.out.println(year + "  is not leap year");
        }
    }
}
