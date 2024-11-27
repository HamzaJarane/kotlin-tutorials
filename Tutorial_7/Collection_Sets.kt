fun mutableSetsOfFunction() {
   val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

   println(solarSystem.size)

   solarSystem.add("Pluto")
   println(solarSystem.size)

   println(solarSystem.contains("Pluto"))

   // Should not be added because of duplication
   solarSystem.add("Pluto")
   println(solarSystem.size)

   solarSystem.remove("Pluto")

   println(solarSystem.size)
   println(solarSystem.contains("Pluto"))
}


fun main() {
   mutableSetsOfFunction()
}
