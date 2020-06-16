package cn.xhjava.scala.chapter05

/**
  *
  * @author Xiahu
  * @create 2020/5/31
  */
object Scala02_RecursionFunction {
  def main(args: Array[String]): Unit = {
    //递归函数

    //阶乘
    def jiechen(num: Int): Int = {
      if (num == 1) {
        1
      } else {
        num * jiechen(num - 1)
      }

    }

    println(jiechen(3))

  }

}
