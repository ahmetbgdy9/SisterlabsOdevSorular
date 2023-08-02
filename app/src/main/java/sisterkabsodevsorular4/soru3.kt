package sisterkabsodevsorular4

//Bir "Cizilebilir" (Drawable) arayüzü tanımlayın ve bu arayüzü uygulayan sınıfları (Kalem ve Silgi)
// oluşturun. Her sınıfın "ciz" metodu olsun.


interface Cizilebilir {
    fun ciz()
}


class Kalem : Cizilebilir {
    override fun ciz() {
        println("Kalem kullan")
    }
}

class Silgi : Cizilebilir {
    override fun ciz() {
        println("Silgi kullan")
    }
}


fun main() {

    Kalem().ciz()
    Silgi().ciz()
}