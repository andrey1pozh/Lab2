package lab2.Poc;

import ru.ifmo.se.pokemon.*;
import lab2.Att.*;

public class Feebas extends Pokemon {
    public Feebas(String name, int level) {
        super(name, level);
        setStats(20, 15, 20, 10, 55, 80);
        setType(Type.WATER);
        setMove(new RockTomb(), new Lick(), new ShadowBall(), new DoubleTeam());
        //setMove(new Swagger(), new Facade(), new DoubleTeam());
    }
}
