package eventDrivenProgramming_and_Animations;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Write a program that calculates the future value of an investment at a given interest rate for a specified number of years. 
	 * The formula for the calculation is: futureValue = investmentAmount * (1 + monthlyInterestRate)years*12
	 * Use text fields for the investment amount, number of years, and annual interest rate. Display the future amount in a text 
	 * field when the user clicks the Calculate button, as shown in Figure 15.25b.
	 */

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise15_05 extends Application {
	TextField investmentAmount = new TextField();
	TextField numberOfYears = new TextField();
	TextField annualInterestRate = new TextField(); 
	TextField futureValue = new TextField();

	@Override
	public void start(Stage stage) throws Exception {
		
		//Create grid and set nodes in places
		GridPane pane = new GridPane();
		pane.setHgap(5);
		pane.setVgap(5);
		pane.setAlignment(Pos.CENTER);
		pane.addRow(0, new Label("Investment Amount:"), investmentAmount);
		investmentAmount.setAlignment(Pos.TOP_RIGHT);
		pane.addRow(1, new Label("Number of Years:"), numberOfYears);
		numberOfYears.setAlignment(Pos.TOP_RIGHT);
		pane.addRow(2, new Label("Annual Interest Rate:"), annualInterestRate);
		annualInterestRate.setAlignment(Pos.TOP_RIGHT);
		pane.addRow(3, new Label("Future value:"), futureValue);
		futureValue.setAlignment(Pos.TOP_RIGHT);
		
		//Import button at the end
		Button btn = new Button("Calculate");
		pane.add(btn, 1, 4);
		GridPane.setHalignment(btn, HPos.RIGHT);
		btn.setOnAction(e -> investmentValue());
		
		//Set scene and properties
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.setHeight(200);
		stage.setWidth(300);
		stage.show();
	}
	
	/** Method used for calculating investment value */
	void investmentValue() {
		double parsedInvestmentAmount = Double.parseDouble(investmentAmount.getText());
		int parsedYears = Integer.parseInt(numberOfYears.getText());
		double parsedAnnualInterestRate = Double.parseDouble(annualInterestRate.getText());
		futureValue.setText(String.format("$%.2f", (parsedInvestmentAmount * Math.pow(1 + parsedAnnualInterestRate / 12 / 100, parsedYears * 12))));
	}
	
	public static void main(String[] args) {
		launch();
	}
}