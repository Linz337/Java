package daily_practice;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXExampleWithMouseEvents extends Application {

    public void start(Stage primaryStage) {
        // 创建顶层容器
        VBox root = new VBox(10); // 使用垂直布局，10像素间距
        root.setPadding(new Insets(10)); // 设置内边距

        // 创建单选框
        ToggleGroup radioGroup = new ToggleGroup(); // 创建单选按钮组
        RadioButton radioButton1 = new RadioButton("Option 1");
        radioButton1.setToggleGroup(radioGroup);
        RadioButton radioButton2 = new RadioButton("Option 2");
        radioButton2.setToggleGroup(radioGroup);
        RadioButton radioButton3 = new RadioButton("Option 3");
        radioButton3.setToggleGroup(radioGroup);

        // 创建复选框
        CheckBox checkBox1 = new CheckBox("Checkbox 1");
        CheckBox checkBox2 = new CheckBox("Checkbox 2");
        CheckBox checkBox3 = new CheckBox("Checkbox 3");

        // 添加单选框和复选框到水平布局
        HBox controls = new HBox(10); // 使用水平布局，10像素间距
        controls.getChildren().addAll(radioButton1, radioButton2, radioButton3, checkBox1, checkBox2, checkBox3);

        // 添加鼠标点击事件处理
        controls.addEventFilter(MouseEvent.MOUSE_CLICKED, event -> {
            System.out.println("Mouse Clicked at (" + event.getX() + ", " + event.getY() + ")");
        });

        // 将控件添加到顶层容器
        root.getChildren().addAll(controls);

        // 创建场景
        Scene scene = new Scene(root, 300, 200);

        // 设置舞台标题
        primaryStage.setTitle("JavaFX Example with Mouse Events");

        // 设置场景
        primaryStage.setScene(scene);

        // 显示舞台
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
