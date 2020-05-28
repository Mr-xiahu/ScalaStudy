package cn.xhjava.scala.chapter12

/**
  *
  * @author Xiahu
  * @create 2020/5/27
  */
object Scala02_Match2 {
  def main(args: Array[String]): Unit = {
    /**
      * 可以匹配对象的任意类型，这样做避免了使用isInstanceOf和asInstanceOf方法
      */
    val a = 5
    val obj = if (a == 1) 1
    else if (a == 2) "2"
    else if (a == 3) BigInt(3)
    else if (a == 4) Map("aa" -> 1)
    else if (a == 5) Map(1 -> "aa")
    else if (a == 6) Array(1, 2, 3)
    else if (a == 7) Array("aa", 1)
    else if (a == 8) Array("aa")

    /**
      * Map[String, Int] 和Map[Int, String]是两种不同的类型，
      * 在匹配时,只匹配类型（Map,Array）,
      * 不去比较到底是Map[String, Int],还是Map[Int, String]
      */

    val result = obj match {
      case a: Int => a
      case b: Map[String, Int] => "对象是一个字符串-数字的Map集合"
      case c: Map[Int, String] => "对象是一个数字-字符串的Map集合"
      case d: Array[String] => "对象是一个字符串数组"
      case e: Array[Int] => "对象是一个数字数组"
      case f: BigInt => Int.MaxValue
      case _ => "啥也不是"
    }
    println(result)

  }

}
