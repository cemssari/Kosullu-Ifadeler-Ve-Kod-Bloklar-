import java.util.Scanner;

public class HavaSicakliginaGöreEtkinlikÖnerme {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz : ");
        heat = input.nextInt();
        
        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat >= 5 && heat <= 15) {
            System.out.println("Sinemaya Gidebilirsiniz.");
            
        }  if (heat >= 10 && heat <= 25) {
            System.out.println("Pikniğe gidebilirsiniz.");

        } else if (heat > 25) {
            System.out.println("Yüzmeye gidebilirsiniz");
        }


    }
}
