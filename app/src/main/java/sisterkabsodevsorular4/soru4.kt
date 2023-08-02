package sisterkabsodevsorular4

//Geometrik şekilleri temsil eden bir arayüz (Shape) ve bu arayüzü uygulayan iki sınıf
// (Dikdortgen ve Daire) tanımlayın. Her şekil için alanı hesaplayacak bir metot olsun


interface Shape {
    fun alan():Double
}

class Dikdortgen(val kKenar:Double,var uKenar:Double) : Shape {
    override fun alan(): Double {
        return kKenar * uKenar
    }
}

class Daire(private val yaricap: Double) : Shape {
    override fun alan(): Double {
        return Math.PI * yaricap * yaricap
    }
}


fun main() {
    val dikdortgen = Dikdortgen(5.0, 10.0)
    val daire = Daire(3.0)

    println("Dikdörtgen Alanı: ${dikdortgen.alan()}")
    println("Daire Alanı: ${daire.alan()}")
}

