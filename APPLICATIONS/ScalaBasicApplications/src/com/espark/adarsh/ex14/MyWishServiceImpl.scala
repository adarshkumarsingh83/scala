package com.espark.adarsh.ex14

/**
 * Created by Adarsh on 9/9/15.
 */
abstract class MyWishServiceImpl {

  def wishGoodMorning(name: String): String = {
    return "Good Morning " + name;
  }

  def wishGoodEvening(name: String) {
    println("Good Evening " + name);
  }
}
