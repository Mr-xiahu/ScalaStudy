package cn.xhajva.scala.chapter060708

//接口
object Scala09_interface2 {
  def main(args: Array[String]): Unit = {

  }

}

//scala特质无法构建对象 !new MyTriat1
//scala特质中是可以执行代码的
//scala特质中声明的属性,方法可以在混入的类中调用
trait MyTriat1 {
  println("xxxx")

  //特质中可以声明抽象方法
  //但是继承的类需要重新抽象方法
  def test()
}

trait MyTriat12 {

}

class Scala09_interface2 extends MyTriat1 with MyTriat12 {
  override def test(): Unit = {

  }
}


