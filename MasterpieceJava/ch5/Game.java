package MasterpieceJava.ch5;

import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

class player{
String[] weapon;
int currentHP;
int heal;
int attack;
boolean life = true;}

class weapon{
weapon gun = new weapon();
weapon punch = new weapon();
weapon knife = new weapon();



}
class Unit extends player{
    Unit unit1 = new Unit(){int currentHP= 100; int heal = 100; int attack = 10;}

    if(currentHP<=0){unit1.life = false;
        System.out.println("게임오버 다시 하시겠습니까?");}
}



public class Game extends Unit{
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("캐릭터 생성 unit1[0] unit[1] 선택해주세요 >");
        String id = scan.nextLine();
        System.out.println(id + "님 환영합니다. 게임을 시작합니다.");
        scan.close();
    }}
