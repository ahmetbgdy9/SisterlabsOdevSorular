package com.example.sisterlabsodevsorular

import java.util.Scanner
import kotlin.random.Random

// Kullanıcıya belirli bir sayı kadar tahmin yapma hakkı veren bir sayı tahmin oyununu
// nasıl oluşturursunuz?

fun main() {
    var tahminAdet = 4
    var tahminSayac = 0
    val Scanner =  Scanner(System.`in`)

    println("Sayıyı tahmin etme hakkınız $tahminAdet")




    for (i in tahminSayac..tahminAdet) {

        print("Sayıyı tahmin ediniz : ")
        val tahmin = Scanner.nextInt()

        var sayi = Random.nextInt(1,9)

        if (tahminSayac <= tahminAdet) {

            tahminSayac++

            if (tahmin == sayi ) {
                println("Doğru tahmin tebrikler")
            }
            else {
                println("yanlış tahmin")
            }
        }
        else {
            println("tahmin sınırı aştınız")

        }
    }

}
