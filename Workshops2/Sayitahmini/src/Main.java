import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi = (int) (Math.random() * 101);
//100 ile carpsak 99 a kadar sayı alıyor

        System.out.println("0 ile 100 arasında bir sayı");
        int cevap=-1;
Scanner input=new Scanner(System.in);
        while (sayi != cevap) {
            System.out.println(" tahmin et");
            cevap = input.nextInt();
            if (cevap > sayi)
                System.out.println("sayı çok yuksek");
             else if (cevap < sayi)
                System.out.println("sayı cok küçük");

             else
                System.out.println("doğru tahmin  " + sayi);

        }
    }
}



