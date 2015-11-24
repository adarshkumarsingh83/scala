package com.espark.adarsh.ex15

/**
 * Created by Adarsh on 9/9/15.
 */
object ScalaTuplesExample {
  def main(args: Array[String]) {
    val myTuples = (1, "adarsh", 'A', 2.5);
    println(myTuples._1);
    println(myTuples._2);
    println(myTuples._3);
    println(myTuples._4);

    println();
    def userInformation = ("Adarsh", 30, 80.0);
    val(name, age, weight) = userInformation;
    println(name+" "+age+" "+weight);

    println();
    val myMap = Map(1 -> "Adarsh", 2 -> "Kumar");
    myMap map { case (key,value) => println(s"$key is $value") }

  }
}
