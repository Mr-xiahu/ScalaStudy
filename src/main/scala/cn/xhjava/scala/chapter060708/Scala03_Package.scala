package cn.xhjava.scala.chapter060708

//scala中的包声明方式默认与java一致,但是还有其他的方法

object Scala03_Package {
  def main(args: Array[String]): Unit = {
    println("^_^")
  }
}

  //  val name = ""
  //  def login(){
  //
  //}

  //在包对象里面可以声明函数,方法,变量
  class User {}

package object test2 {
    val name = ""

    def login(){}
  }