import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;

public class App extends Application {
    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        btn.setText("Say 'Hello World1'");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                // System.out.println("Hello World!1");
                Print p = new Print();
                p.hello1();
            }
        });

        Button btn2 = new Button();
        btn2.setText("Say 'Hello World2'");
        btn2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                // System.out.println("Hello World!2");
                Print p = new Print();
                p.hello2();
            }
        });

        Button btn3 = new Button();
        btn3.setText("Open Dialog");
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                final Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.initOwner(primaryStage);
                VBox dialogVbox = new VBox(20);
                dialogVbox.getChildren().add(new Text("This is a Dialog"));
                Scene dialogScene = new Scene(dialogVbox, 300, 200);
                dialog.setScene(dialogScene);
                dialog.show();
            }

        });

        HBox topMenu = new HBox();
        topMenu.getChildren().add(btn);
        HBox lowMenu = new HBox();
        lowMenu.getChildren().add(btn2);
        HBox leftMenu = new HBox();
        leftMenu.getChildren().add(btn3);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setCenter(lowMenu);
        borderPane.setLeft(leftMenu);

        primaryStage.setScene(new Scene(borderPane, 300, 250));
        primaryStage.show();
    }
}
