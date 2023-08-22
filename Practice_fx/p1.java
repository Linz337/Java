package Practice_fx;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class p1 extends Application {

    Image image0=new Image("Practice_fx/image.png");
    public static void main(String[] args) {
        Application.launch(args);
    }
/*
        //root.getChildren().add(layout);

        //layout.getChildren().add(label);

        //root.getChildren().add(view);

    }*/

    @Override
    public void start(Stage stage) throws Exception {
        Group root=new Group();
        Scene scene=new Scene(root,500,400);

        Label label=new Label("text");
        BorderPane layout=new BorderPane(label);

        ImageView view=new ImageView();
        view.setImage(image0);

        stage.setScene(scene);
        stage.setTitle("Practice");
        stage.show();
    }
}

