import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, deger = 0, n, gecici, k = 0, sonuc = 0, toplam = 0;
        System.out.print("Sayı giriniz: ");
        deger = input.nextInt();
        gecici = deger;

        while (gecici != 0) {
            gecici /= 10;
            k++;
        }
        gecici = deger;

        while (gecici != 0) {
            n = gecici % 10;
            for (i = 0; i < k; i++) {
            }
            toplam += n;
            gecici /= 10;}
            System.out.println("Girdiğiniz sayının sayı değerleri toplamı: " + toplam);
        }
    }





