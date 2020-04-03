package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class OnOffClick {
	private String green_w;
	private String red_w;
	
	GetNames names = new GetNames();
	
	red_w = names.getRed();
	green_w = names.getGreen();
	
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="red_score"
    private Label red_score; // Value injected by FXMLLoader

    @FXML // fx:id="green_score"
    private Label green_score; // Value injected by FXMLLoader

    @FXML // fx:id="main_timer_label"
    private Label main_timer_label; // Value injected by FXMLLoader

    @FXML // fx:id="start_stop_button"
    private Button start_stop_button; // Value injected by FXMLLoader

    @FXML // fx:id="period_label"
    private Label period_label; // Value injected by FXMLLoader
    
    @FXML // fx:id="period_label"
    private Label green_label; // Value injected by FXMLLoader

    @FXML // fx:id="period_label"
    private Label red_label; // Value injected by FXMLLoader
    

    @FXML
    void startStopClicked(ActionEvent event) {

    }
    @FXML
    void redOne(ActionEvent event) {
    	red_score.setText("1");
    }
    @FXML
    void redTwo(ActionEvent event) {
    	red_score.setText("2");
    }
    @FXML
    void redFour(ActionEvent event) {
    	red_score.setText("4");
    }
    @FXML
    void greenOne(ActionEvent event) {
    	green_score.setText("1");
    }
    @FXML
    void greenTwo(ActionEvent event) {
    	green_score.setText("2");
    }
    @FXML
    void greenFour(ActionEvent event) {
    	green_score.setText("4");
    }
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert red_score != null : "fx:id=\"red_score\" was not injected: check your FXML file 'GUI.fxml'.";
        assert green_score != null : "fx:id=\"green_score\" was not injected: check your FXML file 'GUI.fxml'.";
        assert main_timer_label != null : "fx:id=\"main_timer_label\" was not injected: check your FXML file 'GUI.fxml'.";
        assert start_stop_button != null : "fx:id=\"start_stop_button\" was not injected: check your FXML file 'GUI.fxml'.";
        assert period_label != null : "fx:id=\"period_label\" was not injected: check your FXML file 'GUI.fxml'.";

        red_label.setText();
    }
}

/*
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class OnOffClick {

    @FXML
    private Button start_stop_button;

    @FXML
    private Label main_timer_label;

    Scanner scan = new Scanner(System.in);
    double tlen = scan.nextDouble()*60;
    String it;
    
	Timer t1 = new Timer();
	
	boolean tf = true;
    @FXML
    void startStopClicked(ActionEvent event) {
    	do {
    	t1.startTimer(tlen);
    	t1.stopTimer(1000);
    	it = " " +tlen;
    	main_timer_label.setText(it);
    	}while(tlen>0);
    }

}
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class OnOffClick implements Initializable{

    @FXML private Label main_timer_label;
    @FXML private Button start_stop_button;
    
    public int period = 1;
    
    @FXML public void startStopClicked() {
    	
    	Match bout = new CollegeMatch();
    	Timer t1 = new Timer(bout.period1());
    	//Timer t2 = new Timer(bout.period2());
    	//Timer t3 = new Timer(bout.period3());
    	
    	if(period == 1)
    		t1.startTimer(true);
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	main_timer_label.setText("02:00");
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}*/