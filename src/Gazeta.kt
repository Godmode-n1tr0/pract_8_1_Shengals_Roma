class Gazeta(
    var title: String,
    var number: Int,
    var releaseDate: String
) {
    constructor() : this("Неизвестно", 0, "2023-10-01")

    fun displayInfo() {
        println("Газета: $title, Номер: $number, Дата выпуска: $releaseDate")
    }

    fun isReleasedToday(): Boolean {
        val today = "2023-10-01"
        return when {
            releaseDate == today -> true
            else -> false
        }
    }

    fun getNextReleaseDate(): String {
        return releaseDate
    }

    fun getReleaseStatus(): String {
        return when {
            isReleasedToday() -> "Газета выпущена сегодня."
            else -> "Газета еще не выпущена."
        }
    }
}
