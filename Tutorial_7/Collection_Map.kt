fun mutableMapOfFunction() {
   val solarSystem = mutableMapOf(
       "Mercury" to 0,
       "Venus" to 0,
       "Earth" to 1,
       "Mars" to 2,
       "Jupiter" to 79,
       "Saturn" to 82,
       "Uranus" to 27,
       "Neptune" to 14
   )

   println(solarSystem.size)

   // change value by key
   solarSystem["Pluto"] = 5
   println(solarSystem.size)

   // access the value by the key
   println(solarSystem["Pluto"])

   // null
   println(solarSystem.get("Theia"))

   solarSystem.remove("Pluto")

   println(solarSystem.size)

   // add a new row to the map and access it, since its mutable
   solarSystem["Jupiter"] = 78
   println(solarSystem["Jupiter"])
}


fun main() {
   mutableMapOfFunction()
}
