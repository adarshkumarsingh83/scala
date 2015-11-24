package com.espark.adarsh.ex12

/**
 * Created by Adarsh on 9/8/15.
 */
object Collection2 {
  def main(args: Array[String]) {

    val p1Ratings = Map("Lady in the Water" -> 3.0,
      "Snakes on a Plane" -> 4.0,
      "You, Me and Dupree" -> 3.5)
    val p2Ratings = Map("Lady in the Water" -> 3.0,
      "Snakes on a Plane1" -> 4.0,
      "You, Me and Dupree" -> 3.5)

    println();
    p1Ratings.keys.foreach((movie) =>
    if (p2Ratings.contains(movie))
    println(movie)
    )

    println();
    p1Ratings foreach ((movie) =>
    if (p2Ratings.contains(movie._1))
    println(movie)
    )

    println();
    for ((movie1, rating1) <- p1Ratings) {
      if (p2Ratings.contains(movie1))
        println(movie1)
    }
  }
}
