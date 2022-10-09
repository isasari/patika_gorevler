import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fizik, kimya, turkce, tarih, ortalama, toplamNot=0, toplamDersSayisi=0;


        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        if ((0<mat)&&(mat<=100)){  toplamNot += mat;
            toplamDersSayisi++;};

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        if ((0<fizik)&&(fizik<=100)){  toplamNot += fizik;
            toplamDersSayisi++;};

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        if ((0<kimya)&&(kimya<=100)){  toplamNot += kimya;
            toplamDersSayisi++;};


        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();
        if ((0<turkce)&&(turkce<=100)){  toplamNot += turkce;
            toplamDersSayisi++;};


        System.out.print("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();
        if ((0<=tarih)&&(tarih<=100)){ toplamNot += tarih;
            toplamDersSayisi++;};

        ortalama = toplamNot/toplamDersSayisi;
        if (ortalama >= 55) {
            System.out.println("Tebrikler sınıfı geçtiniz.");
        } else System.out.println("Sınıfta kaldınız.");

        System.out.println("Ortalamanız :" + ortalama);

    }
}

