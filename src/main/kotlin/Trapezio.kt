class Trapezio(baseMenor:Float, baseMaior:Float,altura:Float):Objeto(altura),Cor,Desenhar {
    val baseMenor:Float
    val baseMaior:Float
    var corBaseMenor="transparente"
    var corBaseMaior="transparente"
    var corAltura="transparente"
    var corInterior="transparente"

    init {
        this.baseMenor=baseMenor
        this.baseMaior=baseMaior
    }

    override fun pintarBase(cor: String) {
        corBaseMenor=cor
        corBaseMaior=cor
    }

    override fun pintarAltura(cor: String) {
        corAltura=cor
    }

    override fun pintarInterior(cor: String) {
        corInterior=cor
    }

    override fun areaOf(): Float {
        return (baseMaior+baseMenor)*altura/2
    }

    override fun desenhar() {
        println("Estou desenhando um trapézio")
    }

}