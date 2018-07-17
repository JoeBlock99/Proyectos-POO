public class Estudiante  {
    //Atributo
    private String nombre;
    private int codigo;
    //Metodo
    public String getNombre(){
        return this.nombre;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public Estudiante(String estudiante){
        this.nombre=estudiante;
    }

}
