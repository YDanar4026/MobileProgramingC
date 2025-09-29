fun main() {
    val nilai = 85
    if (nilai in 81..100) {
        println("A")
    } else if (nilai in 71..80) {
        println("B")
    } else if (nilai in 61..70) {
        println("C")
    } else if (nilai in 51..60) {
        println("D")
    } else {
        println("E")
    } // cara ketik = (angka) spasi .. spasi (angka)
}

//fun main(nilai:Int) {
//    var nilai_uks = nilai
//    when (nilai_uks) {
//        in 100 .. 200 -> println("nilai")
//    }
//}