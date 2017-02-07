package fakeburst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Max on 07-Feb-17.
 */
public class Program {

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        Mage max = (Mage) context.getBean("generic");
        for(Spell s : max.getSpells()) {
            s.cast();
        };
        max.castSpell((Spell) context.getBean("hex"));
    }
}