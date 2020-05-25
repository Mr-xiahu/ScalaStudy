package cn.xhjava.scala.chapter060708

//动态混入
object Scala09_interface5 {
  def main(args: Array[String]): Unit = {
    val mysql = new Mysql with Insert2
    mysql.insert()
  }

}

trait Insert2 {

  def insert() = {
    println("插入数据......")
  }
}

class Mysql {

}



