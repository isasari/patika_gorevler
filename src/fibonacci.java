import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fibo = 0, x = 1, y = 1, z, number;

        System.out.print("Eleman sayısını giriniz: ");
        number = input.nextInt();
        System.out.print(fibo + " " + x + " " + y + " ");

        for (int i = 0; i < (number - 3); i++) {
            fibo = x + y;
            System.out.print(fibo + " ");
            z = x + y;
            x = y;
            y = z;


        }
    }
    }










