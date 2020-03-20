package by.me.view;

import by.me.model.PlayerStatistics;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GameWindowController {

	@FXML
	private ImageView gameIcon;
	
	@FXML
	private ImageView cowIcon;
	
	@FXML
	private ImageView bullIcon;
	
	@FXML 
	private TextField numberInput;
	
	@FXML
	private TableView<PlayerStatistics> statisticsTable;


	public void setGameIcon(Image gameIcon) {
		this.gameIcon.setImage(gameIcon);
	}


	public void setCowIcon(Image cowIcon) {
		this.cowIcon.setImage(cowIcon);
	}


	public void setBullIcon(Image bullIcon) {
		this.bullIcon.setImage(bullIcon);
	}
	
}
