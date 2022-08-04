import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz : ");

        int value = scanner.nextInt();
        int newValue = value -1 ;

        for(int i = 1; i<=value; i++){
            for(int k=1; k<=(value-i); k++){
                System.out.print(" ");
            }

            for(int j=1; j<=(2*i) -1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int m=newValue; m>=1; m--){
            for(int n=1; n<=(newValue-m+1); n++){
                System.out.print(" ");
            }
            for (int o=1; o<=(2*m)-1; o++){
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
