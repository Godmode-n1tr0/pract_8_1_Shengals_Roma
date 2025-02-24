fun main() {
    try {
        val gazeta1 = Gazeta()
        gazeta1.displayInfo()

        val gazeta2 = Gazeta("Вестник", 5, "2023-10-01")
        gazeta2.displayInfo()

        println("Выпущена ли газета сегодня? ${gazeta2.isReleasedToday()}")
        println("Дата следующего выпуска: ${gazeta2.getNextReleaseDate()}")
        println(gazeta2.getReleaseStatus())
    } catch (e: Exception) {
        println("Произошла ошибка: ${e.message}")
    }
}