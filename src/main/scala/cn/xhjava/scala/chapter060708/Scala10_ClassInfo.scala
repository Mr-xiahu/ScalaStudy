package cn.xhjava.scala.chapter060708

//类信息
object Scala10_ClassInfo {
  //java 中获取类信息:Object.getClass()
  //Scala中不一样,如果想要回去类信息,需要特殊的方法:classof[type]
  //classof能直接使用,是因为scala.Predef伴生对象是默认导入到当前的开发环境中

  def main(args: Array[String]): Unit = {
    val user: Class[Scala10_ClassInfo] = classOf[Scala10_ClassInfo]
    user.getInterfaces

    //可以使用type关键字为对象起别名
    type aaa = Scala10_ClassInfo
    val user2 = new aaa

    val user3 = new Scala10_ClassInfo
    //判断user3是否是类型,类似于java中的instanceof 关键字
    val bool: Boolean = user3.isInstanceOf[Scala10_ClassInfo]
    val user4: Object = new Scala10_ClassInfo
    //转化类型,类似于java中的强制转换
    val info: Scala10_ClassInfo = user4.asInstanceOf[Scala10_ClassInfo]
  }

}

class Scala10_ClassInfo {

}




