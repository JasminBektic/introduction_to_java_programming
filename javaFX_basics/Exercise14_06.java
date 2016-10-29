package javaFX_basics;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Write a program that displays a checkerboard in which each white and black cell is a Rectangle with 
	 * a fill color black or white, as shown in Figure 14.44c.
	 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise14_06 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		//Create pane and set properties
		FlowPane pane = new FlowPane();
		pane.setPrefWrapLength(160);
		
		//Create nodes and place them in pane
		int count = 0;
		for (int i = 1; i <= 32; i++) {
			if (count == 8) {
				count = 0;
			}
			if (count >= 4) {
				Rectangle white = new Rectangle(20, 20);
				white.setFill(Color.WHITE);
				pane.getChildren().addAll(new Rectangle(20, 20), white);
				count++;
			} else {
				Rectangle white = new Rectangle(20, 20);
				white.setFill(Color.WHITE);
				pane.getChildren().addAll(white, new Rectangle(20, 20));
				count++;
			}
		}
		
		//Create scene
		Scene scene = new Scene(pane);
		stage.setTitle("Exercise14_06");
		stage.setScene(scene);
		stage.show();
	}
}