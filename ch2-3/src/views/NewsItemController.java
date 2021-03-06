package views;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class NewsItemController {
	@FXML
	private Label lblTitle;
	@FXML
	private Label lblDesc;
	
	private String url;
	
	public void setData(String title, String desc, String url){
		lblTitle.setText(title);
		lblDesc.setText(desc);
		this.url = url;
	}
	
	public void openBrowser() {
		try {
			Desktop.getDesktop().browse(new URI(url));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("브라우저 오픈중 오류 발생");
		}
	}
}
