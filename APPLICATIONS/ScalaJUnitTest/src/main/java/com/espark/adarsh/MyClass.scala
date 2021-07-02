package com.espark.adarsh

/**
 * Created by Adarsh on 9/7/15.
 */
object MyClass {

  def main(args: Array[String]) {
    println("Welcome to Scala Application ");

    // (1) use the primary constructor
    val al = new Person("Adarsh", "Kumar", 20)
    println(al)

    // (2) use a secondary constructor
    val a2 = new Person("Adarsh", "Kumar")
    println(a2)

    // (3) use a secondary constructor
    val a3 = new Person("Adarsh")
    println(a3)

  }
}
