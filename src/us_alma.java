import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int i, k, n, sonuc=1, sayac=0;

        System.out.print("Üssünü almak istediğiniz sayıyı giriniz: ");
        n = input.nextInt();
        System.out.print("üs olacak sayıyı giriniz: ");
        k=input.nextInt();

        for (i=0; i<k; i++){
           sonuc*=n;
            }
        System.out.println(sonuc);
}}



