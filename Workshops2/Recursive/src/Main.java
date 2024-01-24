
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 10x10'luk bir matris oluştur
        int[][] candyTable = new int[10][10];

        // Matrisi başlangıç değerleriyle doldur
        initializeTable(candyTable);

        // Matrisi ekrana yazdır
        printTable(candyTable);

        // Kullanıcıdan koordinat girişi al ve işlem yap
        getUserInputAndReplace(candyTable);

        // Son durumu ekrana yazdır
        printTable(candyTable);
    }

    // Matrisi başlangıç değerleriyle dolduran fonksiyon
    private static void initializeTable(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                // Rastgele bir sayı yerine başlangıç için sırasıyla 1, 2, 3, ...
                table[i][j] = i * table.length + j + 1;
            }
        }
    }

    // Matrisi ekrana yazdıran fonksiyon
    private static void printTable(int[][] table) {
        for (int[] row : table) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Kullanıcıdan koordinat girişi alıp işlem yapan fonksiyon
    private static void getUserInputAndReplace(int[][] table) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Koordinatları girin (örneğin, 2 5): ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        // Kullanıcının girdiği koordinatlardaki değeri 'x' işaretine çevir
        replaceWithX(table, row, col);
    }

    // Belirtilen koordinatlardaki değeri 'x' işaretine çeviren fonksiyon
    private static void replaceWithX(int[][] table, int row, int col) {
        if (isValidCoordinate(table, row, col)) {
            table[row - 1][col - 1] = 'x';
        } else {
            System.out.println("Geçersiz koordinatlar. Lütfen tekrar deneyin.");
            getUserInputAndReplace(table); // Geçersiz koordinatlar için tekrar kullanıcı girişi iste
        }
    }

    // Koordinatların geçerli olup olmadığını kontrol eden fonksiyon
    private static boolean isValidCoordinate(int[][] table, int row, int col) {
        return row >= 1 && row <= table.length && col >= 1 && col <= table[0].length;
    }
}
