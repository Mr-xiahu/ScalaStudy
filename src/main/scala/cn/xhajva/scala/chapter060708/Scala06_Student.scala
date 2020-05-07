package cn.xhajva.scala.chapter060708


//伴生类(成员)
class Scala06_Student {
  private var username: String = _
}


//伴生对象(静态)
//伴生对象可以访问伴生类的私有属性
object Scala06_Student {
  def apply: Scala06_Student = new Scala06_Student()

  def apply(str: String): Scala06_Student = new Scala06_Student()

}

