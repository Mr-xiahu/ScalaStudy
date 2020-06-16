package cn.xhjava.scala.chapter05

import scala.util.control.Breaks

/**
  *
  * @author Xiahu
  * @create 2020/5/31
  */
object Scala04_AbstractFuncation {
  def main(args: Array[String]): Unit = {
    Breaks.breakable {
      for (i <- args) {
        Breaks.break()
      }
    }


    //函数作为参数传递给另外一个函数,如果这个函数不需要参数,也不需要返回值,那么可以直接传递代码逻辑

    //声明方式: =>Unit
    def test(b: Boolean)(f: () => Unit): Unit = {

    }

//    test(true) {
//      println("xxxxxxxxxxxx")
//    }


  }

}
