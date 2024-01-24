import java.util.Date;
public class Main {
        public static void main (String[]args) {
                int monsterHealth = 100;
                String monsterType = " Big Head ";
                int playerHealth = 100;
                String playerName = " Ali ";
                String str new String("text");
                Date date=new Date();
                Monster monster=new Monster;
                monster.health=100;
                while(monsterHealth>0 && playerHealth>0){
                        System.out.println("Player"+playerName+"attack");
                        monsterHealth=monsterHealth-getAttackPoint();
if(monsterHealth<=0){break;}
                System.out.println("Monster"+monsterType+"attack");
                playerHealth=playerHealth-getAttackPoint();

System.out.println("PLAYER HEALTH:"+playerHealth);
System.out.println("MONSTER HEALTH:"+ monsterHealth);

                }
        System.out.println((playerHealth>0?"PLAYER":"MONSTER")+" kazandı..");}
public static int getAttackPoint(){
        return 1+(int)(Math.random()*10);}}