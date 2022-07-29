import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month, day;

        System.out.print("Which month were you born : ");
        month = scanner.nextInt();


        if(month>=1 && month<=12){
            System.out.print("Which day were you born : ");
            day = scanner.nextInt();

            if(day>=1 && day<=31){
                if(month==1 && day<22){
                    System.out.println("You are a Capricorn.");
                } else if (month ==1 && day>21){
                    System.out.println("You are an Aquarius");
                } else if (month==2 && day<20) {
                    System.out.println("You are a Aquarius");
                } else if (month ==2 && day>19) {
                    System.out.println("You are a Pisces");
                } else if (month == 3 && day<21) {
                    System.out.println("You are a Pisces");
                } else if (month == 3 && day>20) {
                    System.out.println("You are an Aries");
                } else if (month == 4 && day<21) {
                    System.out.println("You are an Aries");
                } else if (month == 4 && day>20) {
                    System.out.println("You are a Taurus");
                } else if (month == 5 && day<22) {
                    System.out.println("You are a Taurus");
                } else if (month == 5 && day>21) {
                    System.out.println("You are a Gemini ");
                } else if (month == 6 && day<23) {
                    System.out.println("You are a Gemini");
                } else if (month == 6 && day>22) {
                    System.out.println("You are a Cancer");
                } else if (month == 7 && day<23) {
                    System.out.println("You are a Cancer");
                } else if (month == 7 && day>22) {
                    System.out.println("You are a Lion");
                } else if (month == 8 && day<23) {
                    System.out.println("You are a Lion");
                } else if (month ==8 && day >22) {
                    System.out.println("You are a Virgo");
                } else if (month==9 && day<23) {
                    System.out.println("You are a Virgo");
                } else if (month==9 && day>22) {
                    System.out.println("You are a Libra");
                } else if (month == 10 && day<23) {
                    System.out.println("You are a Libra");
                } else if (month== 10 && day>22) {
                    System.out.println("You are a Scorpio");
                } else if (month ==11 && day<22) {
                    System.out.println("You are a Scorpio");
                } else if (month ==11 && day>21) {
                    System.out.println("You are a Sagittarius");
                } else if (month == 12 && day<22) {
                    System.out.println("You are a Sagittarius");
                } else if (month ==12 && day>22) {
                    System.out.println("You are a Capricorn");
                }
            }else{
                System.out.println("Day value is wrong. Please check and try again!");
            }


        }else {
            System.out.println("Month value is wrong. Please check and try again!");
        }
    }
}
