package com.espark.adarsh.ex6

/**
 * Created by Adarsh on 9/8/15.
 */
object SwitchCaseExample {

  def main(args: Array[String]) {

    println("Enter the input Data => ");
    var inputData: Int = readInt();

    var result = inputData match {
      case 1 => println("January")
      case 2 => println("February")
      case 3 => println("March")
      case 4 => println("April")
      case 5 => println("May")
      case 6 => println("June")
      case 7 => println("July")
      case 8 => println("August")
      case 9 => println("September")
      case 10 => println("October")
      case 11 => println("November")
      case 12 => println("December")
      // catch the default with a variable so you can print it
      case whoa => println("Unexpected case: " + whoa.toString)

    }
  }
}
