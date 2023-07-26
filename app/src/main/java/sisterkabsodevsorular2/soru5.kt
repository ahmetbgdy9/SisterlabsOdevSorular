package sisterkabsodevsorular2

import java.util.Scanner

//Bir String türünde ArrayList oluşturun ve içine "ahmet", "mehmet", "ayşe", "feyza", "emir"
// gibi isimleri ekleyin. Kullanıcıdan alınan bir indeks numarasına göre listedeki ismi güncelleyen
// bir fonksiyon yazın. Yani kullanıcı, "ahmet" isminin indeksini ve yeni ismi (örn. "ali") girerek
// listedeki "ahmet" ismini "ali" olarak değiştirebilsin.

fun main() {

    val scanner = Scanner(System.`in`)
    val isimListesi = arrayListOf("ahmet", "mehmet", "ayşe", "feyza", "emir")

    print("Değiştirmek istediğiniz ismin indeksini girin : ")
    val indeks = scanner.nextInt()

    if (indeks != null && indeks >= 0 && indeks < isimListesi.size) {
        print("Yeni ismi girin: ")
        val yeniIsim = scanner.next()

        if (yeniIsim != null) {
            isimListesi[indeks] = yeniIsim
            println("İsim güncellendi. Yeni İsim Listesi: $isimListesi")
        } else {
            println("Geçersiz giriş! Yeni isim boş olamaz.")
        }
    } else {
        println("Geçersiz indeks! Lütfen geçerli bir indeks girin.")
    }
}

