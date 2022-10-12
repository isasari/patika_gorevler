import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int i, r, n,f, sonuc, fakn=1, fakr=1,fakf=1;

        System.out.print("Kümenin elaman sayısını giriniz: ");
        n= input.nextInt();
        System.out.print("Kombinasyonların kaç elemanlı olacağını giriniz: ");
        r=input.nextInt();
        if(r>=n){
            System.out.println("Hatalı giriş yaptınız.");
            return;
        }
        f=n-r;
        for (i=1; i<=n; i++){
            fakn = fakn*i;
        }
        for (i=1; i<=r; i++){
            fakr = fakr*i;
        }
        for (i=1;i<=f;i++){
            fakf*=i;
        }
        sonuc= fakn / (fakr * (fakf));
        System.out.println(sonuc);
}}



