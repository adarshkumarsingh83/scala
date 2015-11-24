package com.espark.adarsh.test

import org.junit.runner.RunWith
import org.junit.Test
import com.espark.adarsh.Person

/**
 * Created by Adarsh on 9/10/15.
 */
class ApplicationTest {

  @Test def testPersonConstructor1() {
    val al = new Person("Adarsh", "Kumar", 20)
    println(al)

  }

  @Test def testPersonConstructor2() {
    // (2) use a secondary constructor
    val a2 = new Person("Adarsh", "Kumar")
    println(a2)

  }

  @Test def testPersonConstructor3() {
    // (3) use a secondary constructor
    val a3 = new Person("Adarsh")
    println(a3)
  }
}
