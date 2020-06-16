package cn.xhjava.scala.chapter05

/**
  *
  * @author Xiahu
  * @create 2020/5/31
  */
object Scala01_function03 {
  def main(args: Array[String]): Unit = {
    //scala可以采用自动推断功能,所以可以简化函数

    //1.如果函数声明时,确定无返回值,那么即使函数return 也没有作用
    def test(): Unit = {
      return "zhangsan"
    }

    //2.如果函数体的最后一行代码进行返回,那么return关键字可以省略
    def test2(): String = {
      "zhangsan"
    }

    //3,如果可以根据函数的最后一行代码推断类型,那么函数返回值类型可以省略
    def test3() {
      "张三"
    }

    //4.如果函数体只有一行代码,大括号可以省略
    def test4() = "李四"

    //5.如果函数声明中没有参数列表,小括号也可以省略
    //如果函数小括号省略,那么调用函数时不能增加小括号
    def test5 = "王五"

    println(test5)

  }

}
