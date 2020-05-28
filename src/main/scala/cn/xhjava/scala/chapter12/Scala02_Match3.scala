package cn.xhjava.scala.chapter12

/**
  *
  * @author Xiahu
  * @create 2020/5/27
  */
object Scala02_Match3 {

  def main(args: Array[String]): Unit = {
    //匹配数组
    val array = Array(Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0), Array(1, 1, 0, 1))
    for (arr <- array) {
      val result = arr match {
        case Array(0) => "0"
        case Array(x, y) => x + "=" + y
        case Array(0, _*) => "以0开头和数组"
        case _ => "什么集合都不是"
      }
      println("result = " + result)

      //匹配列表
      for (list <- Array(List(0), List(1, 0), List(0, 0, 0), List(1, 0, 0))) {
        val result = list match {
          case 0 :: Nil => "0" //
          case x :: y :: Nil => x + " " + y
          case 0 :: tail => "0 ..."
          case _ => "something else"
        }
        println(result)
      }

      //匹配元组
      for (pair <- Array((0, 1), (1, 0), (2, 1), (1, 0, 2))) {
        val result = pair match {
          case (0, _) => "0 ..."
          case (y, 0) => y
          case (a, b) => (b, a)
          case _ => "other"
        }
        println(result)
      }

      //对象匹配
      object Square {
        //case中对象的unapply方法(对象提取器)
        //返回Some集合则为匹配成功
        //返回none集合则为匹配失败
        def unapply(z: Double): Option[Double] = Some(math.sqrt(z))//此处返回的是Some,即为成功

        def apply(z: Double): Double = z * z
      }

      /**
        * 构建对象时apply会被调用 ，比如 val n1 = Square(5)
        *
        * 当将 Square(n) 写在 case 后时[case Square(n) => xxx]，会默认调用unapply 方法(对象提取器)
        *
        * number 会被 传递给def unapply(z: Double) 的 z 形参
        *
        * 如果返回的是Some集合，则unapply提取器返回的结果会返回给n这个形参
        *
        * case中对象的unapply方法(提取器)返回some集合则为匹配成功
        *
        * 返回none集合则为匹配失败
        */

      // 模式匹配使用：
      val number: Double = 36.0
      number match {
        case Square(n) => println(n)
        case _ => println("nothing matched")
      }


    }

  }

}
