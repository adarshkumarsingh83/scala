package com.espark.adarsh.ex11

/**
 * Created by Adarsh on 9/8/15.
 */
object PassingAnnonimusFunction {

  def main(args: Array[String]) {
    // pass in an anonymous function to the oncePerSecond function
    workPerSecond(() =>
      println("Adarsh is working every seconds ....")
    )
  }


  // this function takes another function as an argument.
  // that function takes no args, and doesn't return anything.
  def workPerSecond(callback: () => Unit) {
    while (true) {
      callback();
      Thread.sleep(1000)
    }
  }
}
