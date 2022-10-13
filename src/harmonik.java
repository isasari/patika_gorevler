import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        double k, r;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        n=input.nextInt();

        for (int i=0; i<n; i++){
            k+=1/i;
        }
        System.out.println(k);
    }
}