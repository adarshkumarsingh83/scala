package com.espark.adarsh.ex12

/**
 * Created by Adarsh on 9/8/15.
 */
object Collection1 {

  def main(args: Array[String]) {

    println();
    var list = List(1, 2, 3, 4, 5, 6);
    for (element <- list) println(element);

    println();
    list.foreach {
      println
    }


    val names = Vector("Adarsh", "Radha", "Amit", "Sonu", "Monu");
    println();
    for (nameElement <- names) println(nameElement);

    println();
    names.foreach {
      println
    }

    println();
    for (name <- names if name.startsWith("A"))
      println(name)


    println();
    val map = Map("firstname" -> "Adarsh", "lastName" -> "Kumar");
    for ((key, value) <- map) printf("key: %s, value: %s\n", key, value);


    // version 1 (tuples)
    map foreach (x => println(x._1 + " --> " + x._2))

    // version 2 (foreach and case)
    map foreach {
      case (key, value) => println(key + " --> " + value)
    }
  }
}
