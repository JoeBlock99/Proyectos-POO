import java.util.ArrayList;
import java.util.List;
public class Grado {
    //Atributos
    private String nombre;
    private List estudiantes= new ArrayList();
    //Metodos
    public List listaeEstudiantes(){
        return this.estudiantes;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void agregarEstudiantes(Estudiante estudiante){
        this.estudiantes.add(estudiante);
    }
    public Grado(String nombreGrado){
        this.nombre=nombreGrado;
    }
}
