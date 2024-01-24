import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Main {


    public static  void main (String[] args) throws IOException {


        //dosyayı txt dosyasından okuyacak kod:
        File dosya = new File("dosya.txt");
        //Dosya bulunup bulunamadığını  ekrana yazdıracak kod:
        if (dosya.exists()) {
            //exists() dosyanın var olup olmadığını sorgular
            System.out.println("    OYUN HARİTASI ");
        } else {
            System.out.println("Bulunamadı");
        }


        Scanner indosya = new Scanner(dosya);
        //txt dosyasından tüm satırları sonuna kadar yazdıran kod (ayrıca hasNext() sonraki satırda veri olup olmadığını kontrol eder):
        while (indosya.hasNext()) {
            System.out.println(indosya.nextLine());
        }

        char[][] oyunHaritasi = {
                {'1', '1', '4', '5', '2', '6', '5', '5', '6', '7'},
                {'1', '2', '2', '2', '2', '6', '9', '6', '2', '8'},
                {'8', '5', '2', '1', '8', '8', '8', '7', '3', '4'},
                {'4', '2', '1', '6', '7', '7', '7', '3', '5', '1'},
                {'4', '2', '4', '6', '7', '1', '1', '5', '6', '2'},
                {'4', '2', '1', '6', '9', '4', '6', '1', '9', '9'},
                {'4', '2', '7', '4', '9', '9', '9', '9', '1', '2'},
                {'1', '2', '2', '2', '2', '6', '9', '6', '2', '8'},
                {'8', '5', '2', '1', '8', '8', '8', '7', '3', '4'},
                {'4', '2', '1', '6', '9', '4', '6', '1', '9', '9'}
        };
            boolean loop;
        while(loop=true){

            Scanner input = new Scanner(System.in);
             //Kullanıcıdan sayı alınması:
            System.out.println("Lütfen biri satır diğeri sütun olmak üzere 2 sayı giriniz. Koordinatları (0,0) girerseniz oyun sonlanır");

                int sayi1 = input.nextInt();
                int sayi2 = input.nextInt();
            //oyunu sonlandırmayı sağlayacak if bloğu:
            if(sayi1==0 && sayi2==0){

                System.out.println("OYUN BiTTİ");
                loop=false;
                    break;
            }
            //Oyun haritasının koordinatları dışında girilecek hatalı girişler içi uyarı kodu:
            else if(sayi1<=0 || sayi1 >oyunHaritasi.length+1 ||sayi2<=0||sayi2>oyunHaritasi.length+1){
                System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz.");
                continue;
            }
            //Uygun sayılar alındıktan sonra (row)satır ve col(sütun) değerlerine eşitleyecek kod:
                else{
                    int row=sayi1;
                    int col=sayi2;
            System.out.println("Koordinatlar: "+"("+row+","+col+")");
                //"oyun " metodu işlemlerinde dizinin indexlerinin 0' dan başlamasından dolayı koordinatların index karşılığı girilen koordinatların 1 eksiği olacak:
                //"oyun" metodunu çağırarak temp oluşturma ve "oyunSonucu"metodu ile harita güncellemesi yapılmış olur
                oyun(row - 1, col - 1, oyunHaritasi);

                //"oyun" metodu ile değişen güncel oyun haritasını tekrar ekrana yazdıracak kod:
                for (int i = 0; i < oyunHaritasi.length; i++) {
                    for (int j = 0; j < oyunHaritasi[0].length; j++) {
                        System.out.print(oyunHaritasi[i][j] + " ");
                    }
                    System.out.println();
                }

            }
        }
    }

        //Seçilen koordinatı temp değerine aktaran ve ayunSonucu fonksiyonu ile
        public static void oyun(int row, int col, char[][] oyunHaritasi){
        //seçilen koordinattaki değeri, etrofında aynı sayı yoksa; haritanın devamını kontrol etmesini durduracak bir temp değişkenine aktarıyoruz.
        char temp=oyunHaritasi[row][col];
        //recursive metodu oyun metodu içinde çağırıyoruz.
        yeniOyunHaritasi(row, col, oyunHaritasi, temp);
        }


        //oyun sonunda koordinatları değiştirecek recursive metod bloğu :
        public static void yeniOyunHaritasi(int row ,int col, char[][] oyunHaritasi, char temp) {
             //Koordinatların kontrolünün uygun aralıkta yapılmasını sağlayan if bloğu:
             if (row < 0 || row >= oyunHaritasi[0].length || col < 0 || col >= oyunHaritasi.length|| oyunHaritasi[row][col] != temp) {
             // if bloğu içindeki şartlara göre metodu durdurmak için "return" anahtar kelimesini kullanıyoruz
                 return;
             }
             oyunHaritasi[row][col] = 'x';
             //koordinatın sağ tarafını kontrol eden birinci recursive metod:
             yeniOyunHaritasi(row + 1, col, oyunHaritasi, temp);
             //koordinatın sol tarafını kontrol eden ikinci recursive  metodu:
             yeniOyunHaritasi(row - 1, col, oyunHaritasi, temp);
             //koordinatın aşağısını kontrol eden üçüncü recursive  metod:
             yeniOyunHaritasi(row, col - 1, oyunHaritasi, temp);
             //koordinatın yukarısını kontrol eden dördüncü recursive metod:
             yeniOyunHaritasi(row, col + 1, oyunHaritasi, temp);

    }

}











