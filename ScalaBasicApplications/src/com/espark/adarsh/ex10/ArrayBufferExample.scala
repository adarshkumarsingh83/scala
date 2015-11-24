package com.espark.adarsh.ex10

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Adarsh on 9/8/15.
 */
object ArrayBufferExample {

  def main(args: Array[String]) {
    var names = ArrayBuffer[String]()
    names += " Adarsh"
    names += " Radha"
    names += " Amit";

    print("Names => " + names)

    println();
    for (index <- 0 until names.length) {
      println("=> " + names(index));
    }

    println();
    for (name <- names) {
      println("=> " + name);
    }

  }
}
