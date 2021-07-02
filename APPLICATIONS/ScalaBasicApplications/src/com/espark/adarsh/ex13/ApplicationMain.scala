package com.espark.adarsh.ex13

/**
 * Created by Adarsh on 9/9/15.
 */
object ApplicationMain {

  def main(args: Array[String]) {

    val myWishService = new MyWishServiceImpl().asInstanceOf[com.espark.adarsh.ex13.MyWishService];
    println("=> " + myWishService.wishMsg("Adarsh kumar "));
    println("=> "+myWishService.wishGoodMorning("Adarsh "));
    myWishService.wishGoodEvening("Adarsh ");
  }

}
