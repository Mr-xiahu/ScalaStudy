package cn.xhjava.scala.chapter05

/**
  *
  * @author Xiahu
  * @create 2020/5/31
  */
object Scala01_function06 {
  def main(args: Array[String]): Unit = {
    //scala是完全面向函数式编程的语言

    //函数可以赋值给变量
    //函数可以作为另外一个函数的参数
    //函数可以作为另外一个函数的返回值

    def result(): Unit = {
      println("这是一个作为返回值的函数")
    }

    def test() = {
      //此时我想将result函数返回
      //现在我没有在result函数后面加().按照之前的逻辑,没有加()的函数时不会执行的
      //但是,因为result函数是无参数函数,所以不加()也自动执行了
      //result//输出----->这是一个作为返回值的函数
      //如果仅仅只想让其返回result 怎么办呢?需要加特殊的符号 _
      result _
    }

    val function: () => Unit = test()

    //简化版
    def test2() = {
      def result2(): Unit = {
        println("xxxxxx")
      }

      result2 _
    }

    val function2: () => Unit = test2()

    //todo 函数柯里化
    def test3(i: Int)(j: Int) {
      println(i * j)
    }

    test3(2)(3) //6

    //todo 闭包
    //一个函数在实现逻辑时,将函数外部的变量引入到函数内部,改变这个变量的生命周期,称之为闭包
    def test4(i: Int) = {
      def result(j: Int) = {
        i * j
      }

      result _
    }

    println(test4(3)(3))


    //函数作为参数
    //将函数作为参数传递给另外一个参数,需要特殊的生命方式
    // ()=>Unit   参数列表 => 返回值
    def test5(func: () => Int): Int = {
      func() + 10
    }

    def test6(func: (Int) => Int): Int = {
      func(20) + 10
    }

    def func(): Int = {
      10
    }

    def func2(i: Int): Int = {
      i
    }

    val i: Int = test5(func)
    println(i)
    println(test6(func2))


    //使用匿名函数
    def test7(f: () => Unit): Unit = {
      f()
    }

    test7(() => {
      println("test777777777777")
    })


    //函数的简化
    def test8(fun: (Int) => Unit): Unit = {
      println(fun)
    }

    def func8(i: Int): Int = {
      i + 10
    }

    //最初版
    test8((i) => {
      println(i)
    })
    //升级版
    test8((i) => println(i))
    //再次升级版
    test8(println(_))
    //最终版
    test8(println)

    //=========================================================
    //test
    def f7(f: (Int, Int) => Int): Int = {
      f(10, 10)
    }

    def f8(i: Int, j: Int): Int = {
      i + j
    }

    println(f7(f8))

    //使用匿名函数调用
    println(f7((i: Int, j: Int) => {
      i + j
    }))
    //简化
    println(f7((i, j) => {
      i + j
    }))
    //再次简化
    println(f7((i, j) => i + j))
    //最终版
    println(f7(_ + _))


    //=========================================================

  }

}
