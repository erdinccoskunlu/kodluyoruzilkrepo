import java.util.Scanner;

public class Main {
    static void pattern(int number, int fix){
        int result = number;
        System.out.println(number);

        if(result>0) {
            result -=5;
            pattern(number - 5,fix);
        }else {
            patternPlus(result, fix);
        }
    }
    static void patternPlus(int rise, int fix){
        int result1 = rise+5;

        if(result1<= fix){
            System.out.println(result1);
            patternPlus(rise+5,fix);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a Number : ");
        int number = scanner.nextInt();
        int fix = number;
        pattern(number,fix);


    }
}

/*
        Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

        Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
        Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
        Yine her ekleme işleminde sayının son değerini ekrana yazdırın.

        11
        6
        1
        -4



        */