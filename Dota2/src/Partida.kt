class Partida <T>(val narrador: T, var radiantEquipo: Equipo?, var direEquipo: Equipo?,
                  var destroyedRad: Int, var deathsByDire: Int, var Winner: Int) where T: Narrador {
    //Who won (0 for radiant, 1 for dire){
    fun arrayHeroes(): ArrayList<Heroe> {
        val slark = Heroe("Slark","Agility")
        val medusa = Heroe("Medusa", "Agility")
        val troll_warlord = Heroe("Troll Warlord", "Agility")
        val centaur = Heroe("Centaur Warrunner", "Strength")
        val magnataur = Heroe("Magnus", "Stregth")
        val shredder = Heroe("Timbersaw", "Strength")
        val bristleback = Heroe("Bristleback","Strength")
        val tusk = Heroe("Tusk","Strength")
        val skywrath_mage = Heroe("Skywrath Mage", "Intelligence")
        val abaddon = Heroe("Abaddon","Strength")
        val elder_titan = Heroe("Elder Titan","Strength")
        val legion_commander = Heroe("Legion Commander","Strength")
        val ember_spirit = Heroe("Ember Spirit","Agility")
        val earth_spirit = Heroe("Earth Spirit","Strength")
        val abyssal_underlord = Heroe("Abyssal Underlord", "Strength")
        val terrorblade = Heroe("Terrorblade", "Agility")
        val phoenix = Heroe("Phoenix", "Strength")
        val techies = Heroe("Techies","Intelligence")
        val oracle = Heroe("Oracle", "Intelligence")
        val winter_wyvern = Heroe("Winter Wyvern", "Intelligence")
        val arc_warden = Heroe("Arc Warden","Agility")
        val returnHeroe = arrayListOf<Heroe>(
                slark,medusa,troll_warlord, centaur, magnataur, shredder,bristleback,tusk,skywrath_mage, abaddon,elder_titan,legion_commander,ember_spirit,earth_spirit,abyssal_underlord,terrorblade,phoenix,techies,oracle,winter_wyvern,arc_warden
        )
        return returnHeroe
}
    fun hi(): String{
        return narrar(narrador, "Welcome Compa")
    }
    fun inicio(): String{
        return narrar(narrador, "This game just started")
    }
    fun death(isRadiant: Boolean): String{
        if(isRadiant){
            this.direEquipo!!.heroes.removeAt(0)
            this.destroyedRad += 1
        }else{
            this.radiantEquipo!!.heroes.removeAt(0)
            this.deathsByDire += 1
        }
        return narrar(narrador,"A kill just happened")
    }
    fun moreDeaths(isRadiant: Boolean,numDeath: Int): String{
        if(isRadiant){
            for(i in 0..(numDeath-1)){
                this.direEquipo!!.heroes.removeAt(0)
            }
            this.destroyedRad += numDeath
        }else{
            for(i in 0..(numDeath-1)){
                this.radiantEquipo!!.heroes.removeAt(0)
            }
            this.deathsByDire += numDeath
        }
        if (numDeath == 5){
            return narrar(narrador,"Five downs just occurred")
        }
        return narrar(narrador,"Numerous deaths happened")
    }
    fun towerDestroyed(isRadiant: Boolean): String{
        if(isRadiant){
            this.direEquipo!!.towers.removeAt(0)
            this.destroyedRad += 1
        }else{
            this.radiantEquipo!!.towers.removeAt(0)
            this.deathsByDire += 1
        }
        return narrar(narrador, "Tower has been destroyed")
    }
    fun ancientKilled(isRadiant: Boolean): String{
        if (isRadiant){
            this.direEquipo!!.ancient.destroyed = true
            this.destroyedRad += 1
            this.Winner = 0
            return narrar(narrador," We have a winner, Radiant")
        }
    }
}

