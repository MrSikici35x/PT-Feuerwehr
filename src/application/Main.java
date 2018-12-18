package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane rootLayout = new BorderPane();
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("View.fxml"));
	        rootLayout.setCenter(loader.load()); 
	        Controller controller =  loader.getController();
	        
	        Model model = new Model();
	        controller.initModel(model);
	        loader.setController(controller);
	        
			Scene scene = new Scene(rootLayout);
			scene.getStylesheets().add(getClass().getResource("View.css").toExternalForm());
			
			primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("ProgrammIcon.png")));
			primaryStage.setTitle("kleinster möglicher Kreis");
			primaryStage.setScene(scene);
			primaryStage.setMaximized(true);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
