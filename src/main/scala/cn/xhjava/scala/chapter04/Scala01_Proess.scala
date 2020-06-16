package cn.xhjava.scala.chapter04

/**
  *
  * @author Xiahu
  * @create 2020/5/31
  */

//流程控制
object Sala01_Proess {
  def main(args: Array[String]): Unit = {
    //单分支
    val flag = true
    if (flag) {
      println("true")
    }

    //双分支
    if (flag) {
      println("true")
    } else {
      println("false")
    }

    //多分支
    if (flag) {
      println("true")
    } else if (flag == false) {
      println("false")
    } else {
      println("啊哈~~~~")
    }

    //从控制台读取输入内容
    val str: String = Console.readLine()
    println(str)

  }
}
