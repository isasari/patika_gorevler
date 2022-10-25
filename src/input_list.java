import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int index=0;
        System.out.println("Listenizde kaç adet sayı olacak: ");
        int n = input.nextInt();
        int list[]=new int[n];
        for (int i=0; i< list.length;i++){
            System.out.print("Listenin " + (i+1) + ". elamanı: " );
            index=input.nextInt();
            list[i]=index;
        }
        Arrays.sort(list);
        System.out.print("Listenizdeki sayıların küçükten büyüğe sıralanışı :  "  + (Arrays.toString(list)));
    }
}
