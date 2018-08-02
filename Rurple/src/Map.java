import java.util.ArrayList;
import java.util.List;

public class Map {
    //Atributos
    private List<List> map = new ArrayList<>();
    private int length;
    private int width;
    private Robot robot;
    private List<Points> points = new ArrayList<>();
    private List<List> walls = new ArrayList<>();


    //Metodos
    public Map(List<List> mapaArray) {
        for (int l =0; l<mapaArray.size();l++){
            List<String> linea= new ArrayList<>();
            for (int e =0; e<mapaArray.get(l).size(); e++){
                linea.add(mapaArray.get(l).get(e).toString());
                //System.out.println(mapaArray.get(l).get(e).toString());
                switch (mapaArray.get(l).get(e).toString()) {
                    case "^":
                        this.robot = new Robot(e, l, "^");
                        break;
                    case "<":
                        this.robot = new Robot(e, l, "<");
                        break;
                    case ">":
                        this.robot = new Robot(e, l, ">");
                        break;
                    case "v":
                        this.robot = new Robot(e, l, "v");
                        break;
                    case "*":
                        List<Integer> wall = new ArrayList<>();
                        wall.add(e);
                        wall.add(l);
                        walls.add(wall);
                        break;
                    case " ":
                        System.out.print("");
                        break;
                    default:
                        int valor = Integer.parseInt(mapaArray.get(l).get(e).toString());
                        Points losPuntos = new Points(e, l, valor);
                        this.points.add(losPuntos);
                        break;
                }
            }
            this.map.add(linea);
        }
    }

    public boolean hayFichas(){
        /*if (this.map[this.robot.getX()][this.robot.getY()]>0){

        }*/
        return true;
    }
    @Override
    public String toString(){
        String soyElMapa = "";
        for (int l =0; l<this.map.size();l++){
            for (int e =0; e<this.map.get(l).size(); e++){
                soyElMapa += this.map.get(l).get(e);
            }
            soyElMapa += "\n";
        }

        return soyElMapa;
    }
}
