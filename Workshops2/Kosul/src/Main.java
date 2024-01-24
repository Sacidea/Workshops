// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)  {
        // IntelliJ IDEA suggests fixing it.

        int a = 4;
        int b =9;
        int sayma1 = a+b;
        int sayma2 = a-b;
        int sayma3 = a*b;
        int sayma4 = b/a;
        System.out.println(sayma3);
        int toplam = ++a * --b;
System.out.println(toplam);
       int c =10;
       int d=2;
        boolean kosul = c%d==2;
       boolean  kosul2=c >d;
       boolean sonuc= kosul&&kosul2;
       boolean sonuc2=kosul||kosul2;

System.out.println(sonuc);
System.out.println(sonuc2);
String sonuc3 = (kosul )? "doğru" : "yanlış";
System.out.println(sonuc3);
sayma2 = sayma4;
System.out.println(sayma2);
sayma2 +=5;
System.out.println(sayma2);


    }
}