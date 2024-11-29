package com.example.myapplication.Tutorials

fun main() {
    // Test comment
    val name: String = "Hamza";
    val age: Int = 20;
    val height: Double = 185.2;
    val money: Float = 2.3f;
    val dead: Boolean = false;
    var isDead: String? = null;

    if(dead) {
        isDead = "Dead";
    } else {
        isDead = "Not Dead";
    }

    println("Hello my name is $name, \nI'm $age years old, \nMy height is $height, \nI have $money$, \nAnd Im $isDead");
}