package cn.xhjava.scala.chapter09


//隐式值
object Scala03_Transform2Value {
  def main(args: Array[String]): Unit = {

    //如果传递了参数,就使用参数,否则,使用默认值
    def test(implicit name: String = "xiahu"): Unit = {
      println("Hello " + name)
    }

    test
  }

}

