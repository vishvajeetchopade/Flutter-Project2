package com.example;
import com.example.Controller.FireBaseAuthController;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginPage extends Application {
    private final FireBaseAuthController authController = new FireBaseAuthController();

    @Override
    public void start(Stage stage) {
        // UI Controls
        TextField emailField = new TextField();
        emailField.setPromptText("Gmail Email");
        emailField.setMaxWidth(250);

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");
        passwordField.setMaxWidth(250);

        Button loginButton = new Button("Login");
        Label resultLabel = new Label();
        loginButton.setAlignment(Pos.CENTER);
        

        // Login button action
        loginButton.setOnAction(e -> {
            String email = emailField.getText();
            String password = passwordField.getText();

            // Disable UI while processing
            loginButton.setDisable(true);
            resultLabel.setText("Logging in...");

            // Run network call in background thread to avoid freezing UI
            new Thread(() -> {
                boolean success = authController.signInWithEmailAndPassword(email, password);

                Platform.runLater(() -> {
                    resultLabel.setText(success ? "Login successful!" : "Login failed.");
                    loginButton.setDisable(false);
                });
            }).start();
        });

        // Layout
        VBox vb = new VBox(40, emailField, passwordField, loginButton, resultLabel);
        vb.setPadding(new Insets(70));
        
        vb.setAlignment(Pos.CENTER);
         // Center the content
         
         
         // adjust path as needed
        /*BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        
        BackgroundImage background = new BackgroundImage(backgroundImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                backgroundSize
        );*/
        Image backgroundImage = new Image("/Asset/images/3139256.jpg"); // path to your image
        ImageView backgroundImageView = new ImageView(backgroundImage);
        backgroundImageView.setFitWidth(800);
        backgroundImageView.setFitHeight(600);
        backgroundImageView.setPreserveRatio(false);



         /*  StackPane root = new StackPane();
        root.setBackground(new Background(background));
        root.getChildren().add(vb); */
        StackPane root = new StackPane(backgroundImageView, vb);




        // Scene
        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);
        stage.setTitle("Firebase Login");
        stage.show();
    }

    public void getLoginScene() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLoginScene'");
    }

    
}

