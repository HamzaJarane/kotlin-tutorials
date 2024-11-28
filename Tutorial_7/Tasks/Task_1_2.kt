enum class Dayparts(val displayName: String) {
    MORNING("Morning"),
    AFTERNOON("Afternoon"),
    EVENING("Evening"),
}

data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Dayparts,
    val duration: Int
)


fun main() {
    Event(
        title = "Study Kotlin",
        description = "Commit to studying Kotlin at least 15 minutes per day.",
        daypart = Dayparts.EVENING,
        duration = 15
    ).apply {
	println("$title $description ${daypart.displayName} $duration")
    }
}
