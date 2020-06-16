package cn.xhjava.scala.chapter13

/**
  *
  * @author Xiahu
  * @create 2020/6/16
  */

//scala 泛型
object Scala02_calss {
  def main(args: Array[String]): Unit = {
    val user: User[Scala_User2] = new User[Scala_User2]

    //默认情况下,scala中的泛型跟java中的泛型是一样的
    //    val user2: User[Scala_User2] = new User[Scala_User]
    //在scala中,为了丰富泛型的功能,提供了协变,逆变的操作
    val user2: User[Scala_User2] = new User[Scala_Student]
    val user3: User2[Scala_Person2] = new User2[Scala_Person2]
  }


}


class User[+Scala_User2] {
  //协变

}

class User2[-Scala_User2] {

}

class Scala_Person2 {

}

class Scala_User2 extends Scala_Person2 {

}

class Scala_Student extends Scala_User2 {

}
