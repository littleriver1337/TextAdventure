import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by MattBrown on 10/8/15.
 */
public class Game {
    public static void run() throws Exception {
        System.out.println("Welcome to my text adventure");

      Player player = new Player();
        player.chooseName();
        player.chooseWeapon();
        player.chooseArea();
    }
}
