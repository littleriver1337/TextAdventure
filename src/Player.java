import java.util.Scanner;

/**
 * Created by MattBrown on 10/9/15.
 */
public class Player {
    String name;
    String weapon;
    String area;

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
}
