package lab2.Poc;

import ru.ifmo.se.pokemon.*;
import lab2.Att.*;

public class Kecleon extends Pokemon {
    public Kecleon(String name, int level) {
        super(name, level);
        setStats(60, 90, 70, 60, 120, 40);
        setType(Type.NORMAL);
        setMove(new RockTomb(), new Lick(), new ShadowBall(), new DoubleTeam());
    }
}
