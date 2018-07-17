import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean Continuar=true;
        List<Nivel> listaNiveles=new ArrayList<>();
        do {
            System.out.println(menu());
            System.out.println("Ingrese el numero de lo que desea hacer del menu.\n");
            Scanner input=new Scanner(System.in);
            int opcion=input.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Nombre de Nivel");
                    input=new Scanner(System.in);
                    String nivel=input.nextLine();
                    listaNiveles.add(new Nivel(nivel));
                    break;
                case 2:
                    System.out.println("Nombre de Nivel\n");
                    input=new Scanner(System.in);
                    nivel=input.nextLine();
                    for(Nivel f:listaNiveles){
                        if(f.getNombre().equals(nivel)){
                            System.out.println("Nombre de grado\n");
                            input=new Scanner(System.in);
                            String grado=input.nextLine();
                            f.agregarGrado(new Grado(grado));
                        } else{
                            System.out.println("No encontre este nivel.\n");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Nombre de Nivel\n");
                    input=new Scanner(System.in);
                    nivel=input.nextLine();
                    for(Nivel f:listaNiveles){
                        if(f.getNombre().equals(nivel)){
                            System.out.println("Nombre de Grado\n");
                            input=new Scanner(System.in);
                            String grado=input.nextLine();

                            List<Grado> gradoList=f.getGrados();
                            for(Grado g: gradoList){
                                if(g.getNombre().equals(grado)){
                                    System.out.println("Ingrese el nombre del estudiante.\n");
                                    input=new Scanner(System.in);
                                    String nombre=input.nextLine();
                                    System.out.println("Ingrese el codigo del estudiante.\n");
                                    input=new Scanner(System.in);
                                    int codigo=input.nextInt();
                                    g.agregarEstudiantes(new Estudiante(nombre,codigo));
                                }else{
                                    System.out.println("No encontre este grado.\n");
                                }
                            }
                        } else{
                            System.out.println("No encontre este nivel.\n");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Nombre de Nivel\n");
                    input=new Scanner(System.in);
                    nivel=input.nextLine();
                    for(Nivel f:listaNiveles) {
                        if (f.getNombre().equals(nivel)) {
                            System.out.println(f.getGrados());
                        }else{
                            System.out.println("No encontre ese nivel.\n");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Ingrese el nivel.\n");
                    input=new Scanner(System.in);
                    nivel=input.nextLine();
                    for(Nivel f:listaNiveles){
                        if (f.getNombre().equals(nivel)) {
                            System.out.println("Ingrese el grado.\n");
                            input=new Scanner(System.in);
                            String grado=input.nextLine();

                            List<Grado> listaDeGrados = f.getGrados();

                            for(Grado g : listaDeGrados){
                                if(g.getNombre().equals(grado)){
                                    System.out.println(g.listaeEstudiantes());

                                }else{
                                    System.out.println("Dato incorrecto.");
                                }
                            }

                        }else{
                            System.out.println("No encontre ese nivel.\n");
                        }

                    }
                    break;

                case 6:
                    Continuar=false;
            }


        }while(Continuar);

    }

    public static String menu(){
        return "Menu:\n"+
                "1. Agregar Nivel\n"+
                "2. Agregar Grado\n"+
                "3. Agregar Estudiante\n"+
                "4. Ver grados en un nivel\n"+
                "5. Ver asignaciones en un grado\n"+
                "6. Salir\n";
    }
}
