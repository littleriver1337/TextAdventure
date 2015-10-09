import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by MattBrown on 10/8/15.
 */
public class Game {
    public static void run() throws Exception {
        System.out.println("Welcome to my text adventure");
        System.out.println("What is your name, traveler?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Good luck, " + name);

        System.out.println("[1] Pick up a sword");
        System.out.println("[2] Pick up mallet");
        String weapon = scanner.nextLine();
        int weaponNum = Integer.valueOf(weapon);
        if (weaponNum == 1){
            System.out.println("That's fine sword!");
        } else if (weaponNum == 2){
            System.out.println("That's a heavy mallet");
        } else {
            throw new Exception("Invalid Weapon.");
        }

        System.out.println("[1] Enter the forest");
        System.out.println("[2] Enter the undeground tunnel");
        String area = scanner.nextLine();
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
