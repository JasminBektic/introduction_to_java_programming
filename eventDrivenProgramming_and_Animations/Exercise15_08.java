package eventDrivenProgramming_and_Animations;

	/*
	 * @author Jasmin Bektic
	 * 
	 *  Write two programs, such that one displays the mouse position when the mouse button is clicked (see Figure 15.26a) and 
	 *  the other displays the mouse position when the mouse button is pressed and ceases to display it when the mouse button 
	 *  is released.
	 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise15_08 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		Text text = new Text();
		Pane pane = new Pane();
		
		//Show mouse position
		pane.setOnMousePressed(e -> {
			text.setText(String.format("(%.1f, %.1f", e.getX(), e.getY()));
			text.setX(e.getX());
			text.setY(e.getY());
			pane.getChildren().clear();
			pane.getChildren().add(text);
		});
		
		//Delete mouse position
		pane.setOnMouseReleased(e -> text.setText(""));
		
		//Set scene
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch();
	}
}