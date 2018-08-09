import java.io.File

class Parqueo(
        val niveles: MutableList<Nivel> = mutableListOf()
){
    fun crearNivel(nombre:String ,identificador:Int , color:String, ubicacionArchivo:String){
        this.niveles.add(Nivel( nombre,identificador,color,ubicacionArchivo))
    }
    fun eliminarNivel(identificador:Int){
        for (identificador in niveles){
            identificador
        }
    }
    fun verNiveles(): String{
        var nivelesSTR = ""
        for (nivel in niveles) {
            nivelesSTR += nivel
        }

        return nivelesSTR
    }
    fun findCarro(){

    }

    fun readfile(ubicacionFile: String){
        var file= File("/Users/block/Desktop/Jose Block/Radio/Parqueo/Niveles/"+ubicacionFile)
        var listaParedes: MutableList<Pared> = mutableListOf()
        var listaVacios: MutableList<Vacios> = mutableListOf()
        var listaEstacionamientos: MutableList<Estacionamiento> = mutableListOf()
        var line=0
        file.forEachLine {
            var e=0
            for (i in it) {
                if (i.toString() == "*") {
                    listaParedes.add(Pared(e,line))
                }else if (i.toString() == " "){
                    listaVacios.add(Vacios(e,line))
                }else{
                    listaEstacionamientos.add(Estacionamiento(e,line))
                }
                e+=1
            }
            line+=1
        }

        println(listaParedes)
    }
}