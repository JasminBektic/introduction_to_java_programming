package eventDrivenProgramming_and_Animations;

	/*
	 * @author Jamsin Bektic
	 * 
	 *  Write a program that receives a string from the keyboard and displays it on a pane. The Enter 
	 *  key signals the end of a string. Whenever a new string is entered, it is displayed on the pane.
	 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise15_10 extends Application {
	StringBuilder string = new StringBuilder();

	@Override
	public void start(Stage stage) throws Exception {
		
		Text text = new Text();
		text.setX(50);
		text.setY(50);
		
		Pane pane = new Pane();
		
		pane.setOnKeyPressed(e -> {
			KeyCode key = e.getCode();
			if (key.equals(KeyCode.SPACE)) {
				string.append(" ");
			}
			if (key.isLetterKey() || key.isDigitKey()) {
				string.append(key.getName());
			}
			if (key.equals(KeyCode.ENTER)) {
				pane.getChildren().clear();
				text.setText(string.toString());
				pane.getChildren().add(text);
				string.delete(0, string.length());
			}
		});
		
		stage.setScene(new Scene(pane, 300, 100));
		stage.show();
		pane.requestFocus();
	}
	
	public static void main(String[] args) {
		launch();
	}
}