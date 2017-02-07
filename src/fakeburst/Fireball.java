package fakeburst;

/**
 * Created by Max on 07-Feb-17.
 */
public class Fireball implements Spell {

    public Fireball(){
        //System.out.println("Fireball constructed");
    };

    @Override
    public void cast() {
        System.out.println("Casting Fireball");
    }

    public String toString() {
        return "Fireball";
    }
}
