fun main() {
    val tri1=Triangulo(3f,4f)
    val trape=Trapezio(4f,6.5f,4f)
    println(tri1.areaOf())
    println(trape.areaOf())

    tri1.desenhar()
    tri1.pintarInterior("lilás")
    tri1.pintarAltura("vermelho")
    tri1.pintarBase("laranja")
    println(tri1.corAltura)
    println(tri1.corBase)
    println(tri1.corInterior)

    trape.desenhar()
    trape.pintarInterior("roxo")
    trape.pintarAltura("amarelo")
    trape.pintarBase("preto")
    println(trape.corAltura)
    println(trape.corBaseMenor)
    println(trape.corBaseMaior)
    println(trape.corInterior)
}