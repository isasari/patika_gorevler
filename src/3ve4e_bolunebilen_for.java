import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k, i, ortalama,toplam=0,say=0;
        System.out.print("Kontrol etmek istediğiniz sayıyı giriniz: ");
        k = input.nextInt();

        for (i=1 ; k>=i; i++) {
            if(i%12==0){
            System.out.println(i);
            say=say+1;
            toplam=toplam+i;
           }
    }   ortalama=toplam/say;
        System.out.println(ortalama);

}}



