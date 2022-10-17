import java.util.Scanner;
public class Main {
    static boolean isPolidrom(int number) {
        int reverse = 0, temp = number;
        while (temp != 0) {
            reverse = (reverse * 10) + temp % 10;
            temp /= 10;
           }
        if(reverse==number)
            return true;
        else
            return false;
        }
        public static void main (String[]args){
            System.out.println(isPolidrom(4));
        }
    }












