import java.util.Scanner;

public class Main {

    static void addition(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("First Number : ");
        int n1 =  scanner.nextInt();
        System.out.print("Second Number : ");
        int n2 =  scanner.nextInt();

        int result = n1 + n2;
        System.out.println("Result : " + result);

    }

    static void subtraction(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("First Number : ");
        int n1 =  scanner.nextInt();
        System.out.print("Second Number : ");
        int n2 =  scanner.nextInt();

        int result = n1 - n2;
        System.out.println("Result : " + result);
    }

    static void muliplication(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("First Number : ");
        int n1 =  scanner.nextInt();
        System.out.print("Second Number : ");
        int n2 =  scanner.nextInt();

        int result = n1 * n2;
        System.out.println("Result : " + result);
    }

    static void division(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("First Number : ");
        int n1 =  scanner.nextInt();
        System.out.print("Second Number : ");
        int n2 =  scanner.nextInt();
        double result;
        if(n2<=0){
            System.out.println("Second number is greater than 0...");
        }else{
            result = n1 / n2;
            System.out.println("Result : " + result);
        }

    }
    static void exponential(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("First Number : ");
        int n1 =  scanner.nextInt();
        System.out.print("Exponential Number : ");
        int n2 =  scanner.nextInt();

        int result=1;
        for(int i=1; i<=n2; i++){
            result *=n1;
        }
        System.out.println("Result : " + result);
    }

    static  void factorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n1 =  scanner.nextInt();

        int result=1;
        for(int i=1; i<=n1; i++){
            result *=i;
        }
        System.out.println("Result : " + result);
    }

    static  void mod(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("First Number : ");
        int n1 =  scanner.nextInt();
        System.out.print("Second Number : ");
        int n2 =  scanner.nextInt();
        int result = n1 % n2;
        System.out.println("Result : "+ result);
    }

    static  void rec(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Short Edge : ");
        int n1 =  scanner.nextInt();
        System.out.print("Long Edge : ");
        int n2 =  scanner.nextInt();

        int recArea = n1 * n2;
        int recPerimeter = 2 * (n1 + n2);
        System.out.println("Rectangular Area : " + recArea);
        System.out.println("Rectangular Perimeter : " + recPerimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select;
        String menu = "1- Addition\n"
                +"2- Subtraction\n"
                +"3- Multiplication\n"
                +"4- Division\n"
                +"5- Exponential Number Calculating\n"
                +"6- Factorial Calculating\n"
                +"7- Module Calculating\n"
                +"8- Rectangular Area and Perimeter Calculating\n"
                +"0- Quit";


        do {
            System.out.println(menu);
            System.out.print("What is your process? : ");
            select = scanner.nextInt();

            switch (select){
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    muliplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    exponential();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rec();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("You entered wrong choose. Please try again!");
            }

        }while (select !=0);


    }
}