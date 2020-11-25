package lab2.Att;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class WaterGun extends SpecialMove {
    public WaterGun(){
        super(Type.WATER,40,100);
    }
    protected String describe() {
        return "WaterGun";
    }
}
