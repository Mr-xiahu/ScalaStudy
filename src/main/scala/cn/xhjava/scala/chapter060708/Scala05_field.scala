package cn.xhajva.scala.chapter060708

//类的属性
object Scala05_field {
  def main(args: Array[String]): Unit = {
    val user = new Scala05_field
    println(user.username)

    //println(user.age)
  }
}


class Scala05_field {
  //声明属性
  //scala中给类声明属性,默认是私有的,但是底层提供了公共的getter,setter方法
  var username: String = _

  //如果给属性增量paivate修饰符,那么属性无法在外部访问,因为底层生成的getter,setter方法都是私有的
  private var age: Int = _

  //如果声明的属性使用的是val修饰,那么属性是私有的,并且使用final修饰,底层只提供了getter方法,没有setter方法
  val emaill: String = "xxxx"
}

//todo scala中也有4中访问权限
//1.public 2.protected 3.default(package) 4.private
//public :默认的访问权限,没有关键字
//protected : 只能是子类访问,同包的类不能访问
//private :私有访问权限,只能当前类访问
//包访问权限需要采用特殊的语法规则-->private[包名]  指定的包下可以访问,其他包不可以

package P1 {
  package P2 {

    class User05 {
      var username: String = _
      private val age: Int = 10
      protected var email = "xiahu@123"
      private[P2] var address = "xxxxx"
    }

  }

  package P3 {

    import cn.xhajva.scala.chapter060708.P1.P2.{User05}

    class EmpP3 {
      val user = new User05
      user.username
      //此处:只有username才能访问,为什么呢?
      //1.username使用的是默认的public修饰,都可以访问
      //2.age 使用的是private修饰,只有在User2类中才能访问
      //3.emall使用的是protected修饰,在scala中只有子类才能访问
      //4.address使用default(缺省)的写法,只允许P2包下的类才能访问
    }

  }

}