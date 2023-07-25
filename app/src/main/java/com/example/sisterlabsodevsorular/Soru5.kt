package com.example.sisterlabsodevsorular

//Bir "Öğrenci" adlı sınıf oluşturun ve öğrencilerin adı, soyadı ve sınıfı gibi özellikleri içeren
// özellikleri tanımlayın. Ardından, bu sınıftan beş öğrenci nesnesi oluşturun ve bu öğrencilerin
// özelliklerini ekrana yazdıran bir fonksiyon yazın
class Ogrenci(val adi:String,val soyadi:String,val sinifi:Int)

fun main() {
    val ogrenci1 = Ogrenci("ali","kılınc",6)
    val ogrenci2 = Ogrenci("adem","kaya",2)
    val ogrenci3 = Ogrenci("ahmet","basaran",5)
    val ogrenci4 = Ogrenci("emre","kara",7)
    val ogrenci5 = Ogrenci("ayşe","adil",8)


    yazdir(ogrenci1)
    yazdir(ogrenci2)
    yazdir(ogrenci3)
    yazdir(ogrenci4)
    yazdir(ogrenci5)
}

fun yazdir(ogrenci: Ogrenci) {
    println("Adi ${ogrenci.adi}")
    println("SoyAdi ${ogrenci.soyadi}")
    println("Sinifi ${ogrenci.sinifi}")

}


