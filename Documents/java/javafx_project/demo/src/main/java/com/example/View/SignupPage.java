package com.example.View;

import javafx.application.Application;
import com.example.Controller.FireBaseAuthController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SignupPage extends Application{

    private final FireBaseAuthController authController = new FireBaseAuthController();

    public Scene createSignupScene(Runnable backHandler) {

        // Background Image
        Image backgroundImage = new Image("/Asset/images/3139256.jpg"); // path to your image
        ImageView backgroundImageView = new ImageView(backgroundImage);
        backgroundImageView.setFitWidth(800);
        backgroundImageView.setFitHeight(600);
        backgroundImageView.setPreserveRatio(false);

        // Signup Form UI
        Label heading = new Label("Create Account");
        heading.setFont(Font.font("Arial", 28));
        heading.setTextFill(Color.WHITE);

        TextField emailField = new TextField();
        emailField.setPromptText("Email");
        emailField.setMaxWidth(250);

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");
        passwordField.setMaxWidth(250);

        Button signUpButton = new Button("Sign Up");
        signUpButton.setStyle("-fx-background-color: #2196F3; -fx-text-fill: white;");
        signUpButton.setPrefWidth(250);

        // Back Button
        Button backButton = new Button("Back");
        backButton.setOnAction(e -> backHandler.run());

        VBox vb = new VBox(15, heading, emailField, passwordField, signUpButton, backButton);
        vb.setAlignment(Pos.CENTER);
        vb.setPadding(new Insets(30));
        //vb.setStyle("-fx-background-color: rgba(0, 0, 0, 0.5); -fx-background-radius: 10;");
       vb.setMaxWidth(300);

        StackPane.setAlignment(vb,Pos.CENTER);

        // StackPane with background image and form
        StackPane root = new StackPane(backgroundImageView, vb);

        // Sign Up Handler
        signUpButton.setOnAction(e -> {
            String email = emailField.getText();
            String password = passwordField.getText();
            authController.handleSignup(email, password);
        });

        return new Scene(root, 800, 600);
    }

    // For testing independently
    public void start(Stage stage) {
        Scene scene = createSignupScene(() -> System.out.println("Back pressed"));
        stage.setTitle("Signup Page");
        stage.setScene(scene);
        stage.show();
    }
}
