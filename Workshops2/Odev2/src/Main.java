import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class Main {
    static int[][] map;
    public static void main(String[] args) {
        dosyadanoku();
Scanner scan=new Scanner(System.in);
while(true){
    printmap();
    System.out.print("lutfen bir koordinat girin");
    int sutun=scan.nextInt();
    int satir=scan.nextInt();
    if(sutun==0&&satir==0){
        System.out.println("güle güle");
        break;
        if(gecerlikoordinat(sutun,satir)){
            haritayiguncelle(sutun,satir);}
        else {
            System.out.println("geçersiz koordinat tekrar deneyin");
        }
        }scan.close();

    }static void dosyadanoku() {
    try(BufferedReader reader =new BufferedReader(new FileReader("map.txt" ))){

        map=new int[][];
        String line;
        int satir=0;
        while((line=reader.readLine())!=null) {
            surecsatir(satir, line);
            satir++;
        }

        }catch(IOException e) {
        System.out.println("dosya okuma hatası:" + e.getMessage());
    }

    }
static void surecsatir(int satir, String line){
    for (int sutun=0; sutun<line.length(); sutun++){
        char karakter=line.charAt(sutun);
        try{
            map[satir]{sutun]=Character.getNumerikValue(karakter)}
            catch{NumbereFormatExceptiob e){
                System.out.println("geçersiz karakter bicimi dosyayı kontrol et");
                System.exit(1);
            }}}
        static void haritayiyazdir(){
            for(int[] sa :map) {
                for (int k : sa) {
                    System.out.print(k + " ");
                }
                System.out.println();
            }

                }static boolean gecerlikoordinat(int satir, int sutun){
            return satir > 0 && sutun <= 10 && sutun > 0 && sutun <= 10;
        }static void guncelleharita(int satir, int sutun){
           int simdikinum=map[satir-1][sutun-1];
           int[][] directions={{-1,0},{0,1},{1,0},{0,-1}};
           for(int[ ]dir:directions){
    int r=satir-1+dir[0];
    int c=sutun-1+dir[1];
    if(gecerlikoordinat(r+1,c+1)&&map[r][c]==simdikinum){
        map[r][c]='x';

    }


            }
        }
    }

}
        System.out.println("Hello world!");
    }
}