class Equipo(var heroes: ArrayList<Heroe> ) {
    val ancient: Ancient = Ancient()
    val towers: ArrayList<Tower> = ArrayList()
    init {
        val tower = Tower(false)
        for (i in 1..6){
            towers.add(tower)
        }
    }
}