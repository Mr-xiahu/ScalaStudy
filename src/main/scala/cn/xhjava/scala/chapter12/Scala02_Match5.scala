package cn.xhjava.scala.chapter12

/**
  *
  * @author Xiahu
  * @create 2020/5/27
  */
//样例类
/**
  * 样例类仍然是类
  * 样例类用case关键字进行声明。
  * 样例类是为模式匹配(对象)而优化的类
  * 构造器中的每一个参数都成为val——除非它被显式地声明为var
  * 在样例类对应的伴生对象中提供apply方法让你不用new关键字就能构造出相应的对象
  * 提供unapply方法让模式匹配可以工作
  * 将自动生成toString、equals、hashCode和copy方法(有点类似模板类，直接给生成，供程序员使用)
  * 除上述外，样例类和其他类完全一样。你可以添加方法和字段，扩展它们
  */
object Scala02_Match5 {

  def main(args: Array[String]): Unit = {
    for (amt <- Array(Dollar(1000.0), Currency(1000.0, "RMB"), NoAmount)) {
      val result = amt match {
        case Dollar(v) => "$" + v
        case Currency(v, u) => v + " " + u
        case NoAmount => ""
      }
      println(amt + ": " + result)
    }

    //创建一个与现有对象值相同的新对象 ，并可以通过带名参数来修改某些属性
    val amt = Currency(29.95, "RMB")

    val amt1 = amt.copy()
    val amt2 = amt.copy(value = 19.95)
    val amt3 = amt.copy(unit = "英镑")

    println(amt)
    println(amt2)
    println(amt3)


  }

}


abstract class Amount

//可以这样理解样例类，就是样例类会默认其它很多的方法，供程序员直接使用
case class Dollar(value: Double) extends Amount

case class Currency(value: Double, unit: String) extends Amount

case object NoAmount extends Amount



//密封类
//如果想让case类的所有子类都必须在申明该类的相同的源文件中定义，可以将样例类的通用超类声明为sealed，这个超类称之为密封类。
//密封就是不能在其他文件中定义子类。

abstract sealed class Amount2
case class Dollar2(value: Double) extends Amount2

case class Currency2(value: Double, unit: String) extends Amount2

case object NoAmount2 extends Amount2

