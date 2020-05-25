package cn.xhjava.scala.chapter060708

//接口
//scala中没有接口的概念,有特质(trait)的概念，类似于接口
object Scala09_interface {
  def main(args: Array[String]): Unit = {

  }

}

//声明特质,特质是可以继承的
trait MyTriat {

}

trait MyTriat2 {

}

//如果类继承多个triat,采用with连接
//如果类同时存在多个父类跟特质,还是采用继承,但是继承父类,with特质
class Scala09_interface extends MyTriat with MyTriat2 {

}


