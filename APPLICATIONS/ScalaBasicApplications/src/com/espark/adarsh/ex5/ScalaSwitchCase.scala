package com.espark.adarsh.ex5

/**
 * Created by Adarsh on 9/7/15.
 */
object ScalaSwitchCase {

  def main(args: Array[String]) {

    var name = readLine("Enter the Name ");
    var myResult = name match {
      case "adarsh" => name + " A";
      case "amit" => name + " B";
      case "radha" => name + " C";
      case "sonu" => name + " D";
    }
    println(myResult);
  }
}
