import javax.lang.model.element.Name;

/**
 * Created by MattBrown on 10/13/15.
 */
public class Enemy extends Character{
    public Enemy(String name, int health, int damage, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.weapon = weapon;

    }
}