import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r,a;
        double alan, pi=3.14;
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextInt();
        System.out.print("Daire diliminin ölçüsünü giriniz: ");
        a = input.nextInt();
        alan= r*r*a*pi/360;
        System.out.print("Yarıçapı " + r + " ve açısı " + a + " olan daire diliminin alanı " + alan + "dır.");
    }
}