import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username = "isa", password = "sarı";
        int select=0, right = 3, bakiye=1500, ekle, cek;

            System.out.print("Kullanıcı adınız: ");
            username = input.nextLine();
            System.out.print("Parolanız: ");
            password = input.nextLine();
            if ((username.equals("isa") && (password.equals("sarı")))) {
                System.out.print("Merhaba, Patika bankasına hoşgeldiniz.");

                while (select!=4){
                System.out.print(
                        "\n1- Bakiye sorgula" +
                        "\n2- Para yatır" +
                        "\n3- Para çek" +
                        "\n4- Çıkış yap" +
                        "\nYapmak istediğiniz işlemi seçiniz: ");
                select= input.nextInt();
                  switch (select) {
                      case 1:
                          System.out.print("Hesap bakiyeniz: " + bakiye);
                          break;
                      case 2:
                          System.out.print("Para miktarını giriniz: ");
                          ekle = input.nextInt();
                          System.out.println("Hesabınıza " + ekle + " lira yatırılmıştır.");
                          bakiye += ekle;
                          break;
                      case 3:
                          System.out.print("Para miktarını giriniz: ");
                          cek = input.nextInt();
                          System.out.println("Hesabınızdan " + cek +  " lira cekilmiştir.");
                          bakiye -= cek;
                          break;
                      case 4:
                          System.out.println("Yine bekleriz.");
                      default:
                          break;
                  }
                    }
                }
            else {System.out.println("Kullanıcı adı veya şifre hatalı");
            System.out.println("Kalan hakkınız: " + --right);}
            if (right==0){
                System.out.print("Çok fazla hatalı giriş yaptınız, hesabınız bloke olmuştur.");
            }
        }
    }


