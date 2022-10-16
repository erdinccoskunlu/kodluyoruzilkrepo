import java.util.Scanner;

public class Main {

    static void isPrime(int number, int index){
        if(number == index){
            System.out.println(number + " is Prime.");
            return;
        }else if(number % index==0){
            System.out.println(number + " is not Prime.");
            return;
        }

        isPrime(number,index+1);


    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a Number : ");
        int number = scanner.nextInt();

        isPrime(number,2);

    }
}
