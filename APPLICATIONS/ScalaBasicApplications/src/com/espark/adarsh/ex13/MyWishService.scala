package com.espark.adarsh.ex13

/**
 * Created by Adarsh on 9/9/15.
 */
trait MyWishService {

  def wishMsg(name: String): String

  def wishGoodMorning(name: String): String = {
    return "Good Morning " + name;
  }

  def wishGoodEvening(name: String) {
    println("Good Evening " + name);
  }
}
