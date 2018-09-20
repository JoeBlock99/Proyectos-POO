
class Rectangulo {
    var alto:Int= 0
    var lado:Int= 0
    fun Rectangulo(alto:Int, lado:Int){
        var finaldraw = ""
        for(i in 1..alto){
            finaldraw += "* ".repeat(lado)
            finaldraw += "/n"
        }
        return finaldraw
    }

}