package sisterkabsodevsorular2


//"Arac" adlı bir üst sınıf oluşturun ve bu sınıfta araçların hızı ve yakıt tüketimi gibi
// özellikleri tanımlayın. Ardından "Otomobil" adlı bir alt sınıf oluşturun
// ve bu sınıfta otomobil türüne özgü özellikleri ekleyin. "Otomobil" sınıfı "Arac"
// sınıfından kalıtım almalıdır. Otomobil sınıfında "bagajHacmi" adlı bir
// özelliği ve "bagajAc" adlı bir metodu ekleyin.

fun main() {
    val arac1 = Arac(150,80)
    val oto1 = Otomobil(130,200,180,"E5")


    oto1.yazdir()
    oto1.bagajAc()

}

open class Arac(val hiz:Int, val yakit:Int) {

}


class Otomobil(hiz: Int, yakit: Int, val bagajHacmi:Int, val model:String) : Arac(hiz,yakit) {

    fun yazdir() {
        println("Arac hizi = $hiz, Arac yakiti = $yakit, bagaj hacmi = $bagajHacmi, model = $model")
    }


    fun bagajAc() {
        println("Bagaj açıldı")
    }
}

