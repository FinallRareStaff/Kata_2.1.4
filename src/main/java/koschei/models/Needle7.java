package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {

    private Egg6 egg;

    @Autowired
    public void setEgg(Egg6 egg) {
        this.egg = egg;
    }

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + "";
    }
}
