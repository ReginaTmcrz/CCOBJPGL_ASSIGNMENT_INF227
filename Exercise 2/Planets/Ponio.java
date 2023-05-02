package Planets;

import Explorers.Explorer;

public class Ponio implements Planet{
    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }

    
}
