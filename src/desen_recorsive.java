import java.util.Scanner;

public class Main {
    static int eksi(int number) {
        if (number < 0) {
            topla(number);
            return number;
        }
        number -= 5;
        System.out.print(number + " ");
        eksi(number);
        return number;
    }
    static void topla(int number) {
        number += 5;
        if (number >= 40) {
            return;
        }
        System.out.print(number + " ");
        topla(number);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int number = input.nextInt();
        eksi(number);
    }
}













