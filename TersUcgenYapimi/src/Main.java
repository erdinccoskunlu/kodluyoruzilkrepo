import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your number : ");
        int number = scanner.nextInt();

        for(int i = 1; i<=number; i++){

            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }

            for(int k=1; k<=(2*(number-i+1)-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
