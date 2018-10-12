package fourkman;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
/***
 * The MainController drives the core application behaviour.
 * 
 */
public class MainController  implements Initializable{
    
    @FXML
    private Canvas canvas;
    @FXML 
    private AnchorPane pane;
    
    private GraphicsContext graphics;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        graphics = canvas.getGraphicsContext2D();
        canvas.widthProperty().bind(pane.widthProperty());
        canvas.heightProperty().bind(pane.heightProperty());
        // redraw when resized
        canvas.widthProperty().addListener(event -> colouringTest());
        canvas.heightProperty().addListener(event -> colouringTest());
    }
    
    public void colouringTest(){
        graphics.setStroke(Color.BLACK);
        graphics.beginPath();
        graphics.setFill(Color.BLACK);
        graphics.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        graphics.closePath();       
    }
}
