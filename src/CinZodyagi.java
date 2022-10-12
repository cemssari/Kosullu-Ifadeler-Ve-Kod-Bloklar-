import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {
        int year;
        String cinZodyagi = " ";

        Scanner inp=new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz : ");
        year=inp.nextInt();

        switch (year%12) {

            case 0:
                cinZodyagi="Maymun";
                break;
            case 1:
                cinZodyagi="Horoz";
                break;
            case 2:
                cinZodyagi="Köpek";
                break;
            case 3:
                cinZodyagi="Domuz";
                break;
            case 4:
                cinZodyagi="Fare";
                break;
            case 5:
                cinZodyagi="Öküz";
                break;
            case 6:
                cinZodyagi="Kaplan";
                break;
            case 7:
                cinZodyagi="Tavşan";
                break;
            case 8:
                cinZodyagi="Ejderha";
                break;
            case 9:
                cinZodyagi="Yılan";
                break;
            case 10:
                cinZodyagi="At";
                break;
            case 11:
                cinZodyagi="Koyun";
                break;
        }
        System.out.print("Çin Zodyağı Burcunuz : "+cinZodyagi);
    }
}
