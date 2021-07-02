package com.espark.adarsh.ex9


/**
 * Created by Adarsh on 9/8/15.
 */
object ScalaPackages {

  def main(args: Array[String]) {
        var myClassObject=new org.espark.adarsh.MyClass();
        println(myClassObject);
        myClassObject.display();
  }
}

package org {
        package espark {
                package adarsh {
                        class MyClass {

                          override def toString = "I'm a Adarsh"

                          def display(){
                              println("welcome to scala world")
                          }

                        }
                }
        }
}

