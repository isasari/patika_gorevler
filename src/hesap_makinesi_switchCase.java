import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        int n1, n2, secim;

        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.println("1. toplama \n2. çıkarma \n3. çarpma \n4. bölme");
        System.out.print("Seçiminiz: ");
        secim = input.nextInt();

        switch (secim){
            case 1:
                System.out.println("Toplama işleminin sonucu: " + (n1+n2));
                break;
            case 2: System.out.println("Çıkarma işleminin sonucu: " + (n1-n2));
                break;
            case 3: System.out.println("Çarpma işleminin sonucu:  " + (n1*n2));
                break;
            case 4 :
                if (n2 !=0)
                    System.out.println("Bölme işleminin sonucu : " + (n1/n2));
                else System.out.println("Sayılar sıfıra bölünemez.");
                break;
            default:System.out.println("Hatalı giriş yaptınız.");
                break;
        }

    }
}