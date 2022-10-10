
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int gun, ay;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı giriniz:  ");
        ay = input.nextInt();
        if((ay<1)||(ay>12)){
            System.out.println("Hatalı giriş yaptınız.");
            return;
        }

        System.out.print("Doğduğunuz günü giriniz: ");
        gun = input.nextInt();

        if(ay==1){
            if((gun>=21)&&(gun<=31)){
                System.out.println("Kova Burcu");
            }else if ((gun>=1)&&(gun<=20)) {
                System.out.println("Oğlak Burcu");
            }else System.out.println("Hatalı giriş yaptınız.");
        }

        if(ay==2){
            if((gun>=20)&&(gun<=29)){
                System.out.println("Balık Burcu");
            }else if ((gun>=1)&&(gun<=19)) {
                System.out.println("Kova Burcu");
            }else System.out.println("Hatalı giriş yaptınız.");
        }

        if(ay==3){
            if((gun>=21)&&(gun<=31)){
                System.out.println("Koç Burcu");
            }else if ((gun>=1)&&(gun<=20)) {
                System.out.println("Balık Burcu");
            }else System.out.println("Hatalı giriş yaptınız.");
        }

        if(ay==4){
            if((gun>=21)&&(gun<=30)){
                System.out.println("Boğa Burcu");
            }else if ((gun>=1)&&(gun<=20)) {
                System.out.println("Koç Burcu");
            }else System.out.println("Hatalı giriş yaptınız.");
        }

        if(ay==5){
            if((gun>=22)&&(gun<=31)){
                System.out.println("İkizler Burcu");
            }else if ((gun>=1)&&(gun<=21)) {
                System.out.println("Boğa Burcu");
            }else System.out.println("Hatalı giriş yaptınız.");
        }

        if(ay==6){
            if((gun>=21)&&(gun<=30)){
                System.out.println("Yengeç Burcu");
            }else if ((gun>=1)&&(gun<=22)) {
                System.out.println("İkizler Burcu");
            }else System.out.println("Hatalı giriş yaptınız.");
        }

        if(ay==7){
            if((gun>=23)&&(gun<=31)){
                System.out.println("Aslan Burcu");
            }else if ((gun>=1)&&(gun<=22)) {
                System.out.println("Yengeç Burcu");
            }else System.out.println("Hatalı giriş yaptınız.");
        }

        if(ay==8){
            if((gun>=23)&&(gun<=31)){
                System.out.println("Başak Burcu");
            }else if ((gun>=1)&&(gun<=22)) {
                System.out.println("Aslan Burcu");
            }else System.out.println("Hatalı giriş yaptınız.");
        }

        if(ay==9){
            if((gun>=23)&&(gun<=30)){
                System.out.println("Terazi Burcu");
            }else if ((gun>=1)&&(gun<=22)) {
                System.out.println("Başak Burcu");
            }else System.out.println("Hatalı giriş yaptınız.");
        }

        if(ay==10){
            if((gun>=23)&&(gun<=31)){
                System.out.println("Akrep Burcu");
            }else if ((gun>=1)&&(gun<=22)) {
                System.out.println("Terazi Burcu");
            }else System.out.println("Hatalı giriş yaptınız.");
        }

        if(ay==11){
            if((gun>=22)&&(gun<=30)){
                System.out.println("Yay Burcu");
            }else if ((gun>=1)&&(gun<=21)) {
                System.out.println("Akrep Burcu");
            }else System.out.println("Hatalı giriş yaptınız.");
        }

        if(ay==12){
            if((gun>=22)&&(gun<=31)){
                System.out.println("Oğlak Burcu");
            }else if ((gun>=1)&&(gun<=21)) {
                System.out.println("Yay Burcu");
            }else System.out.println("Hatalı giriş yaptınız.");
        }


    }
}