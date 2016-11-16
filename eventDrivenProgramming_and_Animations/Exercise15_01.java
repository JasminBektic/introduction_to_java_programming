package eventDrivenProgramming_and_Animations;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Write a program that lets the user click the Refresh button to display four cards from a deck of 52 cards, as shown in Figure 15.24a. 
	 * (See the hint in Programming Exercise 14.3 on how to obtain four random cards.)
	 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Exercise15_01 extends Application {
	final int NUMBER_OF_CARDS = 4;
	HBox hbox = new HBox();

	@Override
	public void start(Stage stage) throws Exception {
		randomCards();
		
		//Create button and set properties
		Button btn = new Button("Refresh");
		btn.setAlignment(Pos.CENTER);
		btn.setOnAction(e -> {
			hbox.getChildren().clear();
			randomCards();
		});
		VBox pane = new VBox(hbox, new StackPane(btn));
		
		//Create scene
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.show();
	}
	
	/** Creating random cards */
	void randomCards() {
		for (int i = 0; i < NUMBER_OF_CARDS; i++) {
			hbox.getChildren().add(new ImageView(new Image("file:///d:/book_danielYLiang/book/image/card/" + (int) (Math.random() * 52 + 1) + ".png")));
		}
	}
	
	/** Main method */
	public static void main(String[] args) {
		launch();
	}
}