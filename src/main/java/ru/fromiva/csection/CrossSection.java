package ru.fromiva.csection;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CrossSection extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        pane.setPrefHeight(500.0);
        pane.setPrefWidth(500.0);
        stage.setScene(new Scene(pane));
        stage.setTitle("CrossSection");
        stage.show();
    }
}
