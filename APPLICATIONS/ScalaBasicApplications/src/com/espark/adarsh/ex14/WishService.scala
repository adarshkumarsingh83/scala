package com.espark.adarsh.ex14

/**
 * Created by Adarsh on 9/9/15.
 */
class WishService extends MyWishServiceImpl with MyWishService {

  def wishMsg(name: String): String = {
    return "Welcome " + name;
  }

}
