import java.util.Scanner;

public class Tek {
    public static void main(String[] args) {

        //Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden
        // ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.

        Scanner input = new Scanner(System.in);

        int a;
        int total = 0;

        do {
            System.out.print("Değer giriniz: ");
            a = input.nextInt();

            if (a % 2 == 1) {
                total += a;    //toplam = toplam + a
            }

        } while (a > 0);

        System.out.println("Tek Sayılar Toplamı: " + total);


        //Ödev
        //Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
        //çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

        Scanner inp = new Scanner(System.in);

        int b;
        int toplam1 = 0;

        do {
            System.out.print("Değer giriniz: ");
            b = input.nextInt();

            if (b % 2 == 0 && b % 4 == 0) {
                toplam1 += b;
            }
        } while (b > 0);

        System.out.println("Çift ve 4'ün Katları Olan Sayılar Toplamı: " + toplam1);

    }
}
