import java.util.Scanner;

public class Main  {

    static boolean isPalidrom(int number){

        int tempNumber, reverseNumber=0, lastNumber;
        tempNumber = number;
        while (tempNumber !=0){
            lastNumber = tempNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            tempNumber = tempNumber/10;
        }
        if(number == reverseNumber)
            return true;
        else
            return false;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number : " );
        int value = scanner.nextInt();

        boolean isPalidrom = isPalidrom(value);
        if(isPalidrom == true)
            System.out.println("Number is Palidrom");
        else
            System.out.println("Number is not Palidrom");

    }
}