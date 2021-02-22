package controller;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

public class MainWindows {

    private Scene scene;
    private Stage stage;

    public MainWindows(Scene scene, Stage stage) {
        this.scene = scene;
        this.stage = stage;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void clickButton(ActionEvent actionEvent) {
        Boolean turno = true;
        Button b = (Button) actionEvent.getSource();
        System.out.println("hola");



    }

}
