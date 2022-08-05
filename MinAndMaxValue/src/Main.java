import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n ;
        int numbers;
        int max=0, min=0;
        System.out.print("Kaç Tane Sayı Gireceksiniz : ");
        n = scanner.nextInt();
        int i = 1;
        if(n>0){
            while(i<=n){
                System.out.print(i + ". Sayıyı giriniz : ");
                numbers = scanner.nextInt();

                if(n==1){
                    max = numbers;
                    min = numbers;
                }else{

                    if(numbers>max){
                        max = numbers;
                    } else if ( numbers<min) {
                        min = numbers;
                    }

                }

                i++;
            }
            System.out.println();
            System.out.println("En büyük sayı : " + max);
            System.out.println("En küçük sayı : " + min);

        }else{
            System.out.println("Lütfen Pozitif Bir Değer Giriniz.");
        }






    }
}

