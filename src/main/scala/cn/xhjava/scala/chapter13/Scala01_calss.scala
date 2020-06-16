package cn.xhjava.scala.chapter13

/**
  *
  * @author Xiahu
  * @create 2020/6/16
  */

//scala 泛型
object Scala01_calss {
  def main(args: Array[String]): Unit = {
    test[Scala_Person](new Scala_Person)
  }

  def test[T](t: T) = {
    println(t)
  }


  // <: 表示泛型的上界,在传递数据时,只能传递当前类或者该类的子类,类似于java 中的 extends
  def test2[T <: Scala_User](t: T): Unit = {

  }

  // >: 表示泛型的下界,在传递数据时,和java不太一样,什么都可以传递
  def test3[T >: Scala_Person](t: T): Unit = {

  }
}

class Scala_Person {

}

class Scala_User extends Scala_Person {

}
