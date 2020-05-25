package cn.xhjava.scala.chapter060708

//接口
object Scala09_interface3 {
  def main(args: Array[String]): Unit = {
    val user = new Scala09_interface3
    //    MyTriat23
    //    MyTriat13
    //    Scala09_interface3
  }

}

//  特质和混入的父类没有关系,之和当前的混入类有关系;
//  在调用时父类最先执行,然后是特质执行,最后是混入类执行
//  当混入类的父类和混入类同时继承特质时,最先执行特质(只会执行一遍),然后是父类,最后是混入类
trait MyTriat13 {
  println("MyTriat13")

}

class MyTriat23 {
  println("MyTriat23")
}

class Scala09_interface3 extends MyTriat23 with MyTriat13 {
  println("Scala09_interface3")
}


