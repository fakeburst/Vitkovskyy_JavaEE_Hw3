package fakeburst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Max on 07-Feb-17.
 */
public class Program {

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        Mage max = (Mage) context.getBean("Mage");
        List<Spell> spells = new ArrayList<Spell>();
        spells.add((Spell)  context.getBean("Fireball"));
        spells.add((Spell)  context.getBean("FrostNova"));
        max.setSpells(spells);
        for(Spell s : max.getSpells()) {
            s.cast();
        };
        max.castSpell((Spell) context.getBean("Hex"));
    }
}