package Explorers;

import Planets.Mars;
import Planets.Planet;
import Planets.Ponio;
import Planets.Mercury;
import Planets.Saturn;
import Planets.Ponionito;

public interface Explorer {

    void visit(Mercury mercury);

    void visit(Mars mars);

    void visit(Saturn saturn);

    void visit(Ponio ponio);

    void visit (Ponionito ponionito);
    
    default void visit(Planet planet) {
        System.out.println("Landed on an unknown planet...");
    }
}
