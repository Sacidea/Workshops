import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("para tutarını giriniz.");
        int f = input.nextInt();
        switch (f) {
            case 1 :
                System.out.println("1 e çekmek mi istiyorsunuz");
                break;
            default:
                System.out.println("önceki menü😄");

        }
    }
}