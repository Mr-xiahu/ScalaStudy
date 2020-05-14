package cn.xhjava.scala.chapter09

//隐式类
/**
  * 1.隐式类必须被定义在“类”或“伴生对象”或“包对象”里，即隐式类不能是 顶级的(top-level  objects)
  * 2.其所带的构造参数有且只能有一个
  * 3.隐式类不能是case class(样例类)
  * 4.作用域内不能有与之相同名称的标识符
  */
object Scala04_Transform3 {
  def main(args: Array[String]): Unit = {
    val user = new User4
    user.insert()
    user.delete()

    /**
      * 隐式的转换时机:
      * 当方法中的参数的类型与目标类型不一致时(二次编译)
      * 当对象调用所在类中不存在的方法或成员时，编译器会自动将对象进行隐式转换（根据类型）
      */
  }

  implicit class Person4(user: User4) {
    def delete(): Unit = {
      println("删除")
    }
  }

}

class User4 {
  def insert(): Unit = {
    println("添加")

  }
}


