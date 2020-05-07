package cn.xhajva.scala.chapter060708

//面向对象
object Scala02_ObjectDemo {
  def main(args: Array[String]): Unit = {
    //创建类对象
    val user: Scala02_ObjectDemo = new Scala02_ObjectDemo
    //调用对象的方法
    println(user.login())
  }
}

//声明类
class Scala02_ObjectDemo {
  //属性
  var username: String = _ //  _  默认初始化

  var age: Int = _

  def login(): Boolean = {
    true
  }
}