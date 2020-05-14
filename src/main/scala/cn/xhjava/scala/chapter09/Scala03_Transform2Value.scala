package cn.xhjava.scala.chapter09


//隐式值
object Scala03_Transform2Value {
  def main(args: Array[String]): Unit = {

    //隐式值
    implicit val name: String = "zhangsan"

    //如果传递了参数,就使用参数,否则,使用默认值
    //隐式参数
    def test(implicit name: String = "xiahu"): Unit = {
      println("Hello " + name)
    }

    test //Hello zhangsan //
    test() //Hello xiahu方法调用时,使用小括号会导致隐式值无法传递

    //如果隐式参数存在默认值和对应类型的隐式值,会优先使用隐式值,如果找不到隐式值,才使用默认值
  }

}

