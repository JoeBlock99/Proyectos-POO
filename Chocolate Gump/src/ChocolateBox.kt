import java.util.*

class ChocolateBox<Chocolatelate>(
        private var chocolates: ArrayList<Chocolatelate>
) {
    fun  randomChoc():Chocolatelate?{
        if (chocolates.size > 0){
            val randomCh = Random().nextInt((chocolates.size-1))
            return chocolates.removeAt(randomCh)
        }
        return null
    }
}