import java.util.ArrayList;
import java.util.List;

public class Nivel {
    //Atributos
    private String nombre;
    private List<Grado> gradoList = new ArrayList();

    //Metodos
    public Nivel(String nombreNivel){
        this.nombre=nombreNivel;
    }

    public String getNombre(){
        return this.nombre;
    }
    public List getGrados(){
        return this.gradoList;
    }
    public void agregarGrado(Grado grado){
        this.gradoList.add(grado);
    }
}
