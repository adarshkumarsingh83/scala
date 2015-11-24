package com.espark.adarsh.ex1

/**
 * Created by Adarsh on 9/7/15.
 */
class Person(firstName: String, middleName: String, age: Int) {

  def this(firstName: String, middleName: String) {
    this(firstName, middleName, 0);
  }

  def this(firstName: String, age: Int) {
    this(firstName, " ", age);
  }

  def this(firstName: String) {
    this(firstName, " ", 0);
  }

  override def toString: String = {
    return "%s %s, age %d".format(firstName, middleName, age)
  }
}
