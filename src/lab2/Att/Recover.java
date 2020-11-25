package lab2.Att;

import lab2.Poc.*;
import ru.ifmo.se.pokemon.*;

public class Recover extends StatusMove {
    public Recover(){
        super(Type.NORMAL, 0,0);
    }
    protected void applySelfEffects(Pokemon att) {
        att.setMod(Stat.HP, (int) Math.round(hits/2));
    }
    protected String describe() {
        return "Recover";
    }
}
