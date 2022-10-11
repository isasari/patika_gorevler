
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sene, kalan;
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl giriniz: ");
        sene = input.nextInt();
        if ((sene < 0)) {
            System.out.print("Hatalı giriş yaptınız.");
            return;
        }else kalan = sene%4;

        if((kalan==0)){
            if ((sene%100==0)&&(sene%400==0)){
                System.out.println(sene + " yılı artık yıldır.");
            }else System.out.println(sene + " yılı artık yıl değildir..");

        }else System.out.println(sene + " yılı artık yıl değildir.");

    }}



