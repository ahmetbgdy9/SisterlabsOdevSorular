package sisterkabsodevsorular3

// Bir HashMap'teki tüm değerleri toplayan bir fonksiyon yazın.

fun toplamDeger(hashMap: HashMap<String, Int>): Int {
    var toplam = 0

    for (i in hashMap.values) {
        toplam += i
    }

    return toplam
}

fun main() {
    val hashMap = hashMapOf(
        "1." to 10,
        "2." to 20,
        "3." to 30
    )
    val toplam = toplamDeger(hashMap)
    println("Toplam: $toplam")
}