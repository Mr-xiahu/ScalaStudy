package cn.xhajva.scala.chapter060708

//构造方法
object Scala07_Construct {
  def main(args: Array[String]): Unit = {
    val user = new Scala07_Construct
    println(user)
  }
}

//TODO scala内构造方法分为两类: 主构造方法 & 辅助构造方法

//scala 可以通过辅助构造方法构造对象,但是最后肯定会走主构造方法
//默认情况下,scala也是给类提供无参构造方法
//主构造方法:在类后声明的构造方法
//辅助构造方法:在主构造方法内声明的构造方法
class Scala07_Construct(name: String) {
  //类体 = 构造方法体
  println("主构造方法:" + name)

  def this(ss: String, age: Int) {
    this(ss)
    println("辅助构造方法1")
  }


  //声明辅助构造方法,方法名: this
  //构造方法调用其他构造方法时,应该保证被调用的方法已经声明
  def this() {
    this("wnagwu", 18)
    println("辅助构造方法2")
  }


}


//scala 是完全面向函数的语言,所有类也是函数
//类所代表的函数其实这个类的构造方法
/**
  * class User9():String = {
  * =:在函数无返回值时可以省略
  * String:在函数明确返回值类型时可以省略
  * ()在函数没有参数时可以省略
  * 所以 其实class 也是一个函数
  * }
  **/


