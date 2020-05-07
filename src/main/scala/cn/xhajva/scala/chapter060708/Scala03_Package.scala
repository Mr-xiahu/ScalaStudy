package cn.xhajva.scala.chapter060708

//scala中的包声明方式默认与java一致,但是还有其他的方法

//1.在同一个源码内,可以多次声明包,声明的类在最后一个package
//源码中的类所在的位置不需要与包路径相同
//2.scala中所有的语法都能进行嵌套
//package可以使用{}.在{}声明的类就在这个包中,不在{}声明的类就不在包中
//3.scala中可以声明父包与子包,子类可以直接访问,不用导包
//4.scala中可以声明类,但是不允许声明变量,方法(函数)
//5.scala为了弥补包的不足,使用了包对象的概念
package test {

  class User {}

  //  val name = ""
  //  def login(){
  //
  //}

  //在包对象里面可以声明函数,方法,变量
  package object test2 {
    val name = ""

    def login(){}
  }

}

object Scala03_Package {
  def main(args: Array[String]): Unit = {
    println("^_^")
  }
}