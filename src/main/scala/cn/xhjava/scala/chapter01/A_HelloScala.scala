package cn.xhjava.scala.chapter01

object A_HelloScala {

  //Scala 源码包含了main方法,在编译后自动形成了public static void main
  //Scala在编译源码时会生成两个字节码文件(例如：HelloScala,HelloScala$),
  //HelloScala中的静态main方法会去调用HelloScala$内的成员main方法
  //为什么会这样呢？
  //Scala是完全面向对象的语言,没有静态的语法,只能通过模拟来生成静态方法
  //编译时将当前内生成一个特殊的类----->A_HelloScala$,随后在创建对面来调用main方法

  //一般情况下,将加 $ 的类的对象称之为"伴生对象",伴生对象中的内容可以通过类名访问,来模拟java中的静态语法
  def main(args: Array[String]): Unit = {
    println("Hello Scala")
  }

  /**
    * 伴生对象的语法规则:  使用object 修饰
    *
    * scala中没有"public"关键字,默认的所有访问权限都是公共的
    *
    * scala中没有"void"关键字,采用特殊的对象模拟"Unit"
    *
    * scala中声明方法采用关键字"def"
    *
    * 方法后的小括号是方法的参数列表.scala中的参数列表的声明方法与java不一样
    *
    * java : 数据类型  参数名称
    * scala: 参数名称  数据类型
    *
    * java中方法的声明与方法体直接连接
    * scala中方法的声明与方法体使用" = "连接
    *
    * java中返回值的类型放在方法声明之前,直接连接
    * scala中返回值的类型放置在方法声明后,使用" : "连接
    *
    */
}
