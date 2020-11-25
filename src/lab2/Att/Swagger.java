package lab2.Att;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL,0,85);
    }
    protected void applyOppEffects(Pokemon att)    {
        att.setMod(Stat.ATTACK, +2);
        Effect.confuse(att);
    }
    protected String describe() {
        return "Swagger";
    }
}
