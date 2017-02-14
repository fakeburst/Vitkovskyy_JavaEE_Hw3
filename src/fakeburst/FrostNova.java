package fakeburst;

import org.springframework.stereotype.Component;

/**
 * Created by Max on 07-Feb-17.
 */
@Component("FrostNova")
public class FrostNova implements Spell {

    public FrostNova(){
        //System.out.println("FrostNova constructed");
    };

    @Override
    public void cast() {
        System.out.println("Casting FrostNova");
    }

    public String toString() {
        return "FrostNova";
    }
}
