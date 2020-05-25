package cn.xhjava.scala.chapter10


//元组
object Scala06_Tuple {
  def main(args: Array[String]): Unit = {
    //Tuple:元组
    //将无关的数据当成一个整体来使用,可以使用Tuple
    val user: (String, Int, String) = ("zhangsan", 20, "男")
    //访问元组中的元素,只需要调用对应编号
    println(user._1)
    println(user._2)
    println(user._3)

    //循环
    for (elt <- user.productIterator) {
      println(elt)
    }

    //如果元组中的元素个数为2,那么称之为对偶,类似于Map中的键值对
    val tupleMap: Map[Int, String] = Map((1, "2"))
    //对偶的遍历
    tupleMap.foreach(e => println(e._1))
  }

}
