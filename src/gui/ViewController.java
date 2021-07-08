package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

/***
 * 
 * @author dionatan
 *
 */

public class ViewController {
	
	@FXML
	private Button btTest;
	
	public void onBtTestAction() {
		System.out.println("Click");
	}
}
