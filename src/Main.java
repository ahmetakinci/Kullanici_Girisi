import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String id, password, choose;


        System.out.print("Kullanıcı adınızı giriniz: ");
        id = scanner.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password = scanner.nextLine();

        if (id.equals("ahmet arif") && password.equals("akıncı")) {
            System.out.println("Başarıyla giriş yaptınız...");
        } else {
            System.out.println("Giriş bilgileriniz yanlış, şifrenizi sıfırlamak istiyor musunuz?");
            choose = scanner.nextLine();
            if (choose.equals("evet")) {
                System.out.print("Yeni şifrenizi girin: ");
                password = scanner.nextLine();
                if (password.equals("akıncı")){
                    System.out.println("Şifre oluşturulamadı lütfen başka şifre girin");
                } else {
                    System.out.println("Şifre oluşturuldu");
                }

            } else if (choose.equals("hayır")) {
                System.out.println("Şifreniz sıfırlanmamıştır...");
            } else {
                System.out.println("Geçersiz işlem...");
            }
        }
    }
}
