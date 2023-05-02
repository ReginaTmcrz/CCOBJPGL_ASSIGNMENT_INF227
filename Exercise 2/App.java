import Explorers.*;
import Planets.*;

public class App {

    public static void main(String[] args) {

        Planet mars = new Mars();
        Planet saturn = new Saturn();
        Planet mercury = new Mercury();
        Planet ponio =  new Ponio();
        Planet ponionito = new Ponionito();

        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();

        mars.accept(astronaut);
        saturn.accept(astronaut);
        mercury.accept(astronaut);
        ponio.accept(astronaut);
        ponionito.accept(astronaut);

        mars.accept(rover);
        saturn.accept(rover);
        mercury.accept(rover);
        ponio.accept(rover);
        ponionito.accept(rover);
    }
}
