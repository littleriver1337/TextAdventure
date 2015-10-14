import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by MattBrown on 10/9/15.
 */
public class Player extends Character{//extends extends attributes thorugh Character class is called inhertance
    String name;
    String area;
    ArrayList items = new ArrayList();

    public Player(){
        health = 100;
        damage = 20;
    }

    void chooseName() {
        System.out.println("What is your name, traveler?");
        name = Game.nextLine();
        System.out.println("Good luck, " + name);
    }

    void chooseWeapon() throws Exception {
        System.out.println("[1] Pick up a sword");
        System.out.println("[2] Pick up a mallet");
        int weaponNum = Integer.valueOf(Game.nextLine());
        if (weaponNum == 1){
            weapon = new Weapon();
            weapon.name = "Sword";
            weapon.damage = 10;
        } else if (weaponNum == 2){
            weapon = new Weapon();
            weapon.name = "Mallet";
            weapon.damage = 10;
        } else {
            throw new Exception("Invalid Weapon.");
        }
        System.out.println(String.format("Thats a fine %s!", weapon.name.toLowerCase()));
    }

    void chooseArea() throws Exception {
        System.out.println("[1] Enter the forest");
        System.out.println("[2] Enter the undeground tunnel");
        area = Game.nextLine();
        int areaNum = Integer.valueOf(area);
        if (areaNum == 1){
            System.out.println("Entering the forest....");
        } else if (areaNum == 2){
            System.out.println("Enterting the tunnel...");
        } else {
            throw new Exception("Invalid area.");
        }
    }

    void findItem(String item){
        System.out.println("Found item Pick it up? [y/n]");
        String s = Game.nextLine();
        if (s.equals("y")){
            System.out.println(String.format("You found a %s", item));
            items.add(item);
        }
    }
}
