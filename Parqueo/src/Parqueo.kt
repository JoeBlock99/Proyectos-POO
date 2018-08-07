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
}