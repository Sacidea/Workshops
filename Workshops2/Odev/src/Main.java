import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)throws FileNotFoundException
    {


            File f = new File("oyunHaritasi.txt");

        if(f.exists()){
            System.out.println("Bulundu");}
            else{
                System.out.println("Bulunamadı");

            Scanner s= new Scanner (f);
            while(s.hasNextLine()){

                System.out.println(s.nextLine());

            }
            s.close();

           /* int satirIndex = 0;
            while (Scanner.nexLine() && satirIndex < 10) {
                String satir = Scanner.nextLine();
                for (int sutunIndex = 0; sutunIndex < 10; sutunIndex++) {
                    harita[satirIndex][sutunIndex] = satir.charAt(sutunIndex);

                }
                satirIndex++;
            }
            scanner.close();
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.println(harita[i][j] + " ");

                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println("dosya bulunamadı");*/

        }
    }
}



