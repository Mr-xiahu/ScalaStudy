package cn.xhjava.scala.chapter060708

//特质继承类
object Scala09_interface6 {
  def main(args: Array[String]): Unit = {
//    val mysql = new Mysql with Insert4
//    mysql.insert()
  }

}

trait Insert4 {

  //限定特质使用范围
  this: Exception =>
  def insert() = {
    println("插入数据......")
    this.getMessage()
  }
}

class Mysql4 extends Exception with Insert4 {

}



