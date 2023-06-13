abstract class Objeto(altura:Float) {
    val altura:Float

    init {
        this.altura=altura
    }

    abstract fun areaOf():Float

}