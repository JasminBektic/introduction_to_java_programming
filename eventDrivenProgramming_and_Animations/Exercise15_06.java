package eventDrivenProgramming_and_Animations;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Write a program to display the text Java is fun and Java is powerful alternately with a mouse click.
	 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise15_06 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 300, 100);
		stage.setScene(scene);
		stage.show();
		Text text = new Text();
		scene.setOnMouseClicked(e -> {
			int randomNum = (int) (Math.random() * 2);
			switch (randomNum) {
		    	case 0: text.setText("Java is powerful"); break;
		    	case 1: text.setText("Java is fun"); break;
			}
			text.setX(e.getX());
			text.setY(e.getY());
			pane.getChildren().clear();
			pane.getChildren().add(text);
		});
	}
	
	public static void main(String[] args) {
		launch();
	}
}