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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author intes
 */
public class ViewProfileController implements Initializable {

    @FXML
    private ImageView imageview;
    @FXML
    private TextField FullNameTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField phonenumberTextField;
    @FXML
    private TextField addressTextField;
    @FXML
    private TextArea qualificationTextArea;
    @FXML
    private Button closeButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void viewImageOnclick(MouseEvent event) {
    }

    @FXML
    private void closeButtonOnClick(ActionEvent event) {
    }
    
}
