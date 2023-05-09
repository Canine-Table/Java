package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/** @author Table **/
@SuppressWarnings("unused")
public class Controller implements Initializable
	{

	@FXML
	TreeView<String> myTreeView;
	@FXML
	Label myLabel;
	
	public void mouseClicked()
		{
		TreeItem<String> item = myTreeView.getSelectionModel().getSelectedItem();

		}
	
	public void contextMenuRequested()
		{

		}

	@SuppressWarnings("unchecked")
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
		{
			TreeItem<String> tableItem = new TreeItem<>("Table", new ImageView(new Image("https://icons.iconarchive.com/icons/hopstarter/soft-scraps/16/Folder-Generic-Green-icon.png")));
			TreeItem<String> pictureItem = new TreeItem<>("Pictures", new ImageView(new Image("https://icons.iconarchive.com/icons/hopstarter/soft-scraps/16/Folder-Generic-Green-icon.png")));
				TreeItem<String> picture0Item = new TreeItem<>("Picture Files", new ImageView(new Image("https://icons.iconarchive.com/icons/hopstarter/soft-scraps/16/Folder-Generic-Green-icon.png")));
				TreeItem<String> picture1Item = new TreeItem<>("Picture Files", new ImageView(new Image("https://icons.iconarchive.com/icons/hopstarter/soft-scraps/16/Folder-Generic-Green-icon.png")));
				TreeItem<String> picture2Item = new TreeItem<>("Picture Files", new ImageView(new Image("https://icons.iconarchive.com/icons/hopstarter/soft-scraps/16/Folder-Generic-Green-icon.png")));
				TreeItem<String> picture3Item = new TreeItem<>("Picture Files", new ImageView(new Image("https://icons.iconarchive.com/icons/hopstarter/soft-scraps/16/Folder-Generic-Green-icon.png")));
				TreeItem<String> picture4Item = new TreeItem<>("Picture Files", new ImageView(new Image("https://icons.iconarchive.com/icons/hopstarter/soft-scraps/16/Folder-Generic-Green-icon.png")));
				TreeItem<String> picture5Item = new TreeItem<>("Picture Files", new ImageView(new Image("https://icons.iconarchive.com/icons/hopstarter/soft-scraps/16/Folder-Generic-Green-icon.png")));
				pictureItem.getChildren().addAll(picture0Item,picture1Item,picture2Item,picture3Item,picture4Item,picture5Item);
			TreeItem<String> videoItem = new TreeItem<>("Videos", new ImageView(new Image("https://icons.iconarchive.com/icons/hopstarter/soft-scraps/16/Folder-Generic-Green-icon.png")));
				TreeItem<String> video2Item = new TreeItem<>("Video Files", new ImageView(new Image("https://icons.iconarchive.com/icons/hopstarter/soft-scraps/16/Folder-Generic-Green-icon.png")));
					videoItem.getChildren().add(video2Item);
			TreeItem<String> musicItem = new TreeItem<>("Music", new ImageView(new Image("https://icons.iconarchive.com/icons/hopstarter/soft-scraps/16/Folder-Generic-Green-icon.png")));
			TreeItem<String> documentItem = new TreeItem<>("Documents", new ImageView(new Image("https://icons.iconarchive.com/icons/hopstarter/soft-scraps/16/Folder-Generic-Green-icon.png")));
				TreeItem<String> document2Item = new TreeItem<>("Document Files", new ImageView(new Image("https://icons.iconarchive.com/icons/hopstarter/soft-scraps/16/Folder-Generic-Green-icon.png")));
				documentItem.getChildren().add(document2Item);
			TreeItem<String> downloadItem = new TreeItem<>("Downloads", new ImageView(new Image("https://icons.iconarchive.com/icons/hopstarter/soft-scraps/16/Folder-Generic-Green-icon.png")));
			TreeItem<String> objectItem = new TreeItem<>("3D Objects", new ImageView(new Image("https://icons.iconarchive.com/icons/hopstarter/soft-scraps/16/Folder-Generic-Green-icon.png")));
			myTreeView.setShowRoot(false);
			tableItem.getChildren().addAll(pictureItem,videoItem,musicItem,documentItem,objectItem,downloadItem);
			
			myTreeView.setRoot(tableItem);
			
		}		
	}