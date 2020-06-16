package cn.xhjava.scala.chapter05

/**
  *
  * @author Xiahu
  * @create 2020/5/31
  */
object Scala03_PartialFuncation {
  def main(args: Array[String]): Unit = {
    //偏函数

    //需求: 将List(1,2,3,4,"abc") 返回为List(2,3,4,5)
    val list = List(1, 2, 3, 4, "abc")
    val list2: List[AnyVal] = list.map(x => {
      if (x.isInstanceOf[Int]) {
        x.asInstanceOf[Int] + 1
      }
    })

    val list3: List[AnyVal] = list2.filter(x => x.isInstanceOf[Int])
    println(list3)

    //todo 偏函数:对于符合某个条件,但不是所有情况进行操作
    //将包装在大括号内的一组case语句封装为函数,称之为偏函数
    def addOne = new PartialFunction[Any, Int] {
      override def apply(v1: Any): Int = {
        v1.asInstanceOf[Int] + 1
      }

      override def isDefinedAt(x: Any): Boolean = {
        if (x.isInstanceOf[Int]) {
          true
        } else false
      }
    }

    val list5: List[Int] = list.collect(addOne)
    println(list5)

    //map 不能执行偏函数操作,因为map方法是对每一个数据都进行操作,不能只对一部分数据进行操作

    //使用case简化
    val list6: List[Int] = list.collect {
      case i: Int => i + 1
    }
    println(list6)
  }

}
