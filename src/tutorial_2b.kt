//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val i: Int = 6

    val b1 = i.toByte()
    println(b1)

    val b2: Byte = 1 // OK, literals are checked statically
    println(b2)

//    val i1: Int = b2
//    val i2: String = b2
//    val i3: Double = b2

    val i4: Int = b2.toInt() // OK!
    println(i4)
    val i5: String = b2.toString()
    println(i5)
    val i6: Double = b2.toDouble()
    println(i6)

    println("===========================")

    var fish: Int = 12
    var lakes: Double = 2.5
    println(fish)
    println(lakes)

    println("===========================")

    val numberOfFish = 5
    val numberOfPlants = 12
    println("I have $numberOfFish fish" + " and $numberOfPlants plants")
    println("I have ${numberOfFish + numberOfPlants} fish and plants")
}