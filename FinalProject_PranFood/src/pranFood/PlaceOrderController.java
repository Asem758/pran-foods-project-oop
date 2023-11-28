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

/**
 * FXML Controller class
 *
 * @author intes
 */
public class PlaceOrderController implements Initializable {

    @FXML
    private DatePicker OrderDatePicker;
    @FXML
    private TextField orderIDTextField;
    @FXML
    private ComboBox<?> productbrandcombobox;
    @FXML
    private ComboBox<?> productIDCombobox;
    @FXML
    private TextField quantityTextField;
    @FXML
    private TextField unitcostTextField;
    @FXML
    private TextField subtotalTextField;
    @FXML
    private RadioButton paidRadioButton;
    @FXML
    private RadioButton dueRadioButton;
    @FXML
    private DatePicker shipmentdatepicker;
    @FXML
    private Button submitButton;
    @FXML
    private ComboBox<?> selectproducttype;
    @FXML
    private Button addproductButton;
    @FXML
    private Button previewOrderButton;
    @FXML
    private TextArea previewTextArea;

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
    private void selectProductBrand(ActionEvent event) {
    }

    @FXML
    private void selectproductID(ActionEvent event) {
    }

    @FXML
    private void selectPaid(ActionEvent event) {
    }

    @FXML
    private void selectDue(ActionEvent event) {
    }

    @FXML
    private void submitButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void selectProductType(ActionEvent event) {
    }

    @FXML
    private void addproductButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void previewOrderButtonOnClick(ActionEvent event) {
    }
    
}
