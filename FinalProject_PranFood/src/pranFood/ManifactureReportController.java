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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author intes
 */
public class ManifactureReportController implements Initializable {

    @FXML
    private DatePicker manifactureddatepicker;
    @FXML
    private ComboBox<?> productbrandcombobox;
    @FXML
    private ComboBox<?> producttypeCombobox;
    @FXML
    private ComboBox<?> productIDCombobox;
    @FXML
    private TextField quantityTextField;
    @FXML
    private Button submitButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void selectdate(ActionEvent event) {
    }

    @FXML
    private void selectproductbrand(ActionEvent event) {
    }

    @FXML
    private void selectproducttype(ActionEvent event) {
    }

    @FXML
    private void selectProductID(ActionEvent event) {
    }

    @FXML
    private void submitButtonOnClick(ActionEvent event) {
    }
    
}
