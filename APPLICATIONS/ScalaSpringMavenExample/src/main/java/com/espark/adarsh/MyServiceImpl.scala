package com.espark.adarsh

import org.springframework.stereotype.Service


/**
 * Created by Adarsh on 9/9/15.
 */
@Service
class MyServiceImpl extends MyService {

  def getWishMsg(name: String): String = {
    return "Welcome " + name;
  }

}
