package lab2.Att;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super(Type.NORMAL,0,0);
    }

    protected void applySelfEffects(Pokemon att)    {
        Effect effect = new Effect();
        effect.stat(Stat.EVASION, +1);
        att.addEffect(effect);
    }
    protected String describe() {
        return "DoubleTeam";
    }
}

