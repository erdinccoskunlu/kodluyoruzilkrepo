import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int heat;

        System.out.println
                ("What is the temperature? \n1- less than 5 degrees\n2- between 5 and 15 degress\n" +
                        "3- between 15 and 25 degress\n4- more than 25 degress");
        System.out.print("Choose : ");
        heat = scanner.nextInt();

        switch (heat){
            case 1:
                System.out.println("You can go skiing");
                break;
            case 2:
                System.out.println("You can go to the cinema");
                break;
            case 3:
                System.out.println("You can go on a picnic");
                break;
            case 4:
                System.out.println("You can go swimming");
                break;
            default:
                System.out.println("You entered incorrectly, please try again");
        }

    }
}
