package javaFX_basics;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Write a program that displays four images in a grid pane, as shown in Figure 14.43a.
	 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise14_01 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Create pane and set properties
		GridPane pane = new GridPane();
		pane.setHgap(3);
		pane.setVgap(3);
		
		//Nodes properties
		ImageView image1 = new ImageView(new Image("file:///d:/image/flag5.gif"));
		image1.setFitHeight(50);
		image1.setFitWidth(100);
		ImageView image2 = new ImageView(new Image("file:///d:/image/ca.gif"));
		image2.setFitHeight(60);
		image2.setFitWidth(120);
		ImageView image3 = new ImageView(new Image("file:///d:/image/flag2.gif"));
		image3.setFitHeight(55);
		image3.setFitWidth(95);
		ImageView image4 = new ImageView(new Image("file:///d:/image/flag6.gif"));
		image4.setFitHeight(55);
		image4.setFitWidth(105);
		
		//Place nodes in the pane
		pane.add(image1, 0, 0);
		pane.add(image3, 0, 1);
		pane.add(image2, 1, 0);
		pane.add(image4, 1, 1);
		
		//Create scene
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise14_01");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}