import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilo, boy, indeks;

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu  giriniz: ");
        kilo = input.nextDouble();
        indeks = kilo/(boy*boy);
        System.out.print("Boyunuz " + boy +", "+ "kilonuz " + kilo + ", "+ "bu bilgilere göre vucut kitle indeksiniz : " + indeks    );
    }
}