package appvisoranimales;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Carlos
 */
public class VisorAnimalesController implements Initializable 
{
    @FXML
    private ListView<Animal> listView;
    @FXML
    private ImageView imageView;
    // Variable de instancia Animal de tipo ObservableList<?>
    ObservableList<Animal> animales = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // Instancia Animal ( 3 parametros ) definido constructor
        Animal perro = new Animal ("Perro", "appvisoranimales/perros.png", "appvisoranimales/perros.png");
        Animal gato = new Animal ("Gato", "appvisoranimales/gatos.jpg", "appvisoranimales/gatos.jpg");
        Animal pajaro = new Animal ("Pájaro", "appvisoranimales/pajaro.jpg", "appvisoranimales/pajaro.jpg");

        // añade a coleccion cada animal
        // vincula el ListView al ObservableList. 
        // De forma predeterminada, ListView muestra la representación de cada String de animal.
        animales.add(perro);
        animales.add(gato);
        animales.add(pajaro);
        
        // Escucha de los cambios de selección de ListView
        // Sincroniza animal seleccionado con la imagen
        listView.setItems(animales);
        
        // Resgitra listener para responder al cambio de seleccion de animal propiedad --> ( selectedItem. )
        // El metodo listView devuelve un objeto MultipleSelectionModel.
        // El metodo selectedItemProperty devuelve una lectura de animales de viejo a nuevo valor
        listView.getSelectionModel().selectedItemProperty().addListener(
        (ObservableValue<? extends Animal> ov, Animal old_val, 
            Animal new_val) -> {
        Image imagen = new Image(new_val.getImagenGrande());
        imageView.setImage(imagen);
            });
    }   // Fin de initialize 
}  // Fin de Clase
