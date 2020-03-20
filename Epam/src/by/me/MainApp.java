package by.me;

import java.io.IOException;
import java.io.InputStream;

import by.me.view.GameWindowController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application{
	
	Stage primaryStage;
	BorderPane rootLayout;

	public static void main(String[] args) {
		
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		
		initLayout();
		showGameWindow();
		
	}
	
	public void initLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
			rootLayout = loader.load();
			
			Scene scene = new Scene(rootLayout);
			this.primaryStage.setScene(scene);
			this.primaryStage.show();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void showGameWindow() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/GameWindow.fxml"));
			AnchorPane pane = loader.load();
			this.rootLayout.setCenter(pane);
			
			GameWindowController controller = loader.getController();
			
			InputStream cowImage = MainApp.class.getResourceAsStream("view/icons/cow48.png");
	        InputStream bullImage = MainApp.class.getResourceAsStream("view/icons/bull.png");
	        InputStream gameImage = MainApp.class.getResourceAsStream("view/icons/BC.png");
	        controller.setBullIcon(new Image(bullImage));
	        controller.setCowIcon(new Image(cowImage));
	        controller.setGameIcon(new Image(gameImage));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
