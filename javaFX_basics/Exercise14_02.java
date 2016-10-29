package javaFX_basics;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Write a program that displays a tic-tac-toe board, as shown in Figure 14.43b. A cell may be X, O, 
	 * or empty. What to display at each cell is randomly decided. The X and O are images in the files x.gif and o.gif.
	 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise14_02 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		String[] xo = new String[3];
		xo[0] = "file:///d:/image/x.gif";
		xo[1] = "file:///d:/image/o.gif";
	
		//Create pane and place nodes
		GridPane pane = new GridPane();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int rand = (int) (Math.random() * 3);
				if (rand != 2) {
					pane.add(new ImageView(new Image(xo[rand])), j, i);
				}
			}
		}
		
		//Create scene and place in the stage
		Scene scene = new Scene(pane);
		stage.setTitle("Exercise14_02");
		stage.setScene(scene);
		stage.show();
	}
}