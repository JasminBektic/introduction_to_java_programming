package javaFX_basics;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Write a program that draws a cylinder, as shown in Figure 14.45b. You can use the following method to set the dashed stroke for 
	 * an arc: arc.getStrokeDashArray().addAll(6.0, 21.0);
	 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Exercise14_10 extends Application {
	int centerX = 150;
	int centerY = 100;
	int radiusX = 100;
	int radiusY = 40;
	int startAngle = 0;
	int length = 180;
	Arc arc;
	Line line;

	@Override
	public void start(Stage stage) throws Exception {
		
		Pane pane = new Pane();
		
		//Create lower ellipse
		arc = new Arc(centerX, centerY + 200, radiusX, radiusY, startAngle, length);
		arc.getStrokeDashArray().addAll(6.0, 21.0);
		arcProperties();
		pane.getChildren().addAll(arc);
		arc = new Arc(centerX, centerY + 200, radiusX, radiusY, startAngle + 180, length);
		arcProperties();
		pane.getChildren().addAll(arc);
		
		//Create upper ellipse
		arc = new Arc(centerX, centerY, radiusX, radiusY, startAngle, length + 180);
		arcProperties();
		pane.getChildren().addAll(arc);
		
		//Create side lines
		line = new Line(centerX - radiusX, centerY, centerX - radiusX, centerY + 200);
		pane.getChildren().add(line);
		line = new Line(centerX + radiusX, centerY, centerX + radiusX, centerY + 200);
		pane.getChildren().add(line);
		
		stage.setScene(new Scene(pane, 300, 400));
		stage.show();
	}
	
	/** Common properties for all arcs */
	void arcProperties() {
		arc.setFill(Color.WHITE);
		arc.setStroke(Color.BLACK);
		arc.setType(ArcType.OPEN);
	}
	
	public static void main(String[] args) {
		launch();
	}
}