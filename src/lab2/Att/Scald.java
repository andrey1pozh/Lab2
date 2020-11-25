package lab2.Att;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Scald extends SpecialMove {
    public Scald(){
        super(Type.WATER,80,100);
    }
    protected void applyOppEffects(Pokemon att) {
        Effect effect = new Effect().chance(0.1);
        effect.burn(att);
    }
    protected String describe() {
        return "Scald";
    }
}
