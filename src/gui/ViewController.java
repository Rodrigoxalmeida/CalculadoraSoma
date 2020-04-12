package gui;

import java.util.Locale;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {
	
	//colocar fxml nas variaveis para colocar na janela pelo scene builder
	@FXML
	private TextField txtNumber1;
	@FXML
	private TextField txtNumber2;	
	
	@FXML
	private Label labelResult;
	
	@FXML
	private TextField txtResult;
	
	@FXML
	private Button btSum;
	@FXML
	private Button btSair;
	
	@FXML
	public void onBtSumAction() {
		//Alerts.showAlert("Alert title", null, "Hello", AlertType.ERROR);
		try {
		Locale.setDefault(Locale.US);
		double number1 = Double.parseDouble(txtNumber1.getText());
		double number2 = Double.parseDouble(txtNumber2.getText());
		double sum = number1 + number2;
		labelResult.setText(String.format("%.2f", sum));
		txtResult.setText(String.format("%.2f", sum));
		}catch(NumberFormatException e) {
			Alerts.showAlert("ERROR", null, "Valor inválido", AlertType.ERROR);
		}
	}
	@FXML
	private void onBtSairActionn() {
		System.exit(0);
	}
	
	
}
