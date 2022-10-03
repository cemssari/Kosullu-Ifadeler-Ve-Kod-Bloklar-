import java.util.Scanner;

public class KullanaciGirisi {
    public static void main(String[] args) {
        String password,userName,passwordReset,newPassword;

        Scanner inp=new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz:");
        userName= inp.nextLine();
        System.out.print("Şifreniz:");
        password= inp.nextLine();

        if (userName.equals("patika") && password.equals("patika123")){
            System.out.println("Kullanıcı adı ve şifreniz doğru.\nGiriş yaptınız!");
        } else {
            System.out.println("Şifreniz yanlış.\nYeni bir şifre belirmek istiyorsanız \"Evet\" veya \"Hayır\"");
            passwordReset= inp.nextLine();

            if (passwordReset.equals("Hayır")){
                System.out.println("Giriş sonlandırıldı.");
            } else if (passwordReset.equals("Evet")) {
                System.out.println("Yeni şifrenizi girin.");
                newPassword= inp.nextLine();
                if (newPassword.equals("patika123")||newPassword.equals(password)){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else {
                    System.out.println("Şifre oluşturuldu.");
                }
            }else{
                System.out.println("Yanlış seçim yaptın.");
            }
        }

    }
}