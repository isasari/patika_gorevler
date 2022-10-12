import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, total = 0;

        do {
            System.out.print("Sayı giriniz: ");
            n = input.nextInt();
            if (n%4==0){
                total+=n;
                }
        } while (n > 0);
        System.out.println("Girdiğiniz 4e bölünen sayıların toplamı: " + total);

}}



