package demo.src.main.java.com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ImageGridPane extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Image Grid Pane Example");

        // Create a GridPane to hold the images
        GridPane gridPane = new GridPane();

        // Load four image files
        Image image1 = new Image("file:///C:/Users/iamet/OneDrive/Documents/Java stuff for school/14.1/us flag.png");
        Image image2 = new Image(
                "file:///C:/Users/iamet/OneDrive/Documents/Java stuff for school/14.1/germany flag.png");
        Image image3 = new Image(
                "file:///C:/Users/iamet/OneDrive/Documents/Java stuff for school/14.1/france flag.png");
        Image image4 = new Image("file:///C:/Users/iamet/OneDrive/Documents/Java stuff for school/14.1/china flag.png");

        // Create ImageViews to display the images
        ImageView imageView1 = new ImageView(image1);
        ImageView imageView2 = new ImageView(image2);
        ImageView imageView3 = new ImageView(image3);
        ImageView imageView4 = new ImageView(image4);

        // Add ImageViews to the GridPane
        gridPane.add(imageView1, 0, 0);
        gridPane.add(imageView2, 1, 0);
        gridPane.add(imageView3, 0, 1);
        gridPane.add(imageView4, 1, 1);

        // Create a scene and set it on the stage
        Scene scene = new Scene(gridPane, 400, 400);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}