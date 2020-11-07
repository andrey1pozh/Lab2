package lab2.Poc;

import ru.ifmo.se.pokemon.*;
import lab2.Att.*;

public class Milotic extends Feebas {
    public Milotic(String name, int level) {
        super(name, level);
        setStats(95, 60, 79, 100, 125, 81);
        setType(Type.WATER);
        setMove(new RockTomb(), new Lick(), new ShadowBall(), new DoubleTeam());
    }
}