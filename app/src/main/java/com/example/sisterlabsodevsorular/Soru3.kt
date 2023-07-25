package com.example.sisterlabsodevsorular

import java.util.Scanner

//Bir kullanıcının sınav notuna göre, eğer notu 70 ve üzeriyse "Geçtiniz",
// aksi halde "Kaldınız" mesajını veren bir programı nasıl yazarsınız?

fun main() {
    val scanner = Scanner(System.`in`)
    print("Sınav notunuzu giriniz = ")
    val not = scanner.nextInt()

    if(not < 70) {
        println("Kaldınız")
    }
    else if (not in 70..100) {
        println("tebrikler geçtiniz.")
    }

}