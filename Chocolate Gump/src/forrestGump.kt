class forrestGump {
    var cajaChocolates: ArrayList<Chocolatelate> = ArrayList()
    fun pickChocolate(chocolate:Chocolatelate?){
        if (chocolate!= null){
            cajaChocolates.add(chocolate)
        }
    }
}