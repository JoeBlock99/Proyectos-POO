fun main(args: Array<String>) {
    var parqueo= Parqueo()
    var continuar= true
    do {
        println("""
        Menu:
        1. Eres Administrador
        2. Eres Usuario
        3.salir
    """.trimIndent())
        var opcion1 = readLine()!!
        if (opcion1== "1"){
            var continuar1= true
            do{
                println("""
                    1. Crear Nivel
                    2. Eliminar Nivel
                    3. Ver todos los niveles
                    4. Salir
                """.trimIndent())
                var opcion2 = readLine()!!
                if (opcion2=="1"){
                    println("Ingrese el nombre del texto.")
                    var text = readLine()!!
                    parqueo.readfile(text)
                    println()
                }else if (opcion2=="2"){
                    //todo
                }else if (opcion2=="3"){
                    //todo
                }else if (opcion2=="4"){
                    continuar1= false
                }

            }while (continuar1)
        } else if (opcion1 == "2") {
            //todo
        } else if (opcion1 == "3") {
            continuar= false
        }else{
            println("""
        Error

        """.trimIndent())
        }
    } while (continuar)

}