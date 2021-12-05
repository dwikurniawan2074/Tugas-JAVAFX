package javafxtask;

import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaFXtask extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setVgap(10);
        
        //Label first name
        Label labelFirst = new Label("First Name ");
        GridPane.setConstraints(labelFirst, 0, 0);
        
        //input first name
        TextField inputFirst = new TextField();
        GridPane.setConstraints(inputFirst, 1, 0);
        
        //label last name
        Label labelLast = new Label("Last Name ");
        GridPane.setConstraints(labelLast, 0, 1);
        
        //input last name
        TextField inputLast = new TextField();
        GridPane.setConstraints(inputLast, 1, 1);
        
        //Label E-mail
        Label labelEmail = new Label("E-mail Address ");
        GridPane.setConstraints(labelEmail, 0, 2);
        
        //input E-mail
        TextField inputEmail = new TextField();
        GridPane.setConstraints(inputEmail, 1, 2);
        
        //Label contact
        Label labelContact = new Label("Contact No ");
        GridPane.setConstraints(labelContact, 0, 3);
        
        //input contact
        TextField inputContact = new TextField();
        GridPane.setConstraints(inputContact, 1, 3);
        
         //Label password
        Label labelPassword = new Label("Contact No ");
        GridPane.setConstraints(labelPassword, 0, 4);
        
        //input password
        TextField inputPassword = new TextField();
        GridPane.setConstraints(inputPassword , 1, 4);
        
         //Label confirm password
        Label labelConfirm = new Label("Confirm Password ");
        GridPane.setConstraints(labelConfirm, 0, 5);
        
        //input confirm password
        TextField inputConfirm = new TextField();
        GridPane.setConstraints(inputConfirm , 1, 5);
        
        
        Button registerButton = new Button("Register");
        registerButton.setStyle("-fx-background-color: Blue");
        registerButton.setTextFill(Color.WHITE);
        GridPane.setConstraints(registerButton, 1, 6);
        
        grid.getChildren().addAll(labelFirst, inputFirst, labelLast, inputLast, registerButton,labelEmail, inputEmail, labelContact, inputContact, labelConfirm, inputConfirm);
        
        Scene scene = new Scene(grid, 400, 250);
        

        primaryStage.setTitle("Register");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
