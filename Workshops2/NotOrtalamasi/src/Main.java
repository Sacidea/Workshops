import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
    Scanner not = new Scanner(System.in);
    int quiz, vize, ffinal;
    double ortalama;

    System.out.println("Quiz notunuzu giriniz:");
    quiz = not.nextInt();
    System.out.println("Vize notunu giriniz:");
    vize = not.nextInt();
    System.out.println("Final notunugiriniz :");
    ffinal= not.nextInt();

    ortalama = (quiz * 0.2) + (vize * 0.3) +(ffinal * 0.5);
    System.out.println("Not ortalamanız:" + ortalama);

    String  sonuc = (ortalama>=50) ? "Geçtiniz" : "Kaldınız";

    System.out.println(sonuc);

    }
}