package com.espark.adarsh.ex2

/**
 * Created by Adarsh on 9/7/15.
 */
object CmdLineArguments {
  def main(cmdLineArgs: Array[String]) {

    println();
    for (valueInCmdLineArgs: String <- cmdLineArgs) {
      println("=> " + valueInCmdLineArgs);
    }

    println();
    for (i <- 0 until cmdLineArgs.length) {
      println(i + " value is: " + cmdLineArgs(i));
    }

    println();
    var cmdLineArgsIndex: Int = 0;
    while (cmdLineArgsIndex < cmdLineArgs.length) {
      println(cmdLineArgs(cmdLineArgsIndex) + " = " + cmdLineArgsIndex);
      cmdLineArgsIndex += 1;
    }

    println();
    var myInt: Int = 0;
    do {
      println(cmdLineArgs(myInt) + " = " + myInt);
      myInt += 1;
    } while (myInt < cmdLineArgs.length)
  }
}
