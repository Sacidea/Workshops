import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sehir = in.next();
        String sehir2 = in.next();
        if (sehir.compareTo(sehir2) < 0) {
            System.out.println("şehirlerein alfabetik sırası " + sehir +sehir2);
        } else if (sehir.compareTo(sehir2) == 0) {
            System.out.println("şehirlerin alfabetik sırası "+ sehir +"="+sehir2);
        } else  {
            System.out.println("şehirlerin alfasbetik sırası "+sehir  + sehir2);
        }

    }
}