import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sene;
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl giriniz: ");
        sene = input.nextInt();
        if ((sene < 0)) {
            System.out.print("Hatalı giriş yaptınız.");
            return;
        }

        if (sene % 100 == 0) {if (sene%400==0){
            System.out.println(sene + " artık yıldır.");
        }else System.out.println(sene + " artık yıl değildir.");
        }else if (sene%4==0){
            System.out.println(sene + " artık yıldır.");
        }else System.out.println(sene + " artık yıl değildir.");
    }
}



