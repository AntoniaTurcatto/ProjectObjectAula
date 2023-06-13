class Triangulo(base:Float,altura:Float):Objeto(altura), Cor,Desenhar {
    var base:Float
    var corBase="transparente"
    var corAltura="transparente"
    var corInterior="transparente"

    init {
        this.base=base
    }
    override fun areaOf():Float {
        return base*altura/2
    }

    override fun pintarInterior(cor: String) {
        corInterior=cor
    }

    override fun pintarBase(cor: String) {
        corBase=cor
    }

    override fun pintarAltura(cor: String) {
        corAltura=cor
    }

    override fun desenhar() {
        println("Estou desenhando um triângulo")
    }
}