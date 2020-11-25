package lab2.Poc;

import ru.ifmo.se.pokemon.*;
import lab2.Att.*;

public class Poliwag extends Pokemon{
    public Poliwag(String name, int level) {
        super(name, level);
        setStats(40, 50, 40, 40, 40, 90);
        setType(Type.WATER);
        setMove(new Facade(), new IceBeam());
    }
}
