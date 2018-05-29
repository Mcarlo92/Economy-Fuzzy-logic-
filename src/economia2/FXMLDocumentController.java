/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package economia2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import java.util.*;
import javafx.beans.value.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import javafx.collections.FXCollections;
import javafx.event.EventHandler;

public class FXMLDocumentController implements Initializable {
    
    List<String> gUtente = new ArrayList<>(Arrays.asList("pessimo","pessimo",
                    "pessimo","pessimo","pessimo"));
  // LABEL
    @FXML
       Label pesoLbl = new Label("Peso");
    @FXML
      Label prezzoLbl= new Label("Prezzo");
    @FXML
      Label specificheTecnicheLbl = new Label("Specifiche Tecniche");
    @FXML
      Label esteticaLbl= new Label("Estetica");
    @FXML
      Label comfortLbl = new Label("Comfort");
    @FXML
      Label risultatoFinaleLbl = new Label();
    
       
     // COMBOBOX
      @FXML
       ComboBox<String> pesoCB = new ComboBox<>();
      @FXML
       ComboBox<String> prezzoCB = new ComboBox<>();
      @FXML
       ComboBox<String> specificheCB = new ComboBox<>();
      @FXML
       ComboBox<String> esteticaCB = new ComboBox<>();
      @FXML
       ComboBox<String> comfortCB = new ComboBox<>();
      @FXML
        Button button = new Button();
      @FXML
       Button azzera = new Button();
      private Label risultatoLbl;

    public FXMLDocumentController() {
        this.risultatoLbl = new Label();
    }
      
        @FXML
        public void clickedButton(){


            risultatoFinaleLbl.setText(Valutazione.getValutazionePercentuale(gUtente));

        }
        public void azzeralo(){


            risultatoFinaleLbl.setText("");

        }
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {



         




        // Attivo gli eventi delle COMBOBOX
        //PESO
         pesoCB.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>(){
            
            public void changed(ObservableValue<? extends String> ov,final String oldValue,final
                    String newValue){
                //selPrezzo.setText("Hai scelto:" + newValue);
                gUtente.set(0,newValue);
            }
        });
         // PREZZO
         prezzoCB.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>(){
            
            public void changed(ObservableValue<? extends String> ov,final String oldValue,final
                    String newValue){
                //selPrezzo.setText("Hai scelto:" + newValue);
                gUtente.set(1,newValue);
            }
        });
         // SPECIFICHE TECNICHE
        specificheCB.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>(){
            
            public void changed(ObservableValue<? extends String> ov,final String oldValue,final
                    String newValue){
                //selSpecificheTecniche.setText("Hai scelto:" + newValue);
                gUtente.set(2,newValue);
            }
        });
        //ESTETICA
        esteticaCB.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>(){
            
            public void changed(ObservableValue<? extends String> ov,final String oldValue,final
                    String newValue){
                //selEstetica.setText("Hai scelto:" + newValue);
                gUtente.set(3,newValue);
              
            }
        });
        //COMFORT
        comfortCB.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>(){
            
            public void changed(ObservableValue<? extends String> ov,final String oldValue,final
                    String newValue){
                //sselPeso.setText("Hai scelto:" + newValue);
                gUtente.set(4,newValue);
            }
        });
        
        
        
        
         
         
          
      
    }    

    /**
     * @return the risultatoLbl
     */
    public Label getRisultatoLbl() {
        return risultatoLbl;
    }

    /**
     * @param risultatoLbl the risultatoLbl to set
     */
    public void setRisultatoLbl(Label risultatoLbl) {
        this.risultatoLbl = risultatoLbl;
    }
    
}
