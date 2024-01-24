import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sayi = new Scanner(System.in);
        int toplam = 0;
        int input;
        while (true) {
            System.out.println("lutfen bir sayı giriniz");
            input = sayi.nextInt();
            if (input <= 0) {
                System.out.println("program bitt giriş negatif");
                System.out.println("girilen tek sayıların toplamı:" + toplam);
                break;
            }

            if (input % 2 == 1) {
                toplam += input;

            }


        }
    }
}