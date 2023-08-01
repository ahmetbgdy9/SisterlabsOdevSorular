package sisterkabsodevsorular3

// Bir listedeki tek sayıları filtreleyen bir fonksiyon yazın.

fun tekSayilariFiltrele(liste: List<Int>): List<Int> {
    return liste.filter { it % 2 == 1 }
}

fun main() {

    val liste = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val tekSayilar = tekSayilariFiltrele(liste)
    println(tekSayilar)

}



