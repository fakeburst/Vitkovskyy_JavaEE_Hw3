package fakeburst;

import java.util.List;

/**
 * Created by Max on 07-Feb-17.
 */
public class Mage {

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

    public void setSpells(List<Spell> spells) {
        this.spells = spells;
    }

    public List<Spell> getSpells() {
        return spells;
    }

}
