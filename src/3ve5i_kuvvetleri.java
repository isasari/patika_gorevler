import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int i, k, n=0;

        System.out.print("Sınır sayısını giriniz; ");
       n=input.nextInt();

       for (i=1; i<n; i=i*3)
       {
           System.out.println(i);
       }

       for (k=1; k<n; k*=5){
           System.out.println(k);
        }
}}



