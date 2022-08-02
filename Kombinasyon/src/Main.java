import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Kombinasyon Formülü  C(n,r) = n! / (r!*(n-r)!)

        Scanner scanner = new Scanner(System.in);

        int n,r;

        int nFaktöriyel = 1;
        int rFaktöriyel = 1;
        int xFaktöriyel = 1;
        double kombinasyon;
        System.out.print("n değerini giriniz : ");
        n = scanner.nextInt();
        System.out.print("r değerini giriniz : ");
        r = scanner.nextInt();

        int x = n-r;

        if(n>r){

            for (int i=1 ; i<=n ; i++){
                nFaktöriyel = nFaktöriyel * i;
            }
            for(int j=1 ; j<=r ; j++){
                rFaktöriyel = rFaktöriyel * j;
            }
            for (int k=1; k<=x; k++){
                xFaktöriyel = xFaktöriyel * k;
            }
            kombinasyon = nFaktöriyel / (rFaktöriyel*xFaktöriyel);
            System.out.println("C(n,r) : " + kombinasyon);
        }else{
            System.out.println("n degeri r den buyuk olmali");
        }


    }
}
