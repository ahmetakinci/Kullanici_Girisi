import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1, n2;
        int choose;

        System.out.print("Birinci sayıyı giriniz: ");
        n1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı giriniz: ");
        n2 = scanner.nextDouble();

        System.out.println("Yapmak istediğiniz işlemi seçiniz...");
        System.out.println("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme");

        choose = scanner.nextInt();

        switch (choose){
            case 1 :
                System.out.println("Sayıların toplamı " + n1 + n2);
                break;
            case 2 :
                System.out.println("Sayıların çıkarma işlemi " + (n1 - n2));
                break;
            case 3 :
                System.out.println("Sayıların çarpımı " + (n1*n2));
                break;
            case 4 :
                if (n2 !=0){
                System.out.println("Sayıların bölümü " + (n1/n2));
                }else{
                    System.out.println("Bir sayı sıfıra bölünemez...");
                }
                break;
            default:
                System.out.println("Geçersiz Sayı Seçimi...");
        }
    }
}
