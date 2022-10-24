import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int list[] = {25,47,58,96,120};
        Arrays.sort(list);
        System.out.print("Bir sayı giriniz: ");
        int k = inp.nextInt();
        int big = list[0], small = list[0];

        for (int i : list) {
            if (k>i) {
                small = i;
            }
            if (k<i) {
                big = i;
                break;
            }
        }
        System.out.println("listede yer alan sayılardan " + "k" + " sayısından büyük, en yakın olanı : " + big);
        System.out.println("listede yer alan sayılardan " + " k" + " sayısından küçük, en yakın olanı : " + small);
    }
}
