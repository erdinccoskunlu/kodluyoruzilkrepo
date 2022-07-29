import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int math, physics, turkish, chemical, music;
        double average;

        System.out.print("Your math grade : ");
        math = scanner.nextInt();
        math = math>0 && math<=100 ? math : 0;
        System.out.print("Your physics grade : ");
        physics = scanner.nextInt();
        physics = physics>0 && physics<=100 ? physics : 0;
        System.out.print("Your turkish grade : ");
        turkish = scanner.nextInt();
        turkish = turkish>0 && turkish<=100 ? turkish : 0;
        System.out.print("Your chemical grade : ");
        chemical = scanner.nextInt();
        chemical = chemical>0 && chemical<=100 ? chemical : 0;
        System.out.print("Your music grade : ");
        music = scanner.nextInt();
        music = music>0 && music<=100 ? music : 0;

        average = (math + physics + turkish + chemical + music) / 5 ;
        if(average>=55){
            System.out.println("Congratulations! You Passed...");
        }else{
            System.out.println("You Don't Pass");
        }
        System.out.println("Your Average : " + average);
    }
}
