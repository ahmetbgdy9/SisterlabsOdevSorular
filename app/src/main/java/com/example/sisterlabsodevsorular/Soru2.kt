package com.example.sisterlabsodevsorular

import java.util.Scanner

fun main() {

    // Kullanıcının girdiği bir sayının faktöriyelini hesaplayan bir
    // fonksiyonu döngü kullanmadan nasıl yazarsınız?

    val scanner = Scanner(System.`in`)
    print("Bir sayı giriniz : ")

    var sayi = scanner.nextInt()
    println("$sayi! = ${factoriyel(sayi)}")

}

fun factoriyel(sayi:Int): Int {

    return if (sayi == 0 || sayi == 1) {
        1
    } else {
        sayi * factoriyel(sayi - 1)
    }

}