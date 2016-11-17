package eventDrivenProgramming_and_Animations;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Write a program to perform addition, subtraction, multiplication, and division, as shown in Figure 15.25a.
	 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Exercise15_04 extends Application {
	TextField number1 = new TextField();
	TextField number2 = new TextField();
	TextField result = new TextField();
	
	@Override
	public void start(Stage stage) throws Exception {
		
		//TextField and hbox properties
		number1.setPrefWidth(50);
		number2.setPrefWidth(50);
		result.setPrefWidth(50);
		HBox hbox1 = new HBox(new Label("Number 1:"), number1, new Label("Number 2:"), number2, new Label("Result:"), result);
		hbox1.setAlignment(Pos.CENTER);
		hbox1.setSpacing(3);
		
		//Create buttons and set actions
		Button btnAdd = new Button("Add");
		btnAdd.setOnAction(e -> operatingNumbers("+"));
		Button btnSubtract = new Button("Subtract");
		btnSubtract.setOnAction(e -> operatingNumbers("-"));
		Button btnMultiply = new Button("Multiply");
		btnMultiply.setOnAction(e -> operatingNumbers("*"));
		Button btnDivide = new Button("Divide");
		btnDivide.setOnAction(e -> operatingNumbers("/"));
		
		//Create hbox, set properties and import buttons
		HBox hbox2 = new HBox(btnAdd, btnSubtract, btnMultiply, btnDivide);
		hbox2.setSpacing(5);
		hbox2.setAlignment(Pos.CENTER);
		
		VBox vbox = new VBox(hbox1, hbox2);
		vbox.setPrefWidth(330);
		vbox.setSpacing(20);
		
		//Set scene
		Scene scene = new Scene(vbox);
		stage.setScene(scene);
		stage.setTitle("Mini Calculator");
		stage.show();
	}
	
	/** Method doing simple operations */
	void operatingNumbers(String operator) {
		double num1 = 0;
		double num2 = 0;
		try {
			num1 = Integer.parseInt(number1.getText());
			num2 = Integer.parseInt(number2.getText());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		switch(operator) {
			case "+": result.setText(num1 + num2 + ""); break;
			case "-": result.setText(num1 - num2 + ""); break;
			case "*": result.setText(num1 * num2 + ""); break;
			case "/": result.setText(num1 / num2 + ""); break;
		}
		number1.clear();
		number2.clear();
	}
	
	public static void main(String[] args) {
		launch();
	}
}