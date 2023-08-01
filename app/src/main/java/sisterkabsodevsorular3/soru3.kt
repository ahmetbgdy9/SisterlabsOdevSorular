package sisterkabsodevsorular3

//İki listenin elemanlarını birleştirip sıralayan bir fonksiyon yazın

fun main() {
    val list1 = listOf(0,3,5,8)
    val list2 = listOf(6,2,4,9)
    val sonListe = birlestirSiralaFun(list1, list2)
    println("Yeni Liste: $sonListe")
}

fun birlestirSiralaFun(list1: List<Int>, list2: List<Int>): List<Int> {

    val birlesmisListe = mutableListOf<Int>()

    birlesmisListe.addAll(list1)
    birlesmisListe.addAll(list2)


    return birlesmisListe.sorted()
}