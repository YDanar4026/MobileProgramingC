fun main() {
    val width = 20
    val height = 40
    val length = 100
    val fishSize = 1000
    val tankRatio = 0.8  // 80%

    // volume aquarium
    val volume = width * height * length

    // volume efektif untuk ikan
    val fishVolume = (volume * tankRatio).toInt()

    // jumlah ikan yang muat
    val fishCount = fishVolume / fishSize

    println("Volume Aquarium: $volume")
    println("Volume untuk ikan (80%): $fishVolume")
    println("Jumlah ikan maksimal: $fishCount")
}
