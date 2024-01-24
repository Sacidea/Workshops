public class Main {
    public static void main(String[] args) {
        System.out.println("         ÇARPIM TABLOSU İNDİSLERİ");
        System.out.print("  ");

        for (int i = 1; i <= 9; i++)

            System.out.print("    " + i);
            System.out.println("\n\t-------------------------------------------");

        for (int j = 1; j <= 9; j++) {
            System.out.print(j + "|");
            for (int i = 1; i <= 9; i++) {
                System.out.printf("   %d%d", j, i); //(%4s%1s) aynı sunocu veriyor
            }
            System.out.println();
        }
    }
}