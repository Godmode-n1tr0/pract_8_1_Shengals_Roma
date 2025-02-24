import java.time.LocalDate

class Gazeta(
    var title: String,
    var number: Int,
    var releaseDate: LocalDate
) {
    constructor() : this("Неизвестно", 0, LocalDate.now())

    fun displayInfo() {
        println("Газета: $title, Номер: $number, Дата выпуска: ${releaseDate}")
    }

    fun isReleasedToday(): Boolean {
        return when {
            releaseDate == LocalDate.now() -> true
            else -> false
        }
    }

    fun getNextReleaseDate(): LocalDate {
        return releaseDate.plusDays(7)
    }

    fun getReleaseStatus(): String {
        return when {
            isReleasedToday() -> "Газета выпущена сегодня."
            releaseDate.isBefore(LocalDate.now()) -> "Газета выпущена раньше."
            else -> "Газета еще не выпущена."
        }
    }
}