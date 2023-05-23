package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import model.*;

public class CoffeeShopController {

    @FXML
    ImageView jco, frnk, cbtl, timHortons, coffeeproj; 

    @FXML
    Button jcoBtn, cbtlBtn, frnkBtn, cpBtn, thBtn;

    Jco jcoo = new Jco();
    Frnk frnkk = new Frnk();
    TimHortons th = new TimHortons();
    Cbtl cbtll = new Cbtl(); 
    CoffeeProj cp = new CoffeeProj(); 


    public void initialize() {

        jcoo.setRating("3 stars");
        jcoo.setTaste("Very Sweet");

        frnkk.setRating("4 stars");
        frnkk.setTaste("Creamy");

        th.setRating("5 stars");
        th.setTaste("Tasty");

        cbtll.setRating("1 star");
        cbtll.setTaste("not sweet");

        cp.setRating("5 stars");
        cp.setTaste("Flavorful");
      
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(jcoBtn)) {
            alert.setContentText("Jco Coffee are " + jcoo.getRating() + " and " + jcoo.getTaste());
        }

        if (sourceButton == cbtlBtn) {
            alert.setContentText("CBTL Coffee are " + cbtll.getRating() + " and " + cbtll.getTaste());
        }

        if (sourceButton == frnkBtn) {
            alert.setContentText("FRNK Coffee are " + frnkk.getRating() + " and " + frnkk.getTaste());
        }

        if (sourceButton == cpBtn) {
            alert.setContentText("Coffee Project Coffee are " + cp.getRating() + " and " + cp.getTaste());
        }

        if (sourceButton == thBtn) {
            alert.setContentText("Coffee Project Coffee are " + th.getRating() + " and " + th.getTaste());
        }

        alert.showAndWait();

    }

}
