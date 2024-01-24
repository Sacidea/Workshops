import java.util.Random;
import java.util.Scanner;
import java.util.IllegalFormatConversionException;
public class Main {
    public static void main(String[] args) {

Random ra=new Random();
int say=ra.nextInt(3);
System.out.println("taş(0), kağıt(1),makas(2) hangisi?");
Scanner input= new Scanner(System.in);
int kullanici=input.nextInt();
if(say==0&&kullanici==2)
    System.out.println("kaybettin "+say);
    else if(kullanici==0&&say==2)
        System.out.println("kazandın "+say);
    else if(say==kullanici)
        System.out.println("berabere "+say);
    else
System.out.println(say<kullanici?"kazandın "+say:"kaybettin "+say);


System.out.print("\nyazyazılım mühendisliği");

char ch=(char)65.20;
int k=(int)'A';
System.out.println(ch+" "+k);
int i=1, j=2;
System.out.println(i+j+ "sayı gir");

String abc=input.next();
System.out.println(abc);
int adet=5;
double miktar=45.56888;
//System.out.printf("Adet  %dve mikrar %10.2e",adet,miktar);
String s="merhaba dünya";
System.out.println("merhaba dünya".indexOf('y','b'));
int dizi[]={1,2,3};
for(int t:dizi){
    System.out.println(t);}

int dizi2 [][]=new int[][]{
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
};





}}
