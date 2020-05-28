package cn.xhjava.scala.chapter10

import scala.collection.mutable

//集合常用的方法
object Scala08_Method1 {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1, 2, 3, 4, 5)

    //reduce 将集合内的数据经过逻辑处理后只保留一个结果,具体的结果得参考逻辑
    //    val i: Int = list.reduce((left, right) => {
    //      left + right
    //    })

    //val i: Int = list.reduce((left, right) => {left + right})
    val i: Int = list.reduce(_ + _)
    println(i)

    //折叠 也可以对集合数据进行简化,获取最终一条数据
    // fold 方法可以传递2个部分的参数,第一个部分表示集合之外的数据
    // 第二部分的参数表示数据进行的逻辑处理
    val fold: Int = list.fold(100)(_ + _)
    println(fold)


    //将两个Map进行合并,相同的Key做累加，不相同的key直接增加
    val map1: mutable.Map[String, Int] = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
    val map2: mutable.Map[String, Int] = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
    val stringToInt: mutable.Map[String, Int] = map1.foldLeft(map2)((map1, t) => {
      map1(t._1) = map1.getOrElse(t._1, 0) + t._2
      map1
    })
    println(stringToInt)

  }

}
