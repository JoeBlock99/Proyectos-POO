import java.util.ArrayList;
import java.util.List;

public class Map {
    //Atributos
    private List<String> map;
    private int length;
    private int width;
    private Robot robot;
    private List<Points> points;
    private List<List> walls = new ArrayList<>();


    //Metodos
    public Map(List<List> mapaArray) {
        for (int l =0; l<mapaArray.size();l++){
            for (int e =0; e<mapaArray.get(l).size(); e++){
                if (mapaArray.get(l).get(e)=="^"){
                    this.robot = new Robot(e,l,"^");
                }else if (mapaArray.get(l).get(e)=="<"){
                    this.robot = new Robot(e,l,"<");
                }else if (mapaArray.get(l).get(e)==">"){
                    this.robot = new Robot(e,l,">");
                }else if (mapaArray.get(l).get(e)=="v"){
                    this.robot = new Robot(e,l,"v");
                }else if (mapaArray.get(l).get(e)=="*"){
                    List<Integer> wall= new ArrayList<>();
                    wall.add(e, l);
                    walls.add(wall);
                }else if (mapaArray.get(l).get(e)==" "){
                    System.out.print("");
                }else{

                }
            }
        }
    }

    public boolean hayFichas(){
        /*if (this.map[this.robot.getX()][this.robot.getY()]>0){

        }*/
        return true;
    }
}
