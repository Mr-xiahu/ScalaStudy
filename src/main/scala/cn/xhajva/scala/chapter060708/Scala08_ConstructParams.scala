package cn.xhajva.scala.chapter060708

//构造方法参数
object Scala08_ConstructParams {
  def main(args: Array[String]): Unit = {
    val user = new Scala08_ConstructParams("zhangsan") //zhangsan
    println(user.name) //zhangsan

  }
}

//类构造方法的参数作用域默认是整个类主体,
// 但是如果想要参数作为属性来使用,可以采用特殊的方式声明:var;val
class Scala08_ConstructParams(var name: String) {

  println(name)

}


