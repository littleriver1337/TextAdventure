import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by MattBrown on 10/9/15.
 */
public class Player {
    String name;
    String weapon;
    String area;
    ArrayList items = new ArrayList();

    void chooseName() {
        System.out.println("What is your name, traveler?");
        name = Game.nextLine();
        System.out.println("Good luck, " + name);
    }

    void chooseWeapon() throws Exception {
        System.out.println("[1] Pick up a sword");
        System.out.println("[2] Pick up a mallet");
        weapon = Game.nextLine();
        int weaponNum = Integer.valueOf(weapon);
        if (weaponNum == 1){
            System.out.println("That's fine sword!");
        } else if (weaponNum == 2){
            System.out.println("That's a heavy mallet");
        } else {
            throw new Exception("Invalid Weapon.");
        }
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
            System.out.println("You found a " + item);
            items.add(item);
        }
    }
}
