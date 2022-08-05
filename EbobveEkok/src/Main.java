import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n1, n2;
        int i=1;
        int ebob=1;
        int j=1;

        System.out.print("n1 sayısını giriniz : ");
        n1 = scanner.nextInt();
        System.out.print("n2 sayısını giriniz : ");
        n2 = scanner.nextInt();

        if(n1<n2){
            while(i<=n1){
                if(n1%i == 0 && n2%i==0){
                    ebob = i;
                }
                i++;
            }
            System.out.println("EBOB : " +ebob);

            while (j<=(n1*n2)){
                if(j%n1==0 && j%n2==0){
                    System.out.println("EKOK : " + j);
                    break;
                }
                j++;
            }


        }else {
            while(i<=n2){
                if(n1%i == 0 && n2%i==0){
                    ebob = i;
                }
                i++;
            }
            System.out.println("EBOB : " +ebob);

            while (j<=(n1*n2)){
                if(j%n1==0 && j%n2==0){
                    System.out.println("EKOK : " + j);
                    break;
                }
                j++;
            }

        }



    }
}
