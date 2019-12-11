package appvisoranimales;

/**
 *
 * @author Carlos
 */
public class Animal 
{
    // Atributos
    private String nombre;  // Nombre de animal
    private String imagenMiniatura; // Ruta a la imagen en miniatura del animal
    private String imagenGrande;  // Ruta a la imagen grande del animal.
    
    
    // Constructores ( 3 parametros )  
    public Animal( String nombre, String imagenMiniatura, String imagenGrande )
    {
        this.nombre = nombre;
        this.imagenMiniatura = imagenMiniatura;
        this.imagenGrande = imagenGrande;
    }
    
    // Getter y Setter creados automaticamente por NetBeans como dice enunciado
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagenMiniatura() {
        return imagenMiniatura;
    }

    public void setImagenMiniatura(String imagenMiniatura) {
        this.imagenMiniatura = imagenMiniatura;
    }

    public String getImagenGrande() {
        return imagenGrande;
    }

    public void setImagenGrande(String imagenGrande) {
        this.imagenGrande = imagenGrande;
    }
    
    // Metodo toString
    @Override
    public String toString() {
        return nombre;
    }
      
    
}
