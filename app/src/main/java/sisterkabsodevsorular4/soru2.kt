package sisterkabsodevsorular4

//bir hashset içerisindeki elemanları başka bir hashset'e ekleyen bir foksiyon yaz

fun main() {
    val sayilar = hashSetOf(1,2,3,4)
    val sayilar2 = hashSetOf(5,6,7,8)

    ekleFonks(sayilar,sayilar2)

    println(sayilar)
}

fun <T> ekleFonks(sayilar: HashSet<T>,sayilar2: HashSet<T>) {

    sayilar.addAll(sayilar2)

}
