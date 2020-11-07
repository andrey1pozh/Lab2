package lab2;

import ru.ifmo.se.pokemon.*;
import lab2.Poc.*;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Kecleon("Kecleon", 30));
        b.addAlly(new Feebas("Feebas", 30));
        b.addAlly(new Milotic("Milotic", 30));
        b.addFoe(new Poliwag("Poliwag", 1));
        b.addFoe(new Poliwhirl("Poliwhirl", 1));
        b.addFoe(new Politoed("Politoed", 1));
        b.go();
    }
}
