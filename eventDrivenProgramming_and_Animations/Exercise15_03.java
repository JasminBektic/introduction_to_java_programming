package eventDrivenProgramming_and_Animations;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Write a program that moves the ball in a pane. You should define a pane class for displaying the ball and provide 
	 * the methods for moving the ball left, right, up, and down, as shown in Figure 15.24c. Check the boundary to prevent 
	 * the ball from moving out of sight completely.
	 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Exercise15_03 extends Application {
	Circle circle = new Circle();
	Pane pane = new Pane(circle);

	@Override
	public void start(Stage stage) throws Exception {
		
		//Circle and pane properties
		circle.setCenterX(100);
		circle.setCenterY(70);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		circle.setRadius(15);
		pane.setMinHeight(150);
		pane.setMinWidth(200);
		
		//Buttons properties
		Button btnLeft = new Button("Left");
		btnLeft.setOnAction(e -> moveCircleLeft());
		Button btnRight = new Button("Right");
		btnRight.setOnAction(e -> moveCircleRight());
		Button btnUp = new Button("Up");
		btnUp.setOnAction(e -> moveCircleUp());
		Button btnDown = new Button("Down");
		btnDown.setOnAction(e -> moveCircleDown());
		
		//Import buttons in pane and set properties
		HBox hbox = new HBox(btnLeft, btnRight, btnUp, btnDown);
		hbox.setSpacing(5);
		hbox.setAlignment(Pos.CENTER);
		
		VBox vbox = new VBox(pane, hbox);
		
		//Set scene
		Scene scene = new Scene(vbox);
		stage.setScene(scene);
		stage.setTitle("Exercise15_02");
		stage.show();
	}
	
	void moveCircleLeft() {
		if (circle.getCenterX() != 0) 
			circle.setCenterX(circle.getCenterX() - 10);
	}
	
	void moveCircleRight() {
		if (circle.getCenterX() != pane.getWidth())
			circle.setCenterX(circle.getCenterX() + 10);
	}
	
	void moveCircleUp() {
		if (circle.getCenterY() != 0)
			circle.setCenterY(circle.getCenterY() - 10);
	}
	
	void moveCircleDown() {
		if (circle.getCenterY() != pane.getHeight())
			circle.setCenterY(circle.getCenterY() + 10);
	}
	
	public static void main(String[] args) {
		launch();
	}
}