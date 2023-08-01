package sisterkabsodevsorular3

// Verilen bir listedeki tüm elemanları toplayan bir fonksiyon yazın.

fun topla(liste: List<Int>): Int {

    var toplam = 0

    for (eleman in liste) {
        toplam += eleman
    }
    return toplam
}

fun main() {
    val ornek = listOf(1, 2, 3, 4, 5)
    val sonuc = topla(ornek)
    println("Toplam: $sonuc")
}