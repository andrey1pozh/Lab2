package lab2.Att;

import ru.ifmo.se.pokemon.*;

public class Lick extends PhysicalMove {
    public Lick(){
        super(Type.GHOST,30,100);
    }
    protected void applyOppEffects(Pokemon att) {
        Effect effect = new Effect().chance(0.3);
        effect.paralyze(att);
    }
    protected String describe() {
        return "Lick";
    }
}
