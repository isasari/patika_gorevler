import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar, kdvOran;
        System.out.print("Kdv'sini hesaplamak istediğiniz tutarı yazınız: ");
        tutar=input.nextDouble();

        boolean kosul = tutar >= 1000;
        double yeniKdv = kosul ? 0.08 : 0.18;
        kdvOran=yeniKdv;

        double kdvli, kdvsiz, kdvMiktar;
        kdvsiz=tutar;
        System.out.println("Ürünün Kdv'siz ücreti : " +  tutar);
        System.out.println("Ürüne ugulanan kdv oranı : " + kdvOran);
        kdvMiktar = tutar*kdvOran;
        System.out.println("Ürünün Kdv miktarı : " + kdvMiktar);
        kdvli=tutar+kdvMiktar;
        System.out.println("Ürünün Kdv'li fiyatı : " + kdvli);


    }
}