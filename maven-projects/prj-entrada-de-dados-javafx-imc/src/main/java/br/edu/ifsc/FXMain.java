package br.edu.ifsc;

import br.edu.ifsc.utils.Utils;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 *
 * @author mpisc
 */
public class FXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(
                    getClass().getResource("/view/FXMLCalculoIMC.fxml"));
            
            Scene scene = new Scene(root, 379, 250);
            
            //primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("../icons/IFSC_logo_vertical.png")));
            primaryStage.getIcons().add(Utils.APPLICATION_ICON);
            primaryStage.setTitle("Calculadora de IMC - IFSC");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException ex) {
            System.out.println("Não foi possível iniciar a aplicação");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
