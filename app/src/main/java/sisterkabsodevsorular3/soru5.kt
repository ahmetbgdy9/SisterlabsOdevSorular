package sisterkabsodevsorular3


//Verilen bir listedeki tekrar eden elemanları HashSet olarak döndüren bir fonksiyon yazın.


fun main() {

    val liste = arrayListOf(1, 2, 2, 3, 9, 7 ,7, 3, 3, 4, 5, 5, 6)
    val tekrarEdenler = tekrarEdenleriBul(liste)
    println(tekrarEdenler)
}

fun tekrarEdenleriBul(liste: List<Int>): HashSet<Int> {

    val tekrarEdenler = hashSetOf<Int>()
    val tekrarEtmeyenler = hashSetOf<Int>()

    for (i in liste) {
        if (i in tekrarEtmeyenler) {
            tekrarEdenler.add(i)
        } else {
            tekrarEtmeyenler.add(i)
        }
    }

    return tekrarEdenler
}
