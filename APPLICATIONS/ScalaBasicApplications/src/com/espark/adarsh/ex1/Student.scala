package com.espark.adarsh.ex1

/**
 * Created by Adarsh on 9/7/15.
 */
class Student {

  var studentId: Int = 0;

  var studentName: String = null;

  var studentEmail: String = null;

  def this(studentId: Int, studentName: String, studentEmail: String) = {
    this();
    this.studentId = studentId;
    this.studentName = studentName;
    this.studentEmail = studentEmail;
  }

  def getStudentId(): Int = {
    return this.studentId;
  }

  def setStudentId(studentId: Int) {
    this.studentId = studentId;
  }

  def getStudentName(): String = {
    return this.studentName;
  }

  def setStudentName(studentName: String) {
    this.studentName = studentName;
  }

  def getStudentEmail(): String = {
    return this.studentEmail;
  }

  def setStudentEmail(studentEmail: String) {
    this.studentEmail = studentEmail;
  }

  def getStudentData(): String = {
    return "\nStudent Id=> " + this.getStudentId() + "\nStudent Name=> " + this.getStudentName() + "\nStudent Email=> " + this.getStudentEmail();
  }

  override def toString: String = {
    return "%s %s, age %d".format(this.studentName, this.studentEmail, this.studentId)
  }

}
