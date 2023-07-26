package sisterkabsodevsorular2

// Bir "Dikdörtgen" adlı sınıf oluşturun ve uzunluk ve genişlik gibi özellikleri içeren özellikleri
// tanımlayın. Ardından, bu sınıftan bir dikdörtgen nesnesi oluşturun ve
// dikdörtgenin alanını ve çevresini hesaplayan bir fonksiyon yazın.


class Dikdortgen(val uzunluk: Int, val genislik: Int) {

    fun alan(): Int {
        return uzunluk * genislik
    }

    fun cevre(): Int {
        return 2 * (uzunluk + genislik)
    }
}

fun main() {

    val dikdortgen = Dikdortgen(9, 6)

    val alan = dikdortgen.alan()
    val cevre = dikdortgen.cevre()

    println("Dikdörtgenin Alanı: $alan")
    println("Dikdörtgenin Çevresi: $cevre")
}
