package cn.xhjava.scala.chapter10

//集合常用的方法
object Scala07_Method {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1, 2, 3, 4, 5, 4, 3, 2, 1)

    println("和:" + list.sum)
    println("最大值:" + list.max)
    println("最小值:" + list.min)
    println("乘积:" + list.product)
    //反转
    println(list.reverse.mkString(","))
    //分区(通过函数的返回值分组)
    val groupBy: Map[Int, List[Int]] = list.groupBy[Int](x => x)
    groupBy.foreach(x => {
      println(x._1 + "=" + x._2)
    })

    //排序,按照指定规则(根据返回值排序)
    val sortBy: List[Int] = list.sortBy(x => x)
    println(sortBy.mkString(","))
    //升序,降序排序
    //升序
    val sort1: List[Int] = list.sortWith((x, y) => {
      x < y
    })
    //降序
    val sort2: List[Int] = list.sortWith((x, y) => {
      x > y
    })
    println(sort2.mkString(","))

    //迭代
    val iterator: Iterator[Int] = list.iterator
    while (iterator.hasNext) {
      println(iterator.next())
    }

    //map 转换
    val tuples: List[(Int, Int)] = list.map((_, 1))

    //reduce



  }

}
