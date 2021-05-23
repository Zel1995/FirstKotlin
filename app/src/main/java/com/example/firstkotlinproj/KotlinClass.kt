package com.example.firstkotlinproj

open class KotlinClass(var str: String = "default str", var myInt: Int = 0) {
    init {
        str = "first string"
        myInt = 1
    }
}