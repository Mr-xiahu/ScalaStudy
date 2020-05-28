package cn.xhjava.scala.chapter12

/**
  *
  * @author Xiahu
  * @create 2020/5/27
  */
object Scala02_Match1 {
  def main(args: Array[String]): Unit = {
    /**
      * 守卫：如果想要表达匹配某个范围的数据，就需要在模式匹配中增加条件守卫
      */
    for (ch <- "+-3!") {
      var sign = 0
      var digit = 0
      ch match {
        case '+' => sign = 1
        case '-' => sign = -1
        case _ if ch.toString.equals("3") => digit = 3
        case _ => sign = 2
      }
      println(ch + " " + sign + " " + digit)
    }

  }

}
