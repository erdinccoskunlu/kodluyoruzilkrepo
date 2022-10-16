import java.util.Scanner;

public class Main {
    static int exponential(int number, int power){
        int result=1;
        if(power>1){
            for(int i=1; i<=(power-1); i++){
                result = result * number;
            }
            return number * exponential(number,power-1);
        }else if(power == 0){
            return 1;
        }else{
            return number;
        }

    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number, power;
        System.out.print("Enter a Number : ");
        number = scanner.nextInt();
        System.out.print("Enter a Power : ");
        power = scanner.nextInt();
        if(number>0 && power>=0){
            System.out.println("Result : " + exponential(number,power));
        }else{
            System.out.println("Number have to be bigger than 0 and Power have to be positive number!");
        }



    }
}