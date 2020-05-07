package cn.xhajva.scala.chapter060708

//类的方法
//方法:就是在类中声明函数.但是在调用方式上是存在区别的;
object Scala06_Method {
  def main(args: Array[String]): Unit = {
    //方法的调用需要声明对象
    val use = new Scala06_Method
    use.login()
  }
}

class Scala06_Method {

  //声明一个login方法
  def login(): Unit = {

  }

  def logout: Boolean = {
    false
  }


}

