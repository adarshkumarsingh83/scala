package com.espark.adarsh.ex14

/**
 * Created by Adarsh on 9/9/15.
 */
object ApplicationMain {

  def main(args: Array[String]) {
    var wishService = new WishService();
    println("=> " + wishService.wishMsg(System.getProperty("user.name")));
    println("=> " + wishService.wishGoodMorning(System.getProperty("user.name")));
    wishService.wishGoodEvening(System.getProperty("user.name"));
  }

}
