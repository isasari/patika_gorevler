import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int random = (int) (Math.random() * 100);
        System.out.println(random);
        int life = 5;
        int number;
        System.out.println("Sayı tahmin oyununa Hoş Geldiniz.");
        while (life > 0) {
            System.out.print(life + " hakkınız var." + " Tahmininiz: ");
            number = input.nextInt();
            if (number<0||number>100){
                System.out.println("Lütfen 0-100 arasında bir sayı giriniz.");
                continue;
            }
            if (number == random){
                System.out.println("Tebrikler, gizli sayıyı buldunuz.");
                break;
            } else  {
                if (number<random){
                    System.out.println("Tahmininiz gizli sayıdan küçük.");
                    life--;
                } else {
                    System.out.println("Tahmininiz gizli sayıdan büyük.");
                    life--;
                }
            }
        }
        System.out.println("Tüm hakları kullandınız. Sayıyı bulamadınız." + "\nSayı: " + random);
    }
}

