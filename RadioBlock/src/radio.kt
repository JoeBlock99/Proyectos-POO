package main
import main.utils.*

fun main(args: Array<String>){
    val joesradio= RadioClass()
    println("$joesradio")

    var opnum: String="11"
    while(opnum!="12"){
        if(joesradio.on){
            println("""

        1. Apagar
        2. Cabiar Frecuencia
        3. Cambiar Estación

        12.Salir
    """.trimIndent())
            opnum= readLine()!!
            if(opnum=="1"){
                joesradio.turnOF()
            } else if(opnum=="2"){
                joesradio.mfreq()
            }
        } else {
            println("""

            1.Encender
        """.trimIndent())
            opnum = readLine()!!
            if(opnum=="1"){
                joesradio.turnON()
            }
            if(opnum=="3"){
                joesradio.cambiarestacion()
                println("""
                    Ingrese el numero de estacion al que desea ir.
                """.trimIndent())
            }
        }

        println("$joesradio")

    }

}