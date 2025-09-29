fun main() {
    val numberOfFish = 50
    val numberOfPlants = 23
    if (numberOfFish > numberOfPlants) {
        println("Good ratio!")
    } else {
        println("Unhealthy ratio")
    }

    println("================================")

    val fish = 50
    if (fish in 1..100) {
        println(fish)
    }

    println("================================")

    if (numberOfFish == 0) {
        println("Empty tank")
    } else if (numberOfFish < 40) {
        println("Got fish!")
    } else {
        println("That's a lot of fish!")
    }

    println("================================")

    when (numberOfFish) {
        0  -> println("Empty tank")
        in 1..39 -> println("Got fish!")
        else -> println("That's a lot of fish!")
    }



    println()
    println()
    println("================================") //no 2 bagian 4


    var marbles: Int? = null

    var fishFoodTreats = 6
    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
    }

//    var fishFoodTreats = 6
//    fishFoodTreats = fishFoodTreats?.dec()

//    fishFoodTreats = fishFoodTreats?.dec() ?: 0

//    val len = s!!.length   // throws NullPointerException if s is null


    println()
    println()
    println("================================")


    val school = listOf("mackerel", "trout", "halibut")
    println(school)

    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")

    val schools = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(schools))

    val mix = arrayOf("fish", 2)

    val numbers = intArrayOf(1,2,3)

    val numbers2 = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers2
    println(foo2[5])

    val numbers4 = intArrayOf(1, 2, 3)
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers4, oceans, "salmon")
    println(oddList)

    val array = Array (5) { it * 2 }
    println(java.util.Arrays.toString(array))

    val schoolss = arrayOf("shark", "salmon", "minnow")
    for (element in schoolss) {
        print(element + " ")
    }

    for ((index, element) in school.withIndex()) {
        println("Item at $index is $element\n")
    }

    for (i in 1..5) print(i)
    for (i in 5 downTo 1) print(i)
    for (i in 3..6 step 2) print(i)
    for (i in 'd'..'g') print (i)


    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println("$bubbles bubbles in the water\n")

    do {
        bubbles--
    } while (bubbles > 50)
    println("$bubbles bubbles in the water\n")

    repeat(2) {
        println("A fish is swimming")
    }


    println()
    println()
    println("================================")



}