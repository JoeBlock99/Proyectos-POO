public class Robot {
    //Atributo
    private int x;
    private int y;
    private int points;
    private String face;
    //Metodos
    public void move(int x, int y){
        if (this.face == "^"){
            y =+ 1;
        } else if (this.face == "v"){
            y =- 1;
        } else if (this.face == "<"){
            x =- 1;
        } else if (this.face == ">"){
            x =+ 1;
        }

    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void pick(){

    }
    public void Robot(){

    }
    public void turnleft(){

    }
}
