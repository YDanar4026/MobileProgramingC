package example.myapp

import kotlin.math.PI

open class Aquarium (
    open var length: Int = 100,
    open var width: Int = 20,
    open var height: Int = 40
) {
    init {
        println("aquarium initializing")
    }
    init {
        println("Volume: ${width * length * height / 1000} liters")
    }

    constructor(numberOfFish: Int) : this() {
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    open val shape = "rectangle"

    open var water: Double = 0.0
        get() = volume * 0.9

    // === Tambahan untuk menyimpan ikan ===
    private val fishes = mutableListOf<FishColor>()

    fun addFish(fish: FishColor) {
        fishes.add(fish)
    }

    fun printFishes() {
        if (fishes.isEmpty()) {
            println("Tidak ada ikan di dalam aquarium.")
        } else {
            println("Daftar ikan dalam aquarium:")
            for ((index, fish) in fishes.withIndex()) {
                println("${index + 1}. Warna: ${fish.color}")
            }
        }
    }
    // =====================================

    fun printSize() {
        println(shape)
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
        println("Volume: $volume liters Water: $water liters (${water / volume * 100.0}% full)")
    }
}

class TowerTank (override var height: Int, var diameter: Int): Aquarium(height = height, width = diameter, length = diameter) {
    override var volume: Int
        get() = (width/2 * length/2 * height / 1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width/2 * length/2)).toInt()
        }

    override var water = volume * 0.8
    override val shape = "cylinder"
}
