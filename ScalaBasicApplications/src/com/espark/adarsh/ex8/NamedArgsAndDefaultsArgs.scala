package com.espark.adarsh.ex8

/**
 * Created by Adarsh on 9/8/15.
 */
object NamedArgsAndDefaultsArgs {

  def main(args: Array[String]) {
    printName(firstName = "Adarsh", lastName = "Kumar");
    printName(firstName = "Radha");
    printName();
  }

  def printName(firstName: String = "Unknown", lastName: String = "Unknown") {
    System.out.format("Your name is %s %s\n", firstName, lastName);
  }
}
