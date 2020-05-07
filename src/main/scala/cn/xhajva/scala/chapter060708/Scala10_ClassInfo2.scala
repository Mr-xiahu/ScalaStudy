package cn.xhajva.scala.chapter060708

//scala会自动导入scala包中的类
object Scala10_ClassInfo2 extends App {
  //不需要main方法即可执行,类似于SpingBoot
  println("aaa")
//  println(MyColor.RED)
}

//枚举
class MyColor extends Enumeration {
  val RED = Value(1, "red")
  val YELLOW = Value(2, "YELLOW")
  val GREEN = Value(3, "GREEN")
}




