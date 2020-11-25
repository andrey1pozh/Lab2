package lab2.Att;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
    public ShadowBall(){
        super(Type.GHOST,80,100);
    }
    protected void applyOppEffects(Pokemon att)    {
        Effect effect = new Effect().chance(0.2);
        effect.stat(Stat.SPECIAL_DEFENSE, -1);
        att.addEffect(effect);
    }
    protected String describe() {
        return "ShadowBall";
    }
}
