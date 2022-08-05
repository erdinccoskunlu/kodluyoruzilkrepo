import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scannner = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int select;
        int balance = 2000;
        int price;


        while (right>0){
            System.out.print("User Name : ");
            userName = scannner.nextLine();
            System.out.print("Password : ");
            password = scannner.nextLine();

            if(userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba Kodluyoruz Bankasına Hoşgeldiniz.");
                do {

                    System.out.println("1-Para Yatırma\n"+
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n"+
                            "4-Çıkış Yap");
                    System.out.print("Lütfen Yapmak istediğiniz işlemi şeçiniz : ");
                    select = scannner.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Yatırmak istediğiniz tutarı giriniz : ");
                            price = scannner.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz tutarı giriniz : ");
                            price = scannner.nextInt();
                            if(price > balance){
                                System.out.println("Yetersiz Bakiye. Bakiyeniz : " + balance);
                            }else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Bizi tercih ettiğiniz için teşekkürler...");
                            break;
                        default:
                            System.out.println("hatalı tuşlama yaptınız.");
                    }
                }while(select !=4);
            }else{
                right--;
                System.out.println("Hatalı kullanıcı adı ya da şifre. Lütfen tekrar deneyiniz.");
                if(right == 0){
                    System.out.println("Hesabınız Bloke Olmuştur Lütfen Bankanızla İletişime Geçin.");
                }else{
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }

        }




    }
}
