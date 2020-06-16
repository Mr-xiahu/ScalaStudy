package cn.xhjava.scala.chapter05

/**
  *
  * @author Xiahu
  * @create 2020/5/31
  */
object Scala01_function05 {
  def main(args: Array[String]): Unit = {
    //函数式编程-扩展
    //可变参数
    def test(name: String*): Unit = {
      println(name)
    }

    //调用函数时,可以传入多个参数,也可以不传入
    test()
    test("zhangsan", "list")

    //默认参数
    //如果希望函数中的某一个参数使用默认值,那么可以在函数声明时直接赋值
    def test2(name: String, age: Int = 20): Unit = {
      println(name + "-" + age)
    }

    test2("zhangsan")
    test2("zhangsan", 30)

  }

}
