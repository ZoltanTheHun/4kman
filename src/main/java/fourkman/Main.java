package fourkman;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main  extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        /* prepare the resource */
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/main.fxml"));
        Parent root = loader.load();
        
        /* initialize the scene */
        Scene scene = new Scene(root);
        stage.setTitle("4kman");
        stage.setScene(scene);
        stage.show();   
    }
    
}
