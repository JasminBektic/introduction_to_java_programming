package javaFX_basics;

	/*
	 * @author Jasmin Bektic
	 * 
	 *  Write a program that places four fans in a GridPane with two rows and two columns, as shown in Figure 14.45b.
	 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Exercise14_09 extends Application {
	
	@Override
	public void start(Stage stage) throws Exception {
		
		GridPane gridPane = new GridPane();
		
		Pane[] nodes = new Pane[4];
		int angle = 0;
		
		for (int i = 0; i < 4; i++) {
			Pane pane = new Pane();
			//Create arcs and import into pane
			for (int j = 0; j < 4; j++) {
				Arc arc = new Arc(70, 70, 60, 60, 30 + angle, 30);
				arc.setType(ArcType.ROUND);
				pane.getChildren().add(arc);
				angle += 90;
			}
		//Create circle and set properties
		Circle circle = new Circle();
		circle.setRadius(70);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		
		nodes[i] = new StackPane(circle, pane);
		nodes[i].setPadding(new Insets(5, 5, 5, 5));
		}

		//Set nodes in appropriate places
		gridPane.add(nodes[0], 0, 0);
		gridPane.add(nodes[1], 0, 1);
		gridPane.add(nodes[2], 1, 0);
		gridPane.add(nodes[3], 1, 1);
		
		stage.setScene(new Scene(gridPane));
		stage.show();
	}
	
	public static void main(String[] args) {
		launch();
	}
}