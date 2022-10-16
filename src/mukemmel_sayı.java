import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number, perf=1,cont=0;

        System.out.print("Kontrol etmek istediğiniz sayıyı giriniz: ");
        number=input.nextInt();

        for (int i=1;i<number;i++){
            if(number%i==0){
                cont+=i;
            }
        }
        System.out.println(cont);
        if(cont==number){
        System.out.print(number + " mükemmel sayıdır.");}
        else  System.out.print(number + " mükemmel sayı değildir.");
    }
}



