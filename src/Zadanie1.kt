import java.time.LocalDate

fun main() {
    val gazeta1 = Gazeta()
    gazeta1.displayInfo()

    val gazeta2 = Gazeta("Вестник", 5, LocalDate.of(2023, 10, 1))
    gazeta2.displayInfo()

    println("Выпущена ли газета сегодня? ${gazeta2.isReleasedToday()}")

    println("Дата следующего выпуска: ${gazeta2.getNextReleaseDate()}")

    println(gazeta2.getReleaseStatus())
}