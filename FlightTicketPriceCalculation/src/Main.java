import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Değişkenler tanımlandı
        int distance, age, type;
        double distancePrice = 0.10, price, totalPrice, discountPriceAge, discountPriceType, discountForTwelve = 0.50, discountForTwenty = 0.10, discountForSixty = 0.30,
                discountRateAge = 1, discountRateType = 1;

        System.out.print("Please enter the distance in KM : ");
        distance = scanner.nextInt();
        System.out.print("Please enter your age : ");
        age = scanner.nextInt();
        System.out.print("1- One Way\n2- Return\nChoose : ");
        type = scanner.nextInt();
        if((distance>0 && age>0) && (type == 1 || type == 2)){
            // Normal fiyat
            price = distance * distancePrice;
            System.out.println(" Normal Price : " + price +" TL");


            // Yaş koşuluna göre indirim oranı belirlenmesi ve indirimlerin hesaplanması
            if(age < 12){
                discountRateAge = discountForTwelve;
            } else if (age < 24 ) {
                discountRateAge = discountForTwenty;
            } else if (age > 65) {
                discountRateAge = discountForSixty;
            }else{
                discountRateAge = discountRateAge;
            }

            discountPriceAge = price * discountRateAge;
            System.out.println("Age discounted price : " + discountPriceAge +" TL");

            // Yolculuk türüne göre indirim oranı belirlenmesi ve indirimlerin hesaplanması sonucun yazılması
            switch (type){
                case 1:
                    totalPrice = price - discountPriceAge;
                    System.out.println(" Total Price : " + totalPrice + " TL");
                    break;
                case 2:
                    discountRateType = 0.20;
                    discountPriceType = (price - discountPriceAge) * discountRateType;
                    System.out.println("Return discounted price : " + discountPriceType +" TL");
                    totalPrice = (price - discountPriceAge - discountPriceType) * 2 ;
                    System.out.println(" Total Price : " + totalPrice + " TL");
                    break;
                default:
                    System.out.println("Entered wrong value");
            }



        }else {
            System.out.println("Entered wrong value!");
        }

    }
}
