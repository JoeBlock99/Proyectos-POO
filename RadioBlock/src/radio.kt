package main
import main.utils.*

fun main(args: Array<String>){
    val joesradio= RadioClass()
    println("$joesradio")

    var opnum: String="11"
    while(opnum!="6"){
        if(joesradio.on){
            println("""

        1. Apagar
        2. Cambiar Frecuencia
        3. Cambiar Estación
        4. Subir Volumen
        5. Bajar Volumen
        6.Salir
    """.trimIndent())
            opnum= readLine()!!
            if(opnum=="1"){
                joesradio.turnOF()
            } else if(opnum=="2"){
                joesradio.mfreq()
            } else if(opnum=="3"){
                println("""
                    Ingrese el numero de estacion al que desea ir.
                """.trimIndent())
                var numeIngresoStr = readLine()!!
                var numeIngreso = numeIngresoStr.toDouble()
                joesradio.cambiarestacion(numeIngreso)
            }else if(opnum =="4"){
                joesradio.masvol()
            }else if(opnum == "5"){
                joesradio.menosvol()
            }
        } else {
            println("""

            1.Encender
        """.trimIndent())
            opnum = readLine()!!
            if(opnum=="1"){
                joesradio.turnON()
            }
        }

        println("$joesradio")

    }

}