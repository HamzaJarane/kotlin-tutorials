enum class Daypart(val displayName: String) {
    MORNING("Morning"),
    AFTERNOON("Afternoon"),
    EVENING("Evening"),
}

data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val duration: Int
)


fun main() {
    val events = mutableListOf<Event>(
	Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, duration = 0),
	Event(title = "Eat breakfast", daypart = Daypart.MORNING, duration = 15),
	Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, duration = 30),
	Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, duration = 60),
	Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, duration = 10),
	Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, duration = 45)
    )

    val shortEvents = events.filter {
        it.duration < 60
    }

    // shortEvents.forEach {
    //	println("${it.title} ${it.duration}")
    // }

    println("You have ${shortEvents.size} short events.")
}
