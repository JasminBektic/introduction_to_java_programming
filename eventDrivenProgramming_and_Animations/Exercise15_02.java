package eventDrivenProgramming_and_Animations;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Write a program that rotates a rectangle 15 degrees right when the Rotate button is clicked, as shown in Figure 15.24b.
	 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise15_02 extends Application {
	final int ROTATE_DEGREE = 15;
	Rectangle rectangle = new Rectangle();

	@Override
	public void start(Stage stage) throws Exception {
		
		//Rectangle properties
		rectangle.setWidth(50);
		rectangle.setHeight(100);
		rectangle.setStroke(Color.BLACK);
		rectangle.setFill(Color.WHITE);
		
		//Createe button and set properties
		Button btn = new Button("Rotate");
		btn.setAlignment(Pos.BOTTOM_CENTER);
		btn.setOnAction(e -> rotateRectangle());
		
		//Create pane, import nodes and set properties
		VBox vbox = new VBox(rectangle, btn);
		VBox.setMargin(rectangle, new Insets(20, 0, 20, 0));
		vbox.setAlignment(Pos.CENTER);
		
		//Set scene
		Scene scene = new Scene(vbox);
		stage.setScene(scene);
		stage.show();
	}
	
	/** Rectangle rotation */
	void rotateRectangle() {
		rectangle.setRotate(rectangle.getRotate() + ROTATE_DEGREE);
	}
	
	public static void main(String[] args) {
		launch();
	}
}