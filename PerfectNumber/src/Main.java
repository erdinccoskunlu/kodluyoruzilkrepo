import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number, result=0;
        System.out.print("Enter Number : ");
        number = scanner.nextInt();


        for(int i =1; i<number; i++){

            if(number %i==0){
                 result += i;
            }

        }

        if(number == result){
            System.out.println("Entered Number : " + number + " is Perfect Number...");
        }else{
            System.out.println("Entered Number : " + number + " is not Perfect Number...");
        }
    }
}
