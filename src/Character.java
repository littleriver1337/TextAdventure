/**
 * Created by MattBrown on 10/13/15.
 */
public class Character {
    String name;
    int health;
    int damage;
    Weapon weapon;

    void battle(Character opponent){
        System.out.println(String.format("%s commences battle with %s!", name, opponent.name));

        while (health > 0 && opponent.health > 0){
            health -= opponent.damage + opponent.weapon.damage;
            opponent.health -= damage + weapon.damage;
            System.out.println(String.format("%s health: %d, %s health: %d", name, health, opponent.name, opponent.health));
        }

        String deadMessage = "%s has been killed!";

        if (health <= 0){
            System.out.println(String.format(deadMessage, opponent.name));
        }

        if (opponent.health <= 0){
            System.out.println(String.format(deadMessage, opponent.name));
        }
    }
}
