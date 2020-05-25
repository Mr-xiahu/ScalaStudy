package cn.xhjava.scala.chapter10

import scala.collection.mutable

//Map
object Scala05_Map {
  def main(args: Array[String]): Unit = {
    //Map 集合: K-v对
    //scala 中k-v对数据采用特殊的方式声明
    val map: Map[Int, Int] = Map(
      1 -> 2,
      2 -> 3,
      3 -> 4)
    //add
    val map2: Map[Int, Int] = map + (4 -> 5)
    println(map2)
    //delete
    val map3: Map[Int, Int] = map - (1)
    println(map3)
    //update
    val map4: Map[Int, Int] = map.updated(1, 10)
    println(map4)
    //遍历
    println(map4.get(10).getOrElse(0))
    //println(map4.get(10).get) java.util.NoSuchElementException: None.get
    //todo scala为了防止出现空指针异常,提供了一个特殊类:Option,
    // 有两个特殊的对象:Some,Node;
    //如果确实没有获取到对象,为了不出现异常,Option给出默认值





    //不可变Map
    val map10: mutable.Map[Int, Int] = mutable.Map(
      1 -> 2,
      2 -> 3,
      4 -> 5
    )
  }

}
