package cn.xhjava.scala.chapter02

/**
  *
  * @author Xiahu
  * @create 2020/5/31
  */
object Scala01_DataType {
  def main(args: Array[String]): Unit = {
    //标识符
    //scala 中可以使用特殊的符号,其实是在编译的时候将这些符号进行转换
    val +- = 123

    //scala 中,可以使用 _ 作为变量名
    val  _ = 123
    //但是你在打印该变量的时候会报错
    //scala 中 '_'有特殊的用法,不能独立使用
//    println(_)

  }

}
