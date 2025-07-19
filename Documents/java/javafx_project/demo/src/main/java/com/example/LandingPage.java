package com.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LandingPage extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Background Image that covers full screen
        BackgroundImage bgImage = new BackgroundImage(
            new Image("/Asset/images/bradyn-shock-Zmp0FJxwVIc-unsplash.jpg", 
                      1920, 1080, false, true),
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(100, 100, true, true, true, false)
        );

        // BorderPane as root layout
        BorderPane mainPane = new BorderPane();
        mainPane.setBackground(new Background(bgImage));
        mainPane.setPadding(new Insets(50));

        // Top-right navigation bar
        HBox navBar = new HBox(20);
        navBar.setAlignment(Pos.CENTER_RIGHT);
        navBar.setPadding(new Insets(20));
        Label home = new Label("HOME");
        Label products = new Label("PRODUCTS");
        Label benefits = new Label("BENEFITS");
        Button signIn = new Button("SIGN IN");

        // Styling nav labels and button
        for (Label label : new Label[]{home, products, benefits}) {
            label.setTextFill(Color.WHITE);
            label.setFont(Font.font("Arial", 14));
        }
        signIn.setStyle("-fx-background-color: transparent; -fx-border-color: white; -fx-text-fill: white;");

        navBar.getChildren().addAll(home, products, benefits, signIn);
        mainPane.setTop(navBar);

        // Main landing content (center-left)
        VBox contentBox = new VBox(20);
        contentBox.setAlignment(Pos.CENTER_LEFT);

        Text title = new Text("LANDING PAGE");
        title.setFill(Color.WHITE);
        title.setFont(Font.font("Arial", 40));

        Label subtitle = new Label(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit,\n" +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
        subtitle.setTextFill(Color.LIGHTBLUE);
        subtitle.setFont(Font.font("Arial", 16));

        Button clickHereBtn = new Button("CLICK HERE");
        clickHereBtn.setStyle(
                "-fx-background-color: #00C9A7; " +
                "-fx-text-fill: white; " +
                "-fx-font-size: 14px; " +
                "-fx-padding: 10 20 10 20;"
        );

        contentBox.getChildren().addAll(title, subtitle, clickHereBtn);
        mainPane.setLeft(contentBox);

        // Create scene and bind size
        Scene scene = new Scene(mainPane, 1200, 800);

        primaryStage.setTitle("Landing Page");
        primaryStage.setScene(scene);
        primaryStage.setMaximized(true); // Use full screen without hiding taskbar
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
