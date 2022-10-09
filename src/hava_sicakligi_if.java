
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık değerini giriniz: ");
        heat = input.nextInt();

        if(heat<5){
            System.out.print("Kayak yapabilirsiniz.");
        }
        if((heat>5)&&(heat<15)){
            System.out.println("Sinemaya gidebilirsiniz");
        }
        if((heat>10)&&(heat<25)){
            System.out.println("Piknik yapabilirsiniz");}
        if (heat>25){
            System.out.println("Yüzebilirsiniz.");
        }
    }
}