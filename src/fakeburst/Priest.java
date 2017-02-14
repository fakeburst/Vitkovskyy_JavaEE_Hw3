package fakeburst;

import org.springframework.stereotype.Component;

/**
 * Created by Max on 07-Feb-17.
 */
@Component("Priest")
public class Priest implements MageType {
    @Override
    public String inroduce() {
        return "I am Priest";
    }
}
