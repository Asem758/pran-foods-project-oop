/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pranFood;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author intes
 */
public class LoginSceneController implements Initializable {

    @FXML
    private TextField useridTextField;
    @FXML
    private TextField passwordTextField;
    @FXML
    private Button loginTextField;
    @FXML
    private Button registerTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loginButtonOnClick(ActionEvent event) {
    }
    
}
