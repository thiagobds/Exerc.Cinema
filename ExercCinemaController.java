/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerccinema;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author IFNMG
 */
public class ExercCinemaController implements Initializable {
    
    private Label label;
    @FXML
    private RadioButton BoxTitanic;
    @FXML
    private ToggleGroup Type2;
    @FXML
    private RadioButton BoxJumanji;
    @FXML
    private RadioButton BoxNenhum;
    @FXML
    private TextArea TextOpiniao;
    @FXML
    private Label LabelRespostas;
    @FXML
    private CheckBox CheckAcao;
    @FXML
    private CheckBox CheckTerror;
    @FXML
    private CheckBox CheckRomance;
    @FXML
    private CheckBox CheckComedia;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ButtonPegarRespostas(ActionEvent event) {
       String a = "";
        
        if(CheckAcao.isSelected()){
            a += "\n" + CheckAcao.getText();
        }
        
        if(CheckTerror.isSelected()){
            a += "\n" + CheckTerror.getText();
        }
        
        if(CheckRomance.isSelected()){
            a += "\n" + CheckRomance.getText();
        }
        
        if(CheckComedia.isSelected()){
            a += "\n" + CheckComedia.getText();
        }
        
        if(BoxJumanji.isSelected()){
            a += "\n" + BoxJumanji.getText();
        }
        
        if(BoxTitanic.isSelected()){
            a += "\n" + BoxTitanic.getText();
        }
        
        if(BoxNenhum.isSelected()){
            a += "\n" + BoxNenhum.getText();
        }
        
        a += "\n" + TextOpiniao.getText();
        
        LabelRespostas.setText("Resposta:"+a);
    }
    
}
