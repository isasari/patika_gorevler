
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int km;
        double tip=1,yas,birim=0.10,cocuk=0.5,genc=0.9,yasli=0.7, gitgel=0.8;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz:  ");
        km = input.nextInt();
        if (km<200){
            System.out.println("Bu mesafeye uçuşumuz yoktur.");
            return;
        }


        System.out.print("Tek yön için 1, gidiş dönüş için 2 tuşlayınız: ");
        tip = input.nextInt();
        if ((tip<1)||(tip>2)){
            System.out.println("Hatalı giriş yaptınız.");
            return;
        }
        if(tip==2){
            tip=gitgel;
        }


        System.out.print("Yaşınız:  ");
        yas= input.nextInt();
        if (yas<12){yas=cocuk;
        } else if (yas<24) {yas=genc;
        } else if (yas>65) {yas=yasli;
        }else yas = 1;

        double ucret =km*tip*birim*yas;
        System.out.println("Bilet Fiyatı: " + ucret);
    }


    }



