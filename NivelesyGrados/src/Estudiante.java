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
    public Estudiante(String estudiante, int codigo){
        this.nombre=estudiante;
        this.codigo=codigo;
    }

}
