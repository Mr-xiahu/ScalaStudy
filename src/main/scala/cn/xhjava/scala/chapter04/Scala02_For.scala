package cn.xhjava.scala.chapter04

import scala.util.control.Breaks

/**
  *
  * @author Xiahu
  * @create 2020/5/31
  */

//流程控制
object Sala02_For {
  def main(args: Array[String]): Unit = {
    //for 循环
    //基本用法
    // 1 to 10 ---->(1,2,3,4,...,10)
    for (i <- 1 to 10) {
      println(i)
    }
    println("=====================================================")
    // 1 until 10 ---->(1,2,3,4,...,9)
    for (i <- 1 until 10) {
      println(i)
    }
    println("=====================================================")
    // Range(1, 10) ---->(1,2,3,4,...,9)
    for (i <- Range(1, 10)) {
      println(i)
    }
    println("=====================================================")
    //杨辉三角
    for (i <- Range(1, 18, 2)) {
      println(" " * ((18 - i) / 2) + "*" * i + " " * ((18 - i) / 2))
    }
    println("=====================================================")
    //todo 循环守卫
    //循环守卫就是增加一个if判断,如果满足则执行,不满足测跳过,类似于continue
    for (i <- 1 to 10 if (i % 2 == 0)) {
      println(i)
    }

    println("=====================================================")
    //todo break
    //中断循环,scala中没有break关键字,使用对象中断
    Breaks.breakable({
      for (i <- 1 to 10) {
        if (i == 5) {
          Breaks.break() //Exception in thread "main" scala.util.control.BreakControl
        }
        println(i)
      }
    })
    //循环结束
    println("循环结束")

  }
}
