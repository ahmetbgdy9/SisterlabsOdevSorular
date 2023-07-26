package sisterkabsodevsorular2

import java.util.Scanner

//Bir string içindeki tüm sesli harfleri kaldıran bir fonksiyon yazın. Fonksiyon, kullanıcıdan
// alınan bir string içindeki tüm sesli harfleri kaldırarak yeni bir string döndürmelidir.


fun sesliHarfleriKaldir(input: String): String {
    val sesliHarfler = listOf('a', 'e', 'ı', 'i', 'o', 'ö', 'u', 'ü', 'A', 'E', 'I', 'İ', 'O', 'Ö', 'U', 'Ü')
    var result = ""

    for (char in input) {
        if (char !in sesliHarfler) {
            result += char
        }
    }

    return result
}

fun main() {
    val scanner = Scanner(System.`in`)
    print("Bir metin girin: ")
    val metin = scanner.next()

    val metinSesliHarfsiz = sesliHarfleriKaldir(metin)
    println("Sesli harfler çıkarıldıktan sonra: $metinSesliHarfsiz")
}