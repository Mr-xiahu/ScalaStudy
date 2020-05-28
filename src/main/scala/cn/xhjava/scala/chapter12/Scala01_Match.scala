package cn.xhjava.scala.chapter12

/**
  *
  * @author Xiahu
  * @create 2020/5/27
  */
object Scala01_Match {
  def main(args: Array[String]): Unit = {
    //下划线:_ 的其他用处
    //模式匹配的其他场合:
    // 1.系统给变量赋初始值
    // 2.导包时使用
    // 3.给类起别名
    // 4.代替方法的参数,可以让函数不执行(一般不能这么使用,这样会使该函数无法识别)
    val list = List(List(1, 2, 3), List(4, 5))
    //需求:转变为:List(1,2,3,4,5)
    val ints: List[Int] = list.flatMap(x => x)
    println(ints) //这个使用不能使用 list.flatMap(_),会导致场合4

    val strings = List("hello", "world", "hello", "scala")
    //    val worldList: List[String] = strings.flatMap(x => x.split(" "))
    val worldList: List[String] = strings.flatMap(_.split(" "))
    println(worldList)

    val open = '#'
    val n1 = 10
    val n2 = 20
    open match {
      case '+' => {
        println(n1 + n2)
      }
      case '-' => {
        println(n1 - n2)

      }
      case '*' => {
        println(n1 * n2)

      }
      case '#' => {
        println(n1 / n2)

      }
      //如果所有的case都没有被匹配,则执行 _ 的cese操作，类似与java的default
      //但是如果 case _ 在第一个,默认匹配所有的内容
      case _ => {
        println("没有合适的操作")

      }
    }
  }

}
