import java.util.Scanner;
public class Main {
    static int fibonacci(int n) {
        if (n==1||n==0)
        { return 1;}
        return fibonacci(n-1)+fibonacci(n-2);
        }
        public static void main (String[]args){
            System.out.println(fibonacci(6));
    }
        }













