package appvisoranimales;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class CeldaImagenTexto extends ListCell<Animal>{
    private VBox v;
    private ImageView i;
    private Label l;
    
    public CeldaImagenTexto(){
        v= new VBox();
//        los hijos de VBox estaran alineados
        v.setAlignment(Pos.CENTER);
//        instanciamos los elementos del vbox
        i= new ImageView();
        l= new Label();
//        preserva su relacion de especto
        i.preserveRatioProperty().set(true);
//        100punto de altura 
        i.setFitHeight(100);
        
//        añadimos los elementos al vbox
        v.getChildren().add(i);
        v.getChildren().add(l);
//        configuramos el label
        l.wrapTextProperty();
//        añadimos un predefinido ancho al vbox
        v.setPrefWidth(USE_PREF_SIZE);
    }
//    sobreescritura del metodo updateitem
    @Override
    protected void updateItem(Animal item, boolean empty){
        super.updateItem(item, empty);
        if(item!=null){
            l.setText(item.getNombre());
            i.setImage(new Image(item.getImagenMiniatura()));
            setGraphic(v);
        }
    }
}
