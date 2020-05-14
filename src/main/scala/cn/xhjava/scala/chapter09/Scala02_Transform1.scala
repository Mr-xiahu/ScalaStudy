package cn.xhjava.scala.chapter09


//隐式方法
object Scala02_Transform1 {
  def main(args: Array[String]): Unit = {

    //隐式转换
    implicit def transform(mysql: Mysql): Action = {
      new Action
    }

    val mysql = new Mysql
    mysql.select()
    mysql.delete()
  }

}

class Action {
  def delete(): Unit = {
    println("删除")
  }
}

class Mysql {
  def select(): Unit = {
    println("查询")
  }
}
