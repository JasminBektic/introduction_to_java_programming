package javaFX_basics;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Write a program that displays five texts vertically, as shown in Figure 14.44a. Set a random color 
	 * and opacity for each text and set the font of each text to Times Roman, bold, italic, and 22 pixels.
	 */

import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Exercise14_04 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Random rand = new Random();
		HBox pane = new HBox();
		Label label;
		
		//Create nodes and properties
		for (int i = 0; i < 5; i++) {
			label = new Label("Java");
			label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
			label.setRotate(90);
			label.setPadding(new Insets(30, 10, 10, 10));
			label.setTextFill(Color.rgb(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256), Math.random()));
			pane.getChildren().add(label);
		}
		
		//Create scene and place it in stage
		Scene scene = new Scene(pane);
		stage.setTitle("Exercise14_04");
		stage.setScene(scene);
		stage.show();
	}
}