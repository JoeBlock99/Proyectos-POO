data class Chocolatelate (
        val tipo: String,
        val cals: String
): Paquete() {
    override fun toString(): String{
        return """
            ${tipo}
            ${cals}
        """.trimIndent()
    }

}