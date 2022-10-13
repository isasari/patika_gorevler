import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, deger = 0, n, gecici, k = 0, sonuc = 1, toplam = 0;
        System.out.print("Sayı giriniz: ");
        deger = input.nextInt();
        gecici = deger;
        while (gecici != 0) {
            gecici /= 10;
            k++;
        }
        System.out.println("basamak sayısı:" + k);

        gecici = deger;
        while (gecici != 0) {
            n = gecici % 10;
            System.out.println("basamaktaki sayı: " + n);
            for (i = 0; i < k; i++) {
                sonuc *= n;
            }
            System.out.println(sonuc);
            toplam += sonuc;
            sonuc = 1;
            gecici /= 10;
        }
        System.out.println(toplam);
        if (deger == toplam) {
            System.out.println(deger + " armstrong sayıdır.");
        } else System.out.println(deger + " armstrong sayı değildir.");


    }
}




