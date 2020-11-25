package lab2.Att;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class IceBeam extends SpecialMove {
    public IceBeam() {
        super(Type.ICE, 90,100);
    }
    protected void applyOppEffects(Pokemon att) {
        Effect effect = new Effect().chance(0.1);
        effect.freeze(att);
    }
    protected String describe() {
        return "IceBeam";
    }
}
