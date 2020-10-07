package com.luoshen.coolweather.kotlin

import com.luoshen.coolweather.kotlin.data.CellPhone
import com.luoshen.coolweather.kotlin.data.Singleton
import kotlin.math.max

fun main() {
//   val a = 2
//   val b = 3
//
//   println(method(a,b))

//   checkNumber(20L)

//   forDemo4()

//   val person = Person()

//   val student = Student();
//   print(student.name)

//   val cellPhone = CellPhone("diyihangdaima",99.0);
//   val cellPhone2 = CellPhone("diyihangdaima",99.0);
//   println(cellPhone == cellPhone2)

//   println(Singleton.getName())

    LambdaDemo2()
}

fun method(a: Int, b: Int): Int = max(a, b)

fun checkNumber(num: Number) {
    when (num) {
        is Int -> println("int")
        is Double -> println("double")
        is Float -> println("float")
        else -> println("dont know")
    }
}

fun forDemo() {
    for (i in 0..10) {
        println(i);
    }
}

fun forDemo2() {
    for (i in 0 until 10) {
        println(i);
    }
}

fun forDemo3() {
    for (i in 0 until 10 step 2) {
        println(i);
    }
}

fun forDemo4() {
    for (i in 10 downTo 0) {
        println(i);
    }
}

fun LambdaDemo() {
    val list = mutableListOf("Apple", "Banana", "Orange", "Pear", "Grape")
    for (fruit in list) {
        println(fruit)
    }
}

fun LambdaDemo2() {
    val list = mutableListOf("Apple", "Banana", "Orange", "Pear", "Grape")
    val map = list.map { it.toUpperCase() }.filter { it.length < 5 }
    for (fruit in map) println(fruit)

}

fun nullPoint(person: Person?) {

    person?.getA()
}

fun getTextLength(text: String?) = text?.length ?: 0