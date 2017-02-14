package fakeburst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Max on 07-Feb-17.
 */

@Component("Mage")
public class Mage {
    @Autowired
    @Qualifier("Priest")
    private MageType type;
    
    private List<Spell> spells;

    public Mage(){};

    public Mage(MageType type){
        this.type = type;
        System.out.println(type.inroduce());
    }

    public void castSpell(Spell spell){
        if(spells.contains(spell)) {
            spell.cast();
        } else {
            System.out.println("I don't know " + spell.toString() + " spell");
        }
    }

    public void setType(MageType type) {
        this.type = type;
    }

    @Autowired
    public void setSpells(List<Spell> spells) {
        this.spells = spells;
    }

    public List<Spell> getSpells() {
        return spells;
    }

}
