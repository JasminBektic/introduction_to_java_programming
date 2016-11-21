package eventDrivenProgramming_and_Animations;

	/*
	 * @author Jasmin Bektic
	 * 
	 * Write a program that draws line segments using the arrow keys. The line starts from the center of the pane and draws toward east, 
	 * north, west, or south when the right-arrow key, up-arrow key, leftarrow key, or down-arrow key is pressed, as shown in 
	 * Figure 15.26b.
	 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Exercise15_09 extends Application {
	double x = 150;
	double y = 100;
	
	@Override
	public void start(Stage stage) throws Exception {
	
		Pane pane = new Pane();
		
		Scene scene = new Scene(pane, 300, 200);
		stage.setScene(scene);
		stage.show();
	
		pane.setOnKeyPressed(e -> {
			switch(e.getCode()) {
				case UP: pane.getChildren().add(new Line(x, y, x, y -= 20)); break;
				case DOWN: pane.getChildren().add(new Line(x, y, x, y += 20)); break;
				case RIGHT: pane.getChildren().add(new Line(x, y, x += 20, y)); break;
				case LEFT: pane.getChildren().add(new Line(x, y, x -= 20, y)); break;
			}
		});
		pane.requestFocus();
	}
	
	public static void main(String[] args) {
		launch();
	}
}