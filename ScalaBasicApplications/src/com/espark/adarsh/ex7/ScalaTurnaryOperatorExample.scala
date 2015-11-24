package com.espark.adarsh.ex7

/**
 * Created by Adarsh on 9/8/15.
 */
object ScalaTurnaryOperatorExample {

  def main(args: Array[String]) {
    printf("Enter the Input Data ");
    var inputData: Int = readInt();

    var result = if (inputData == 1) "Input is One " else "Input is Not One";
    printf("Input Data is " + result);
  }
}
