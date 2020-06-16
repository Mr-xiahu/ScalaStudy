package cn.xhjava.scala.chapter04

/**
  *
  * @author Xiahu
  * @create 2020/5/31
  */

//流程控制
object Sala01_Proess2 {
  def main(args: Array[String]): Unit = {
    //todo scala中所有表达式都有返回值
    //具体的返回值是:逻辑运算后最后一行代码的返回值
    val flag = true
    val result: Any = if (flag) {
      "abc" //返回为String
    } //返回为Unit

    //所有最后result的类型为: Any

    val result2: String = if (flag) {
      "abc" //返回为String
    } else {
      "def" //返回为String
    }
    //所有最后result的类型为: 返回为String


    val result3: Any = if (flag) {
      "abc"
      println("abc") //返回为Any
    } else {
      "def" //返回为String
    }
    //所有最后result的类型为: 返回为Any
    println(result3)
  }
}
