package com.example.sisterlabsodevsorular

import java.util.Scanner

//Kullanıcıdan bir harf girmesini isteyen ve bu harfin sesli veya sessiz harf
// olduğunu ekrana yazdıran bir programı nasıl yazarsınız?

fun main() {
    val scanner = Scanner(System.`in`)

    println("Bir harf giriniz")
    val harf = scanner.next().first()

    val sesliHarfler = listOf('A', 'E', 'I', 'O', 'Ö', 'U', 'Ü', 'a', 'e', 'ı', 'i', 'o', 'ö', 'u', 'ü')

    if (sesliHarfler.contains(harf)) {
        println("Girilen harf sesli harf.")
    } else {
        println("Girilen harf sessiz harf.")
    }
}