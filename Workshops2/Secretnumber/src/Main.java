public class Main {
    public static void main(String[] args) {
        String welcomeMessage = "Sayı tahmini oyununa hoşgeldin!";
        greet(welcomeMessage, "sacide");
        String upperCaseWelcomeMessage =welcomeMessage.toUpperCase();
        System.out.println(upperCaseWelcomeMessage);
        boolean endsWithDot = welcomeMessage.endsWith("!");
        System.out.println(endsWithDot);}

public static void greet(String message, String name){

        System.out.println(message+" "+ name);
    }
}