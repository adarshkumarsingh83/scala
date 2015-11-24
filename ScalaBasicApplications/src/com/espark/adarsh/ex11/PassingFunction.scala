package com.espark.adarsh.ex11

/**
 * Created by Adarsh on 9/8/15.
 */
object PassingFunction {

  def main(args: Array[String]) {
    this.workPerSecond(myWork)
  }

  // the function we'll pass in to oncePerSecond.
  // this can be any function that takes no args and doesn't
  // return anything.
  def myWork() {
    println("Adarsh is working every seconds ... ")
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
