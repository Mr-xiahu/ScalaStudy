package cn.xhjava.scala.chapter09

object Scala01_Transform {
  def main(args: Array[String]): Unit = {
    /**
      * 自动转换--->隐式转换
      * scala默认的情况下支持数值类型的自动转换
      * byte -->short-->int-->long
      * scala默认情况下支持多态语法中的类型转换
      * child-->parent--->trait(interface)
      */

    //scala允许开发人员自定义类型转换规则
    //将两个无关的类型通过编程手段让他们自动转换

    //隐式转换
    implicit def transform(d: Double): Int = {
      d.toInt
    }

    /*
    在相同的作用域内,不能存在两个相同的隐式转换
    implicit def transform2(d: Double): Int = {
      d.toInt
    }
    */

    var a: Int = 5.0
    println(a)
  }

}
