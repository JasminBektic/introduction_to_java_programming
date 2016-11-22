package javaFX_basics;

	/*
	 * @author Jasmin Bektic
	 * 
	 *  Write a program that displays a 10-by-10 square matrix, as shown in Figure 14.45a. Each element in the matrix is 0 or 1, 
	 *  randomly generated. Display each number centered in a text field. Use TextField’s setText method to set value 0 or 1 
	 *  as a string.
	 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise14_07 extends Application {
	GridPane pane = new GridPane();
	TextField text;

	@Override
	public void start(Stage stage) throws Exception {
		
		importNodes();

		stage.setScene(new Scene(pane));
		stage.show();
	}
	
	/** Import 10x10 TextFields into pane */
	void importNodes() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				pane.add(text = new TextField(), i, j);
				text.setText((int)(Math.random() * 2) + "");
				text.setPrefSize(30, 30);
				text.setAlignment(Pos.CENTER);
			}
		}
	}
	
	public static void main(String[] args) {
		launch();
	}
}