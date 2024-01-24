import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sonuc=1;

        System.out.println("üssü alınacak sayı");

        int sayi1  = input.nextInt();

        System.out.println("üs olacak sayı");

        int sayi2 = input.nextInt();
       int  k=1;

        while (k<=sayi2){
            sonuc*=sayi1;
            k++;

        }


        System.out.println(sonuc);
    }
}