import java.util.Scanner;

public class SınıfıGecmeDurumu {
    public static void main(String[] args) {
        int mat, turkce, fizik, kimya, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz : ");
        mat = inp.nextInt();
        System.out.print("Türkçe notunu giriniz : ");
        turkce = inp.nextInt();
        System.out.print("Fizik notunu giriniz : ");
        fizik = inp.nextInt();
        System.out.print("Kimya notunu giriniz : ");
        kimya = inp.nextInt();
        System.out.print("Müzik notunu giriniz : ");
        muzik = inp.nextInt();

        int i = 0, top = 0;
        if (mat<=100 && mat>=0) {
            i++;
            top = top + mat;
        }

        if (turkce<=100 && turkce>=0) {
            i++;
            top = top + turkce;
        }

        if (fizik<=100 && fizik>=0) {
            i++;
            top = top + fizik;
        }

        if (kimya<=100 && kimya>=0) {
            i++;
            top = top + kimya;
        }

        if (muzik<=100 && muzik>=0) {
            i++;
            top = top + muzik;
        }

        double avarage = (top/i);


        System.out.println("Not Ortalaması : " + avarage);

        if (avarage<55) {
            System.out.println("Sınıfta kaldınız,seneye tekrar görüşmek üzere!");
        } else {
            System.out.println("Tebrikler,sınıf geçtiniz !");
        }
    }
}
