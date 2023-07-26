package sisterkabsodevsorular2

import java.util.ArrayList
import java.util.Scanner

//  Bir Integer türünde ArrayList oluşturun ve kullanıcıdan alınan 5 adet sayıyı bu listeye ekleyin.
//  Ardından, listedeki sayıları toplayan bir fonksiyon yazın ve sonucu ekrana yazdırın

fun main() {
    val scanner = Scanner(System.`in`)

    val sayiListesi = ArrayList<Int>()

    for (i in 1..5) {
        print("Sayı $i: ")
        val sayi = scanner.nextInt()
            sayiListesi.add(sayi)
    }

    val sonuc = sayilariTopla(sayiListesi)
    println("Listedeki sayıların toplamı: $sonuc")
}

fun sayilariTopla(list: ArrayList<Int>) : Int{

    var toplam = 0
    for(sayi in list ) {
        toplam += sayi
    }
    return toplam
}