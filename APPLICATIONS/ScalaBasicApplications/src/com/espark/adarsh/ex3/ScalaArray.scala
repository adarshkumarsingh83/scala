package com.espark.adarsh.ex3

/**
 * Created by Adarsh on 9/7/15.
 */
object ScalaArray {

  def main(args: Array[String]) {

    var myArray: Array[String] = new Array[String](5);
    for (index <- 0 until myArray.length) {
      myArray(index) = "Adarsh " + index;
    }
    println();
    for (myString <- myArray) {
      println("=> " + myString);
    }

    println();
    for (i <- 0 until myArray.length) {
      println(i + " " + myArray(i));
    }


    val names = Array("Adarsh", "Amit", "Radha");
    for (name <- names) {
      println(":=> " + name);
    }

    val matrix = Array.ofDim[Int](5,5);
    for(i <- 0 until 5){
      for(j <- 0 until 5 ){
        matrix(i)(j)=(i+j);
      }
    }

    for(i <- 0 until 5){
      for(j <- 0 until 5 ){
        print("\t"+matrix(i)(j));
      }
      println();
    }

  }
}
