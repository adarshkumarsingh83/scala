package com.espark.adarsh.ex4

import java.io.IOException

/**
 * Created by Adarsh on 9/7/15.
 */
object ExceptionHandlingExample {

  def main(args: Array[String]) {
    try {

      println("this line is before Exception ");
      this.throwsException();
      println("this line is after Exception ");
    } catch {
      case e: Exception => println("Exception Generated: " + e);
      case e: IllegalArgumentException => println("illegal arg. exception");
      case e: IllegalStateException => println("illegal state exception");
      case e: IOException => println("IO exception");
    } finally {
      println("this code is always executed");
    }
  }

  def throwsException() {
    throw new IllegalStateException("Exception thrown From throwsException() ");
  }
}
