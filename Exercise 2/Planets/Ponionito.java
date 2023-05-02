package Planets;

import Explorers.Explorer;

public class Ponionito implements Planet {
    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    
}
}
