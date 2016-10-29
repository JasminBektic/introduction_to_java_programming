package javaFX_basics;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Write a program that displays a string Welcome to Java around the circle, as shown in Figure 14.44b. 
	 * Hint: You need to display each character in the right location with appropriate rotation using a loop.
	 */

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise14_05 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Pane pane = new Pane();
		Point2D point = new Point2D(100, 100);
	    String[] s = "WELCOME TO JAVA".split("");
	
	    //Create nodes and place them in pane
	    int angle = 0;
	    int rotate = 90;
	    for (int i = 0; i < s.length; i++) {
	    	angle += 22;
	    	rotate += 22;
	    	double x = point.getX() + 50 * Math.cos(Math.toRadians(angle));
	        double y = point.getY() + 50 * Math.sin(Math.toRadians(angle));
	        Text text = new Text(x, y, s[i]);
	        text.setRotate(rotate);
	        text.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
	        pane.getChildren().add(text);
	    }
	   
	    //Create scene
	    Scene scene = new Scene(pane, 200, 200);
	    stage.setTitle("Exercise14_05");
	    stage.setScene(scene);
	    stage.show();
	}
}