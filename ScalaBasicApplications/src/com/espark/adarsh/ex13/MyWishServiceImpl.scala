package com.espark.adarsh.ex13


/**
 * Created by Adarsh on 9/9/15.
 */
class MyWishServiceImpl extends com.espark.adarsh.ex13.MyWishService {

  def wishMsg(name: String): String = {
    return "Welcome " + name;
  }
}
