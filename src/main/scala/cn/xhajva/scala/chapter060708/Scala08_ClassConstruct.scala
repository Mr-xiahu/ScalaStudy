package cn.xhajva.scala.chapter060708

//父类构造方法
object Scala08_ClassConstruct {
  def main(args: Array[String]): Unit = {
    val user = new User11()
  }
}

class Person2(name: String) {
  println("Person 主构造方法=" + name)
}


//如果父类的主构造方法有参数,那么构建对象时必须显示的传递参数
//可以在集成的父类后面添加(),等同于调用父类的构造方法
class User10(name: String) extends Person2("person") {
  println("User 主构造方法")

  def this() {
    this("张三")
    println("User辅助构造方法")
  }
}

class User11(name: String) extends Person2(name) {
  println("User 主构造方法")

  def this() {
    this("张三")
    println("User辅助构造方法")
  }
}

