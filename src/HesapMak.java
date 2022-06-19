import java.util.Scanner;
public class HesapMak {
    public static void main(String[] args) {
        int n1,n2,secilen;
        Scanner girdi = new Scanner(System.in);

        System.out.println("ilk sayiyi giriniz :");
        n1 = girdi.nextInt();
        System.out.println("ikinci sayiyi giriniz : ");
        n2 = girdi.nextInt();

        System.out.println("Ne yapmak istersiniz? \n 1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme" );
        secilen = girdi.nextInt();

        switch (secilen){
            case 1:
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println(n1*n2);
                break;
            case 4:
                System.out.println(n1/n2);
        }
    }
}
