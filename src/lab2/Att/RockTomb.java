package lab2.Att;

import ru.ifmo.se.pokemon.*;

public class RockTomb extends PhysicalMove {
    public RockTomb(){
        super(Type.ROCK,0,0);
    }
    protected void applyOppEffects(Pokemon att)    {
        Effect effect = new Effect();
        effect.stat(Stat.SPEED, -6);
        att.addEffect(effect);
    }
    protected String describe() {
        return "RockTomb";
    }
}
