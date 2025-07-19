package com.example;

import java.net.URI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HomePage extends Application{
    @Override
    public void start(Stage stage){
        
        
        Text title = new Text("Welcome To Our Social Locality App");
title.setFont(Font.font("Verdana", 40));
title.setFill(Color.DARKBLUE);

// Drop Shadow (outer shadow)
DropShadow dropShadow = new DropShadow();
dropShadow.setOffsetX(3);
dropShadow.setOffsetY(3);
dropShadow.setColor(Color.rgb(50, 50, 50, 0.7));

// Inner Shadow (inner lighting effect)
InnerShadow innerShadow = new InnerShadow();
innerShadow.setOffsetX(1);
innerShadow.setOffsetY(1);
innerShadow.setColor(Color.web("#666666"));

// Combine both shadows
dropShadow.setInput(innerShadow);
title.setEffect(dropShadow);

  Button bt=new Button("Back");
  bt.setStyle("-fx-background-color: #2196F3; -fx-text-fill: white; -fx-font-size: 25px;");
  HBox hbox = new HBox(250); // spacing between items
        hbox.setPadding(new Insets(10));
        hbox.setAlignment(Pos.CENTER); // or Pos.CENTER_LEFT, CENTER_RIGHT
        hbox.getChildren().addAll(title, bt);  
        VBox V2=new VBox(20);
        V2.getChildren().addAll(hbox);


        
     VBox vb1 = new VBox(20);
        Image image1 = new Image("/Asset/images/cross.png");
        ImageView imageView1 = new ImageView(image1);
        imageView1.setFitWidth(300);
        imageView1.setFitHeight(300);
        imageView1.setPreserveRatio(false);
        vb1.setPadding(new Insets(10));
        vb1.setAlignment(Pos.CENTER);
        vb1.getChildren().add(imageView1);

        // VBox for Text and Button
        VBox VB1 = new VBox(15);
        VB1.setAlignment(Pos.CENTER_LEFT);
        Text tx = new Text("Medical Section");
       
       tx.setFont(Font.font("Arial", FontWeight.BOLD, 20));  // Font name, weight, size
        Text tx1 = new Text(" for Description");
        tx1.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        Button styledButton = new Button("Explore More");
        styledButton.setStyle(
            "-fx-background-color: #2196F3;" +
            "-fx-text-fill: white;" +
            "-fx-font-size: 14px;"
        );
        VB1.getChildren().addAll(tx, tx1, styledButton);

        // HBox to combine Image and Info
        HBox hb = new HBox(40);
        hb.setPadding(new Insets(15));
        hb.setAlignment(Pos.CENTER_LEFT);
        hb.getChildren().addAll(vb1, VB1);

        // Styling and Shadow
        hb.setStyle(
            "-fx-border-color: black;" +
            "-fx-border-width: 2;" +
            "-fx-border-style: solid;" +
            "-fx-border-radius: 8;" +
            "-fx-background-color: white;" +
            "-fx-background-radius: 8;"
        );

        DropShadow shadow = new DropShadow();
        shadow.setRadius(10);
        shadow.setOffsetX(4);
        shadow.setOffsetY(4);
        shadow.setColor(Color.rgb(0, 0, 0, 0.25));
        hb.setEffect(shadow);


       VBox  vb2=new VBox(20);
       Image image2=new Image("/Asset/images/diverse-group-traveling-around-the-world.jpg");
      ImageView ImageView2=new ImageView(image2);
      vb2.setPadding(new Insets(10));
      vb2.setStyle("-fx-background-color: yelow;");
      vb2.setAlignment(Pos.CENTER);
      ImageView2.setFitWidth(300);
      vb2.setStyle("-fx-border-color: black; -fx-border-width: 0.5px;");
      ImageView2.setFitHeight(300);
      ImageView2.setPreserveRatio(false);
      vb2.getChildren().addAll(ImageView2);

      VBox VB2=new VBox(20);
      VB2.setAlignment(Pos.CENTER_LEFT);
      Text tx2=new Text("Travelling section");
      tx2.setFont(Font.font("Arial", FontWeight.BOLD, 20));
      Text tx3=new Text(" for Description:");
      tx3.setFont(Font.font("Arial", FontWeight.BOLD, 20));
      
       Button styledButton1 = new Button("Explore More");
styledButton1.setStyle("-fx-background-color: #2196F3; -fx-text-fill: white; -fx-font-size: 14px;");
        

        VB2.getChildren().addAll(tx2,tx3,styledButton1);

        HBox hb1=new HBox(40);//
        hb1.getChildren().addAll(vb2,VB2);
       
 hb1.setPadding(new Insets(15));
        hb1.setAlignment(Pos.CENTER_LEFT);
       

        // Styling and Shadow
        hb1.setStyle(
            "-fx-border-color: black;" +
            "-fx-border-width: 2;" +
            "-fx-border-style: solid;" +
            "-fx-border-radius: 8;" +
            "-fx-background-color: white;" +
            "-fx-background-radius: 8;"
        );
        DropShadow shadow1 = new DropShadow();
        shadow1.setRadius(10);
        shadow1.setOffsetX(4);
        shadow1.setOffsetY(4);
        shadow1.setColor(Color.rgb(0, 0, 0, 0.25));
        hb1.setEffect(shadow);

        VBox vb3=new VBox(20);
        Image image3=new Image("/Asset/images/Transportation Truck.png");
        ImageView ImageView3=new ImageView(image3);
        vb3.setPadding(new Insets(10));
        vb3.setStyle("-fx-background-color: yelow;");
        vb3.setAlignment(Pos.CENTER);
        ImageView3.setFitWidth(300);
        vb3.setStyle("-fx-border-color: black; -fx-border-width: 0.5px;");
        ImageView3.setFitHeight(300);
        ImageView3.setPreserveRatio(false);
        vb3.getChildren().addAll(ImageView3);


         VBox VB3=new VBox(20);
           VB3.setAlignment(Pos.CENTER_LEFT);
      Text tx4=new Text("Transportation section");
      tx4.setFont(Font.font("Arial", FontWeight.BOLD, 20));
      Text tx5=new Text("for Description:");
      tx5.setFont(Font.font("Arial", FontWeight.BOLD, 20));
      
       Button styledButton3 = new Button("Explore More");
styledButton3.setStyle("-fx-background-color: #2196F3; -fx-text-fill: white; -fx-font-size: 14px;");
        

       VB3.getChildren().addAll(tx4,tx5,styledButton3);

       HBox hb2=new HBox(40);
        hb2.getChildren().addAll(vb3,VB3);//
        hb2.setPadding(new Insets(15));
        hb2.setAlignment(Pos.CENTER_LEFT);
       

        // Styling and Shadow
        hb2.setStyle(
            "-fx-border-color: black;" +
            "-fx-border-width: 2;" +
            "-fx-border-style: solid;" +
            "-fx-border-radius: 8;" +
            "-fx-background-color: white;" +
            "-fx-background-radius: 8;"
        );
        DropShadow shadow2 = new DropShadow();
        shadow2.setRadius(10);
        shadow2.setOffsetX(4);
        shadow2.setOffsetY(4);
        shadow2.setColor(Color.rgb(0, 0, 0, 0.25));
        hb2.setEffect(shadow);




        VBox vb4=new VBox(10);
        Image image4=new Image("/Asset/images/5729.jpg");
        ImageView ImageView4=new ImageView(image4);
        vb4.setPadding(new Insets(10));
        vb4.setStyle("-fx-background-color: yelow;");
        vb4.setAlignment(Pos.CENTER);
        ImageView4.setFitWidth(300);
        vb4.setStyle("-fx-border-color: black; -fx-border-width: 0.5px;");
        ImageView4.setFitHeight(300);
        ImageView4.setPreserveRatio(false);
        vb4.getChildren().addAll(ImageView4);

        VBox VB4=new VBox(20);
          VB4.setAlignment(Pos.CENTER_LEFT);
      Text tx6=new Text("Agriculture section");
      tx6.setFont(Font.font("Arial", FontWeight.BOLD, 20));
      Text tx7=new Text("for Description:");
      tx7.setFont(Font.font("Arial", FontWeight.BOLD, 20));
   
       Button styledButton4 = new Button("Explore More");
styledButton4.setStyle("-fx-background-color: #2196F3; -fx-text-fill: white; -fx-font-size: 14px;");
        

       VB4.getChildren().addAll(tx6,tx7,styledButton4);

       HBox hb3=new HBox(40);
        hb3.getChildren().addAll(vb4,VB4);
        hb3.setPadding(new Insets(15));
        hb3.setAlignment(Pos.CENTER_LEFT);
       

        // Styling and Shadow
        hb3.setStyle(
            "-fx-border-color: black;" +
            "-fx-border-width: 2;" +
            "-fx-border-style: solid;" +
            "-fx-border-radius: 8;" +
            "-fx-background-color: white;" +
            "-fx-background-radius: 8;"
        );
        DropShadow shadow3 = new DropShadow();
        shadow3.setRadius(10);
        shadow3.setOffsetX(4);
        shadow3.setOffsetY(4);
        shadow3.setColor(Color.rgb(0, 0, 0, 0.25));
        hb3.setEffect(shadow);


    

        VBox vb5=new VBox(10);
        Image image5=new Image("/Asset/images/basketball-player-dribbling.png");
        ImageView ImageView5=new ImageView(image5);
        vb5.setPadding(new Insets(10));
        vb5.setStyle("-fx-background-color: yelow;");
        vb5.setAlignment(Pos.CENTER);
        ImageView5.setFitWidth(300);
        vb5.setStyle("-fx-border-color: black; -fx-border-width: 0.5px;");
        ImageView5.setFitHeight(300);
        ImageView5.setPreserveRatio(false);

        vb5.getChildren().addAll(ImageView5);

        VBox VB5=new VBox(20);
          VB5.setAlignment(Pos.CENTER_LEFT);
      Text tx8=new Text("Agriculture section");
      tx8.setFont(Font.font("Arial", FontWeight.BOLD, 20));
      Text tx9=new Text("for Description:");
      tx9.setFont(Font.font("Arial", FontWeight.BOLD, 20));
  
       Button styledButton5 = new Button("Explore More");
styledButton5.setStyle("-fx-background-color: #2196F3; -fx-text-fill: white; -fx-font-size: 14px;");
        
       VB5.getChildren().addAll(tx8,tx9,styledButton5);
       
        

        HBox hb4=new HBox(40);
        hb4.getChildren().addAll(vb5,VB5);
        hb4.setPadding(new Insets(15));
        hb4.setAlignment(Pos.CENTER_LEFT);
       

        // Styling and Shadow
        hb4.setStyle(
            "-fx-border-color: black;" +
            "-fx-border-width: 2;" +
            "-fx-border-style: solid;" +
            "-fx-border-radius: 8;" +
            "-fx-background-color: white;" +
            "-fx-background-radius: 8;"
        );
        DropShadow shadow4 = new DropShadow();
        shadow4.setRadius(10);
        shadow4.setOffsetX(4);
        shadow4.setOffsetY(4);
        shadow4.setColor(Color.rgb(0, 0, 0, 0.25));
        hb4.setEffect(shadow);


        VBox vbox=new VBox(20); 
       vbox.setAlignment(Pos.CENTER);//main VBOX
        vbox.getChildren().addAll(hb,hb1,hb2,hb3,hb4);

        VBox VB=new VBox(20);
        VB.getChildren().addAll(V2,vbox);



        
        
        ScrollPane scrollPane=new ScrollPane(VB);

        Scene sc = new Scene(scrollPane, 1200, 900);
        stage.setTitle("Home Page");
        stage.setScene(sc);
        stage.show();
    }
}
    
