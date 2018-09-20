
class Cuadrado {
    var lado:Int= 0
    fun Dibujo (lado:Int):String{
        var finaldraw = ""
        for(i in 1..lado){
            finaldraw += "* ".repeat(lado)
            finaldraw += "\n"
        }
        return finaldraw
    }
}