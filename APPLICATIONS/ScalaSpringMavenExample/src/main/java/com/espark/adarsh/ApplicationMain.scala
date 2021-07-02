package com.espark.adarsh

import org.springframework.context.support.ClassPathXmlApplicationContext

/**
 * Created by Adarsh on 9/9/15.
 */
object ApplicationMain {

  def main(args: Array[String]) {
    val ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml")
    var myService = ctx.getBean("myServiceImpl").asInstanceOf[MyService];
    println("Message " + myService.getWishMsg("adarsh kumar"));
  }
}
