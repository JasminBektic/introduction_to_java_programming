package javaFX_basics;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Write a program that displays three cards randomly selected from a deck of 52, as shown in Figure 14.43c. 
	 * The card image files are named 1.png, 2.png, …, 52.png and stored in the image/card directory. All three cards 
	 * are distinct and selected randomly. Hint: You can select random cards by storing the numbers 1–52 to an array 
	 * list, perform a random shuffle introduced in Section 11.12, and use the first three numbers in the array list 
	 * as the file names for the image.
	 */

import java.util.ArrayList;
import java.util.Collections;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Exercise14_03 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		//Create array with ImageView objects
		ArrayList<ImageView> list = new ArrayList<>();
		for (int i = 1; i <= 52; i++) {
			list.add(new ImageView(new Image("file:///d:/image/card/" + i + ".png")));
		}
		Collections.shuffle(list);
		
		//Create pane and place nodes
		HBox pane = new HBox();
		pane.getChildren().addAll(list.get(0), list.get(1), list.get(2));
		
		//Create scene
		Scene scene = new Scene(pane);
		stage.setTitle("Exercise14_03");
		stage.setScene(scene);
		stage.show();
	}
}