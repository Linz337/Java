package Practice_fx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class prac1 extends Application {
    Image image0=new Image("Practice_fx/image.png");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Group root=new Group();
        Scene scene=new Scene(root,500,400);


        BorderPane layout=new BorderPane();
        root.getChildren().add(layout);

        //add image to the scene graph
        ImageView view=new ImageView();
        root.getChildren().add(view);
        view.setFitHeight(300);
        view.setFitWidth(500);
        //view.setRotate(30);
        view.setImage(image0);

        //add component to scene graph  consist of root
        Label label=new Label("text");
        label.setFont(Font.font(30));
        label.setTextFill(Color.BLUE);
        //label.setRotate(-30);
        root.getChildren().add(label);


        layout.setLeft(view);
        layout.setBottom(label);

        stage.setScene(scene);
        stage.setTitle("Practice");
        stage.show();
    }
}
