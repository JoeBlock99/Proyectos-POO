public class Points {
    //Atributos
    private int x;
    private int y;
    private int value;
    //Metodos
    public Points(int x,int y,int value){
        this.x=x;
        this.y=y;
        this.value=value;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int value){
        this.value = value;
    }

    @Override
    public String toString(){
        return this.x+","+ this.y+":"+ this.value;
    }
}

