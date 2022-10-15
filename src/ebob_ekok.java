import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n1,n2, ebob=1, ekok=1, i, k, select, deger=1, kontrol=1;

        System.out.print("Ebob hesaplamak için: 1 \n" +
                "Ekok hesaplamak için: 2\n" +
                "Seçiminiz:  ");
        select=input.nextInt();

      switch (select){
          case 1:
              System.out.print("Ebobunu bulmak istediğiniz ilk sayıyı giriniz: ");
              n1=input.nextInt();
              System.out.print("Ebobunu bulmak istediğiniz ikinci sayıyı giriniz: ");
              n2=input.nextInt();
              for (i = 1; i<n1; i++){
                  if ((n1%i==0)&&(n2%i==0)){
                      ebob=i;
                  }
              }
             System.out.println(n1 + " ve " + n2 + " sayılarının Ebobu: " + ebob );
              break;

          case 2:
              System.out.print("Ekokunu bulmak istediğiniz ilk sayıyı giriniz: ");
              n1=input.nextInt();
              System.out.print("Ekokunu bulmak istediğiniz ikinci sayıyı giriniz: ");
              n2=input.nextInt();
              for (k = 1; k<=(n1*n2); k++){
                  if ((k%n1==0)&&(k%n2==0)){
                      ekok=k;
                      break;
                  }
              }
              System.out.println(n1 + " ve " + n2 + " sayılarının Ekoku: " + ekok );
              break;
          default:
              System.out.println("Hatalı giriş yaptınız.");
              break;
      }




    }
    }


