package main.utils

class RadioClass (
        var on: Boolean = false,
        var frecuencia:String="FM",
        var estacion:Double = 87.0,
        var volumen:Int = 30
){
    fun turnON(){
        on = true
    }
    fun turnOF(){
        on = false
    }
    fun mfreq(){
        if(frecuencia == "FM"){
            frecuencia="AM"
        }else{
            frecuencia="FM"
        }
    }
    fun masvol(){
        if(volumen<100){
            volumen+=1
        }

    }
    fun menosvol(){
        if(volumen>0){
            volumen-=1
        }

    }
    fun cambiarestacion(nume: Double){
        if(100.00>nume && nume>87.00){
            estacion=nume
        }

    }
    override fun toString(): String{
        return """
            radio:
            Encendido: $on
            Frecuencia: $frecuencia
            Estacion: $estacion
            Volumen: $volumen
        """.trimIndent()
    }
}