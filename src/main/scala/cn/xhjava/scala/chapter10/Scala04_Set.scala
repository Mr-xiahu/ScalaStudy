package cn.xhjava.scala.chapter10

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

//Set
object Scala04_Set {
  def main(args: Array[String]): Unit = {
    //Set 集合,无序,不可重复
    //默认scala提供的set集合就是不可变的

    //不可变Set
    val set: Set[Int] = Set(1, 2, 3, 1, 23, 4, 1, 23, 1, 6, 342)
    println(set.mkString(","))
    //add
    println(set + 11)
    //delete
    println(set - 2)
    //遍历
    for (ele <- set) {
      println(ele)
    }


    //可变Set集合
    val mutableSet: mutable.Set[Int] = mutable.Set(1, 2, 3, 1, 2, 3)
    //基本与不可变Set一致
  }

}
