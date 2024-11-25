package com.example.fundamentalskotlin.Tutorials

fun main() {
    // String but can be null
    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor)

    // we assing it to null
    favoriteActor = null
    println(favoriteActor)

    // Handle null
    var favoriteActor2: String? = "Sandra Oh"
    
    // can be null
    println(favoriteActor2?.length)

    // cannot be null
    println(favoriteActor2!!.length)


    // null checking
    if (favoriteActor != null) {
        println("The number of characters in your favorite actor's name is ${favoriteActor.length}.")
    } else {
        println("You didn't input a name.")
    }

    // assing function to a value, we dont need to return anything
    var lengthOfName1 = if (favoriteActor != null) {
        favoriteActor.length
    } else {
        0
    }
    println("The number of characters in your favorite actor's name is $lengthOfName1.")


    // we use ?: to pick the second value if the first value was null
    var lengthOfName2 = favoriteActor?.length ?: 0

    println("The number of characters in your favorite actor's name is $lengthOfName2.")
}