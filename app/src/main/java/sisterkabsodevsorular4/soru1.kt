package sisterkabsodevsorular4

//bir hashsetin belirli bir elemanı içerip içermediğini kontrol eden bir fonksiyon yazın

fun main() {

    val sayilar = hashSetOf(1, 2, 3, 4, 5)
    val kontrolEdilen = 3

    println(kontrolFun(sayilar, kontrolEdilen)) // true

}

fun <T> kontrolFun(hashSet: HashSet<T>, element: T): Boolean {
    return hashSet.contains(element)
}