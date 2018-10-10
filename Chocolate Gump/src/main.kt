
fun main(args: Array<String>) {
    val run = forrestGump()
    val box = ChocolateBox<Chocolatelate>(arrayListOf<Chocolatelate>(
            Chocolatelate("Chocolate Blanco.","con 150 calorias\n"),
            Chocolatelate("Chocolate con Menta","con 80 calorias\n"),
            Chocolatelate("Chocolate con Caramelo","con 120 calorias\n"),
            Chocolatelate("Chocolate Negro","con 70 calorias\n"),
            Chocolatelate("Chocolate con Leche","con 90 calorias\n"),
            Chocolatelate("Chocolate con Almendras","con 100 calorias\n"),
            Chocolatelate("Chocolate con Cafe","con 160 calorias\n"),
            Chocolatelate("Chocolate con Avellanas","con 100 calorias\n"),
            Chocolatelate("Chocolate con Licor","con 200 calorias\n")

    ))
    println("Agarrando un chocolate...")
    run.pickChocolate(box.randomChoc())
    println("Forrest tiene ${run.cajaChocolates}")

    run.pickChocolate(box.randomChoc())
    println("Ahora Forrest tiene ${run.cajaChocolates}")

    run.pickChocolate(box.randomChoc())
    println("Ahora Forrest tiene ${run.cajaChocolates}")

    run.pickChocolate(box.randomChoc())
    println("Ahora Forrest tiene ${run.cajaChocolates}")

    run.pickChocolate(box.randomChoc())
    println("Ahora Forrest tiene ${run.cajaChocolates}")


}