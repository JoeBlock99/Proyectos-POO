public class Robot {
    //Atributo
    private int x;
    private int y;
    private int points;
    private String face;
    //Metodos
    public Robot(int x,int y, String d){
        this.face= d;
        this.x=x;
        this.y=y;
        this.points= 0;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }
    public String getFace(){
        return this.face;
    }

    public int getPoints(){
        return this.points;
    }

    public void move(){
        if (this.face.equals("^")){
            this.y -= 1;
        } else if (this.face.equals("v")){
            this.y += 1;
        } else if (this.face.equals("<")){
            this.x -= 1;
        } else if (this.face.equals(">")){
            this.x += 1;
        }
    }
    public void pick(){
        this.points += 1;
    }

    public void turnleft(){
        if (this.face.equals("^")){
            this.face = "<";
        } else if (this.face.equals("v")){
            this.face = ">";
        } else if (this.face.equals("<")){
            this.face = "v";
        } else if (this.face.equals(">")){
            this.face = "^";
        }
    }
}
