package com.example.myapplication.Tutorials

fun main() {
    // Print messages
    println("Use the val keyword when the value doesn't change. \nUse the var keyword when the value can change. \nWhen you define a function, you define the parameters that can be passed to it. \nWhen you call a function, you pass arguments for the parameters.")

    // Fix compile errors
    println("New chat message from a friend")

    // String templates
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)

    // String concatenation
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")

    // Message formatting
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "${baseSalary + bonusAmount}"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")

    // Implement basic math operations
    val firstNumber = 10
    val secondNumber = 5
    val result = firstNumber + secondNumber

    println("$firstNumber + $secondNumber = $result")

    fun add(firstNum: Int, secondNum: Int): Int {
        return firstNum + secondNum;
    }

    fun subtract(firstNum: Int, secondNum: Int): Int {
        return firstNum - secondNum;
    }

    val firstNumber2 = 10
    val secondNumber2 = 5
    val thirdNumber2 = 8

    val result2 = add(firstNumber2, secondNumber2)
    val anotherResult2 = add(firstNumber2, thirdNumber2)
    val suntractresult = subtract(firstNumber2, thirdNumber2)
    println("$firstNumber2 + $secondNumber2 = $result2")
    println("$firstNumber2 + $thirdNumber2 = $anotherResult2")
    println("$firstNumber2 - $thirdNumber2 = $suntractresult")

    // Default parameters

    fun displayAlertMessage(operationSystem: String = "Unknown os", emailId: String): String {
        return "There's a new sign-in request on $operationSystem for your Google Account $emailId.";
    }

    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId.
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()

    // Pedometer
    fun stepsToCalories(steps: Int): Double {
        val caloriesPerStep = 0.04
        val totalCaloriesBurned = steps * caloriesPerStep
        return totalCaloriesBurned
    }

    val steps = 4000
    val caloriesBurned = stepsToCalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories")

    // Compare two numbers
    fun comparePhoneSpendTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
        return timeSpentToday > timeSpentYesterday;
    }
    val isUsedPhoneTodayMoreThanYesterday = comparePhoneSpendTime(300, 250)

    if(isUsedPhoneTodayMoreThanYesterday) {
        println("You used the phone today more than yesterday")
    } else {
        println("You used the phone today less than yesterday")
    }

    // Move duplicate code into a function
    fun displayWeather(city: String, lowTemperature: Int, highTemperature: Int, chainOfRain: Int) {
        println("City: $city")
        println("Low temperature: $lowTemperature, High temperature: $highTemperature")
        println("Chance of rain: $chainOfRain%")
        println()
    }

    displayWeather("Ankara", 27, 31, 82)
    displayWeather("Tokyo", 32, 36, 10)
    displayWeather("Cape Town", 59, 64, 2)
    displayWeather("Guatemala City", 50, 55, 7)



}