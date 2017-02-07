package fakeburst;

/**
 * Created by Max on 07-Feb-17.
 */
public class Hex implements Spell {

    public Hex(){
        //System.out.println("Hex constructed");
    };

    @Override
    public void cast() {
        System.out.println("Casting Hex");
    }

    public String toString() {
        return "Hex";
    }
}
