package cn.xhjava.scala.chapter060708

//伴生类(成员)
object Scala06_Demo {
  def main(args: Array[String]): Unit = {
    //使用伴生对象来创建伴生对象类
    val student = Scala06_Student
    println(student) //默认调用Scala06_Student的apply()

    val student2 = Scala06_Student("zhangsan")
    println(student2)
  }
}




