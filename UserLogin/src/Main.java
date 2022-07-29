import java.util.Scanner;

// www.patika.dev
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName="patika", password, newPassword, userPassword="java123";
        int select;
        System.out.print("Enter your username : ");
        userName = scanner.nextLine();
        System.out.print("Enter your password : ");
        password = scanner.nextLine();

        if(userName.equals(userName)){
            if(password.equals(userPassword)){
                System.out.println("Login Successful.");
            }else{
                System.out.println("Wrong password.\n 1- to set a new password \n 2- Cancel");
                System.out.print("Your choice : ");

                select = scanner.nextInt();
                switch (select){
                    case 1:
                        System.out.print("Create new password : ");
                        Scanner scanner1 = new Scanner(System.in);
                        newPassword = scanner1.nextLine();
                        if(newPassword.equals(password) || newPassword.equals(userPassword)){
                            System.out.println("Could not create password, please enter another password");
                        }else{
                            System.out.println("Password created");
                        }
                        break;
                    case 2:
                        System.out.println("Please try again...");
                }
            }
        }else {
            System.out.println("User not found. Please Check your username and try again");
        }
    }

}
