package sisterkabsodevsorular4

//Bir "Calisan" (Employee) arayüzü oluşturun ve bu arayüzü uygulayan sınıfları (Mudur ve Memur)
// tanımlayın. Her sınıfın "maasHesapla" metodu olsun


interface Calisan {
    fun maasHesapla(): Double
}

class Mudur(val aylikGelir: Double) : Calisan {
    override fun maasHesapla(): Double {
        return aylikGelir * 1.5
    }

}
class Memur(val saatlikUcret: Double, val calismaSaati: Double) : Calisan {
    override fun maasHesapla(): Double {
        return saatlikUcret * calismaSaati
    }

}


fun main() {
    val mudur = Mudur(5000.0)
    val memur = Memur(20.0, 160.0)

    println("Müdür Maaşı: ${mudur.maasHesapla()}")
    println("Memur Maaşı: ${memur.maasHesapla()}")
}
