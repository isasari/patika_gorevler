import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secim;

        String menu = ("Listeden yapmak istediğiniz işlemi seçiniz." +
                "\n1- Toplama " +
                "\n2- Çıkarma" +
                "\n3- Çarpma" +
                "\n4- Bölme" +
                "\n5- Üs al" +
                "\n6- Faktoriyel hesapla" +
                "\n7- Mod al" +
                "\n8- Dikdörtgen alan ve çevre hesapla" +
                "\n0- Çıkış" +
                "\n");
        System.out.print(menu);

        while (true) {
            System.out.print("Listeden yapmak istediğiniz işlemi seçiniz. Seçiminiz: ");
            secim = input.nextInt();
            if (secim == 0) break;


            switch (secim) {
                case 1:
                    top();
                    break;
                case 2:
                    eksi();
                    break;
                case 3:
                    carp();
                    break;
                case 4:
                    bol();
                    break;
                case 5:
                    us();
                    break;
                case 6:
                    fak();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    alan();
                    break;

                default:
                    System.out.println("Hatalı giriş yaptınız.");
                    break;
            }
        }

    }

    static int top() {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayı: ");
       int  a = input.nextInt();
        System.out.print("İkinci sayı: ");
        int b = input.nextInt();
        int sonuc = a + b;
        System.out.print("Girdiğiniz iki sayının toplamı :" + sonuc);
        System.out.println();
        return sonuc;
    }


    static int eksi() {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayı: ");
       int  a = input.nextInt();
        System.out.print("İkinci sayı: ");
        int b = input.nextInt();
        int sonuc = a - b;
        System.out.print("Girdiğiniz iki sayının farkı :" + sonuc + "\n");
        return sonuc;
    }

    static int carp() {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayı: ");
        int a = input.nextInt();
        System.out.print("İkinci sayı: ");
        int b = input.nextInt();
        int sonuc = a * b;
        System.out.print("Girdiğiniz iki sayının çarpımı :" + sonuc + "\n");
        return sonuc;
    }

    static int bol() {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayı: ");
        int a = input.nextInt();
        System.out.print("İkinci sayı: ");
        int b = input.nextInt();
        if (b == 0) {
            System.out.println("Sayı sıfıra bölünmez.");
            return 0;
        }
        double sonuc = a / b;
        System.out.print("Girdiğiniz iki sayının bölümün :" + sonuc + "\n");
        return 1;

    }

    static int us() {Scanner input = new Scanner(System.in);
        System.out.print("Taban: ");
        int a = input.nextInt();
        System.out.print("Üs: ");
        int b = input.nextInt();
        int sonuc = 1;
        for (int i = 1; i <= b; i++) {
            sonuc = sonuc * a;
        }
        System.out.print("Girdiğiniz iki sayının üssü :" + sonuc + "\n");
        return sonuc;
    }

    static int fak() {
        Scanner input = new Scanner(System.in);
        System.out.print("Faktoriyel hesaplamak istediğiniz sayıyı giriniz: ");
        int a = input.nextInt();
        int sonuc = 1;
        for (int i = 1; i <= a; i++) {
            sonuc = sonuc * i;
        }
        System.out.print(a + "sayısının faktoriyeli: " + sonuc + "\n");
        return sonuc;
    }

    static int mod() {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayı: ");
        int a = input.nextInt();
        System.out.print("İkinci sayı: ");
        int b = input.nextInt();
        int sonuc = a % b;
        System.out.print(a + "sayısının " + b  + " sayısına göre modu: "+ sonuc + "\n");
        return sonuc;
    }

    static int alan() {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayı: ");
        int a = input.nextInt();
        System.out.print("İkinci sayı: ");
        int b = input.nextInt();
        int sonuc = a * b;
        System.out.print("Kenarları " + a  + " ve "  + b +  " olan dikdörtgenin alanı : " +  sonuc + "\n");
        int cevre=2*(a+b);
        System.out.print("Kenarları " + a  + " ve "  + b +  " olan dikdörtgenin çevresi : " +  cevre + "\n");
        return sonuc;

    }


}













