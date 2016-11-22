package javaFX_basics;

	/*
	 * @author Jasmin Bektic
	 * 
	 *  Write a program that uses a bar chart to display the percentages of the overall grade represented by projects, 
	 *  quizzes, midterm exams, and the final exam, as shown in Figure 14.46b. Suppose that projects take 20 percent 
	 *  and are displayed in red, quizzes take 10 percent and are displayed in blue, midterm exams take 30 percent 
	 *  and are displayed in green, and the final exam takes 40 percent and is displayed in orange. Use the Rectangle 
	 *  class to display the bars. Interested readers may explore the JavaFX BarChart class for further study
	 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise14_12 extends Application {
	final int[] percentage = {20, 10, 30, 40};
	final Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE};
	final String[] titles = {"Project -- %d%%", "Quiz -- %d%%", "Midterm -- %d%%", "Final -- %d%%"};

	@Override
	public void start(Stage stage) throws Exception {
		
		HBox hbox = new HBox(5);
		
		for (int i = 0; i < percentage.length; i++) {
			Rectangle rectangle = new Rectangle(90, percentage[i]);
			rectangle.setFill(colors[i]);
			Text text = new Text(String.format(titles[i], percentage[i]));
			VBox vbox = new VBox(text, rectangle);
			vbox.setAlignment(Pos.BOTTOM_LEFT);
			vbox.setSpacing(3);
			hbox.getChildren().add(vbox);
		}
		stage.setScene(new Scene(hbox));
		stage.show();
	}
	
	public static void main(String[] args) {
		launch();
	}
}