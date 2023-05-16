import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;


public class loginController {
    @FXML
    TextField myusername;

    @FXML
    PasswordField mypassword;

    @FXML
    Button loginBtn; 

    public void loginBtn(ActionEvent event) throws IOException{

        String username = myusername.getText(); 
        String password = mypassword.getText(); 

        if (username.equals("redge") && password.equals("redred")){

            Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }

        System.out.println(username);
        System.out.println(password);


    }


}
