import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int i, number, space=0, star=1;
        System.out.print("Üçgenin kaç satır olmasını istersiniz: ");
        number=input.nextInt();

        for (i=number-1;i>0;i--){
            for (space=1; space<=(number-i); space++){
                System.out.print(" ");
            }
            for (star=1;star<=(2*i)-1;star++){
              System.out.print("*");
            }
            System.out.println();}
            }
        }








