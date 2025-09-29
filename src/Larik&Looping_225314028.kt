
//Yusuf Danar Indra Setiawan
//225314028

fun fibonacci(angka1: Int, angka2: Int, maks: Int): List<Int> {
    val hasil = mutableListOf<Int>()
    var a = angka1
    var b = angka2

    hasil.add(a)
    hasil.add(b)

    while (true) {
        val c = a + b
        if (c > maks) break
        hasil.add(c)
        a = b
        b = c
    }

    println("Deret Fibonacci: $hasil")
    return hasil
}

fun text_to_array(text: String): Array<String> {
    val arr = text.split(" ").toTypedArray()
    println("Larik String: ${arr.joinToString(", ")}")
    return arr
}

fun main(args: Array<String>) {
    fibonacci(1, 3, 100)
    text_to_array("Hari ini saya belajar kotlin")
}
