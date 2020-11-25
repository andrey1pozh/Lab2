package lab2.Poc;

import ru.ifmo.se.pokemon.*;
import lab2.Att.*;

public class Politoed extends Poliwhirl {
    public Politoed(String name, int level) {
        super(name, level);
        setStats(90, 75, 75, 90, 100, 70);
        setType(Type.WATER);
        setMove(new Facade(), new IceBeam(), new WaterGun(), new Scald());
    }
}
