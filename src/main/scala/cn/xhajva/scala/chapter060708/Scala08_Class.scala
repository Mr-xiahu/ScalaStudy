package cn.xhajva.scala.chapter060708

//class
object Scala08_Class {
  def main(args: Array[String]): Unit = {
    val user = new Scala08_Class
    user.username
  }
}

//声明类
//类可以声明为抽象的
abstract class Person {

  //scala中属性也可以重写,因为属性也是抽象的
  var username: String = _

  //声明抽象方法,方法只有声明,没有实现,不需要abstract关键字声明
  //Scala中也存在动态绑定的概念:https://blog.csdn.net/weixin_44865574/article/details/105798861
  def test1()
}

class Scala08_Class extends Person {

  //重写抽象方法,只需要补全即可
  def test(): Unit = {

  }

  //TODO scala如果重写父类的抽象方法,需要增加override关键字
  override def test1(): Unit = {

  }
}