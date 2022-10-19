import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tabanı girniz: ");
        int a = input.nextInt();
        System.out.print("Üssü giriniz: ");
        int b = input.nextInt();

        System.out.println(pow(a, b));
    }

    static int pow(int a, int b ) {

        if (b == 0) return 1;
        return a * pow(a, b-1);
    }


}













