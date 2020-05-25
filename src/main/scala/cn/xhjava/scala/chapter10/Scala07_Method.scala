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


    //take  获取集合的前N个
    val ints: List[Int] = list.take(10)

    //WordCount
    val wordList = List("hello", "scala", "hello", "spark", "hello", "world", "scala")
    //1.分组
    val groupByWordMap: Map[String, List[String]] = wordList.groupBy(x => x)
    //2.转换格式
    val wordAndCount: Map[String, Int] = groupByWordMap.map(element => {
      (element._1, element._2.size)
    })
    //3.排序
    val sortList: List[(String, Int)] = wordAndCount.toList.sortWith((left, right) => {
      left._2 > right._2
    })
    sortList.take(2).foreach(println(_))


    //扁平化操作:将一个整体的内容拆成一个一个的个体
    val list2 = List("ni hao ya", "wo hen hao", "zhen de ma")

    val strings: List[String] = list2.flatMap(_.split(" "))

    //过滤 可以整除2的留下来
    val intss: List[Int] = list.filter(x => {
      x % 2 == 0
    })


    //zip 拉链
    val list3 = List(1, 2, 3)
    val list4 = List(4, 5, 6)
    val tuple3: List[(Int, Int)] = list3.zip(list4)

    //union 集合并集
    val list5: List[Int] = list3.union(list4)

    //集合交集
    list3.intersect(list4)


    //集合差集
    list3.diff(list4)

    //reduce


  }

}
