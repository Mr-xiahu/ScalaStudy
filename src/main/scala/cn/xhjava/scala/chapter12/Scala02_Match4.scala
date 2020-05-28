package cn.xhjava.scala.chapter12

/**
  *
  * @author Xiahu
  * @create 2020/5/27
  */
object Scala02_Match4 {

  def main(args: Array[String]): Unit = {
    //特殊的模式匹配
    val (name, age, sex) = ("张三", 18, "男")
    println(sex)
    // 包含了2个连续的运算符
    val (q, r) = BigInt(10) /% 3
    println(q)
    println(r)

    //for循环的模式匹配
    val list = List((1, "a"), (2, "b"), (3, "c"))
    for ((k, v) <- list) {
      println(k + "-->" + v)
    }


  }

}
