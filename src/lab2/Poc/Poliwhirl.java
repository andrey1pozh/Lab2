package lab2.Poc;

import ru.ifmo.se.pokemon.*;
import lab2.Att.*;

public class Poliwhirl extends Poliwag {
    public Poliwhirl(String name, int level) {
        super(name, level);
        setStats(65, 65, 65, 50, 50, 90);
        setType(Type.WATER);
        setMove(new RockTomb(), new Lick(), new ShadowBall(), new DoubleTeam());
    }
}
