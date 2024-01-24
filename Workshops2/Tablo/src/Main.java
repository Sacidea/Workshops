public class Main {
    public static void main (String[]args ){
        System.out.println("            ÇARPIM TABLOSU");
        System.out.print("  ");
        for(int j=1; j<10; j++){
            System.out.print("   " +j);}

    System.out.println("\n--------------------------------------");

            for(int i=1; i<10; i++){
                System.out.print(i+"|");
                for(int j=1; j<10; j++ ){
                    //bu for döngüüsnde j tanımlı olmadıgı için bir kez daha int oldugunu belirtiyoruz veya baska bir isim de(k)
                    // verebiliriz budurumda carpım kısmına i*k yazarız
                System.out.printf("%4d",i*j);}
                System.out.println();

            }}}

