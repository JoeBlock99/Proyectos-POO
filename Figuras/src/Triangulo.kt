
class Triangulo {
    var altura:Int =0
    fun Triangulo(altura:Int){
        var finaldraw = ""
        for(i in 1..altura){
            finaldraw += " ".repeat(altura-i)
            finaldraw += "* ".repeat(i)
            finaldraw += "\n"
        }
    }
}