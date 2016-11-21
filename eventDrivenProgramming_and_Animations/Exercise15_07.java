package eventDrivenProgramming_and_Animations;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Write a program that displays the color of a circle as black when the mouse button is pressed and as white when 
	 * the mouse button is released.
	 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Exercise15_07 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		//Create circle and set properties
		Circle circle = new Circle();
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		circle.setRadius(50);
		circle.setOnMousePressed(e -> circle.setFill(Color.BLACK));
		circle.setOnMouseReleased(e -> circle.setFill(Color.WHITE));
		
		StackPane pane = new StackPane(circle);
		
		//Set scene
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch();
	}
}