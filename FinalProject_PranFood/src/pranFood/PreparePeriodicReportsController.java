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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author intes
 */
public class PreparePeriodicReportsController implements Initializable {

    @FXML
    private Button submitButton;
    @FXML
    private TextField salesvolumeTextField;
    @FXML
    private ComboBox<?> monthCombobox;
    @FXML
    private ComboBox<?> yearCombobox;
    @FXML
    private TextField expenseamountTextField;
    @FXML
    private TextField revenueTextField;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void submitButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void selectmonth(ActionEvent event) {
    }

    @FXML
    private void selectyear(ActionEvent event) {
    }













    
}
