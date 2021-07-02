package com.espark.adarsh

/**
  * Created by Adarsh on 9/7/15.
  */
object MyClass {

   def main(args: Array[String]) {
     println("Welcome to Scala Application ");

     var student: Student = new Student(100, "Adarsh kumar", "adarsh@kumar");
     print("Student Data " + student.getStudentData());
     println();
     var student1: Student = new Student();
     student1.setStudentId(100);
     student1.setStudentName("Adarsh kumar");
     student1.setStudentEmail("adarsh@kumar");
     println("Student Id=> " + student1.getStudentId());
     println("Student Name=> " + student1.getStudentName());
     println("Student Email=> " + student1.getStudentEmail());

     println("Student Information "+student1)



     // (1) use the primary constructor
     val al = new Person("Adarsh", "Kumar", 20)
     println(al)

     // (2) use a secondary constructor
     val a2 = new Person("Adarsh", "Kumar")
     println(a2)

     // (3) use a secondary constructor
     val a3 = new Person("Adarsh")
     println(a3)

   }
 }
