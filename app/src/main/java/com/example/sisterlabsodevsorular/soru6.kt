package com.example.sisterlabsodevsorular

import java.util.Scanner
// Kullanıcıdan bir ay ismi girmesini isteyen ve bu aya göre mevsim bilgisini ekrana
// yazdıran bir programı nasıl yazarsınız?
fun main() {
    val scanner = Scanner(System.`in`)
    println("Bir ay ismi girin: ")
    val ayIsmi = scanner.next()

    val ay = ayIsmi.lowercase()


    val mevsim = when (ay) {
        "aralık", "ocak", "şubat" -> "Kış mevsimi"
        "mart", "nisan", "mayıs" -> "İlkbahar mevsimi"
        "haziran", "temmuz", "ağustos" -> "Yaz mevsimi"
        "eylül", "ekim", "kasım" -> "Sonbahar mevsimi"
        else -> "Geçersiz ay ismi"
    }

    println(mevsim)
}