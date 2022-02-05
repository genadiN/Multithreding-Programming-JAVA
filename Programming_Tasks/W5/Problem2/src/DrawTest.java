import javafx.scene.shape.Line;

public class DrawTest extends Application {
    public void start(Stage stage) throws Exception{
        Group group = new Group();

        Line example = new Line();
        example.draw(group);

        stage.setTitle("Example");
        stage.setScene(new Scene(group, 300 , 300));
        stage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
