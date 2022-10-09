import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fizik, kimya, turkce, tarih, muzik;

        System.out.print("Matematik notunuzu giriniz:");
        mat=input.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        fizik=input.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        kimya=input.nextInt();

        System.out.print("Türkçe notunuzu giriniz:");
        turkce=input.nextInt();

        System.out.print("Tarih notunuzu giriniz:");
        tarih=input.nextInt();

        System.out.print("Muzik notunuzu giriniz:");
        muzik=input.nextInt();

        int toplam=mat+fizik+kimya+turkce+tarih+muzik;
        System.out.println("Sınav puanlarınızın toplamı " + toplam);
        double ortalama=toplam/6;
        System.out.println("Girdiğiniz 6 derse ait not ortalaması: " + ortalama);


        boolean kosul = ortalama >= 60;
        String gectiMi = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(gectiMi);

     }
}