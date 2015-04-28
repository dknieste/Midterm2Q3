package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class customerController implements Initializable {

    @FXML
    private TextField firstName;

    @FXML
    private TextField middleInit;

    @FXML
    private TextField lastName;

    @FXML
    private TextField zipCode;

    @FXML
    private TextField address;

    @FXML
    private ToggleGroup gender;

    @FXML
    private TextField city;

    @FXML
    private Button save;
    
    @FXML
    private Button clear;

    @FXML
    private ComboBox<String> state;
    
    ObservableList<String> options = FXCollections.observableArrayList("AK", "AL", "AR", "AZ", "CA", "CO", "CT", "DC", "DE", "FL", "GA", "HI", "IA", "ID", "IL", "IN", "KS", "KY", "LA", "MA", "MD", "ME", "MI", "MN", "MO", "MS", "MT", "NC", "ND", "NE", "NH", "NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VA", "VT", "WA", "WI", "WV", "WY");

    @FXML
    private void clearAction(ActionEvent clear){
    	firstName.clear();
    	middleInit.clear();
    	lastName.clear();
    	address.clear();
    	city.clear();
    	zipCode.clear();
    	state.valueProperty().set(null);
    }
    
    @FXML
    private void saveAction(ActionEvent save){
    	String first = firstName.getText();
    	String middle = middleInit.getText();
    	String last = lastName.getText();
    	String gen = gender.toString();
    	String add = address.getText();
    	String cit = city.getText();
    	String zip = zipCode.getText();
    	String st = state.getValue();
    	
    	Customer customerNew = new Customer(first, middle, last, gen, add, cit, st, zip);
    	
    	
    }
    
    // @param url
    // @param rb
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		state.setItems(options);
		
	}

	public TextField getFirstName() {
		return firstName;
	}

	public void setFirstName(TextField firstName) {
		this.firstName = firstName;
	}}
