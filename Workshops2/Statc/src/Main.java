public class Main {
    public static void main(String[] args) {
        greet("  sacide");
        greet(" ayşe");
        System.out.println(getMessage());
    }public static void greet(String name ) {
            System.out.println("merhaba" + name);
        }
        public static String getMessage() {
        return "Sayı tahmini oyununa hoşgeldiniz";
        }

    }
