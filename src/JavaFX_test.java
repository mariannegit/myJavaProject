/**
 * Created by marianne on 28.10.16.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class JavaFX_test extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Kliki ringil");

        Circle ring = new Circle(100);
        ring.setCenterX(250);
        ring.setCenterY(250);

        pane.getChildren().add(ring);

        primaryStage.show();

        ring.setOnMouseClicked(event -> {
            System.out.println("KLIKK");

            int red = (int)(Math.random()*256);
            int green = (int)(Math.random()*256);
            int blue = (int)(Math.random()*256);
            ring.setFill(Color.rgb(red, green, blue));

            int koordinaat1 = (int)((Math.random()*300)+100);
            int koordinaat2 = (int)((Math.random()*300)+100);
            ring.setCenterX(koordinaat1);
            ring.setCenterY(koordinaat2);

        });

    }
}