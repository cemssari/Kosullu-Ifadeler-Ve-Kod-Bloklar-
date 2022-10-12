import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {

        int age,distance,journeyType;
        double price,discount = 0.0;


        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen mesafe bilgisini KM cinsinden giriniz : ");
        distance = input.nextInt();
        System.out.print("Lütfen yaşınızı giriniz : ");
        age = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1=> Tek Yön , 2=> Gidiş Dönüş) : ");
        journeyType = input.nextInt();

        price = distance * 0.1;

        if (distance > 0 && age > 0) {
            if (age < 12) {
                discount = 0.5;
            } else if (age < 24) {
                discount = 0.1;
            } else if (age > 65) {
                discount = 0.3;
            } else {
                discount = 0;
            }

            price *= (1 - discount);

            switch (journeyType) {
                case 1:
                    break;
                case 2:
                    discount = 0.2;
                    price *= 2 * (1 - discount);
                    break;
                default:
                    System.out.println("Hatalı Veri Girdiniz !");
            }
            System.out.println("Toplam tutar = " +price + " TL");
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}