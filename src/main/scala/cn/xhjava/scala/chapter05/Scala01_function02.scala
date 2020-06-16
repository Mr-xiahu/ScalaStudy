package cn.xhjava.scala.chapter05

/**
  *
  * @author Xiahu
  * @create 2020/5/31
  */
object Scala01_function02 {
  //函数
  def main(args: Array[String]): Unit = {
    //函数入参,出参

    //无参无返回值
    def test(): Unit = {
      println("test")
    }

    //有参无返回值
    def test2(s: String): Unit = {
      println(s)
    }

    //有参有返回值
    def test3(s: String): String = {
      s + " zhangsan"
    }

    //无参有返回值
    def test4(): String = {
      "张三"
    }


    //scala中没有throw关键字,所以函数中如果有异常,也不需要在函数声明是抛出


  }

}
