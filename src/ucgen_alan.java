import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kenar1, kenar2, kenar3;
        System.out.print("Alan hesaplamasını istediğiniz üçgene ait kenar uzunluğunu giriniz: ");
        kenar1=input.nextInt();
        System.out.print("Alan hesaplamasını istediğiniz üçgene ait kenar uzunluğunu giriniz: ");
        kenar2= input.nextInt();
        System.out.print("Alan hesaplamasını istediğiniz üçgene ait kenar uzunluğunu giriniz: ");
        kenar3= input.nextInt();
        System.out.println("Girdiğiniz kenar uzunlukları : " + kenar1 +"-"+ kenar2 +"-"+kenar3);

        int cevre = kenar1 + kenar2 +  kenar3;
        System.out.println("Kenarlarını girdiğiniz üçgenin çevresi: " + cevre);
        double u = cevre/2;
        double alan;
        alan = Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.println("Girdiğiniz uzunlukların ait olduğu üçgenin alanı :" + alan);



    }
}