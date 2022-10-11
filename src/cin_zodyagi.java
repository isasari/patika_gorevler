
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //String maymun, horoz, kopek, domuz, fare, okuz, kaplan, tavsan, ejderha, yilan, at, koyun;
        int sene, kalan;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum tarihinizi yıl olarak giriniz: ");
        sene = input.nextInt();
        if ((sene < 0) || (sene > 2022)) {
            System.out.print("Bu tarihte doğmanız mümkün gözükmüyor.");
            return;
        }else kalan = sene%12;

        if(kalan==0){ System.out.print("Çin Zodyağı burcunuz: Maymun"); }
        if(kalan==1){ System.out.print("Çin Zodyağı burcunuz: Horoz"); }
        if(kalan==2){ System.out.print("Çin Zodyağı burcunuz: Köpek"); }
        if(kalan==3){ System.out.print("Çin Zodyağı burcunuz: Domuz"); }
        if(kalan==4){ System.out.print("Çin Zodyağı burcunuz: Fare"); }
        if(kalan==5){ System.out.print("Çin Zodyağı burcunuz: Öküz"); }
        if(kalan==6){ System.out.print("Çin Zodyağı burcunuz: Kaplan"); }
        if(kalan==7){ System.out.print("Çin Zodyağı burcunuz: Tavşan"); }
        if(kalan==8){ System.out.print("Çin Zodyağı burcunuz: Ejderha"); }
        if(kalan==9){ System.out.print("Çin Zodyağı burcunuz: Yılan"); }
        if(kalan==10){ System.out.print("Çin Zodyağı burcunuz: At"); }
        if(kalan==11){ System.out.print("Çin Zodyağı burcunuz: Koyun"); }


    }}



