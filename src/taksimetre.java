import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int acilis= 10, km, minUcret=20;
        double kmUcreti = 2.20;
        Scanner input = new Scanner(System.in);
        System.out.print("Gideceğiniz yol kaç km: ");
        km=input.nextInt();

        double tutar = acilis + km*kmUcreti;
        tutar = tutar <20 ? minUcret : tutar;

        System.out.println("Gideceğiniz yolun ücreti " + tutar + " liradır.");



    }
}