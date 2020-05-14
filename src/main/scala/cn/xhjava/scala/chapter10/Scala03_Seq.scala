package cn.xhjava.scala.chapter10

import scala.collection.mutable
import scala.collection.mutable.{ArrayBuffer, ListBuffer}

//序列
object Scala03_Seq {
  def main(args: Array[String]): Unit = {
    //TODO 不可变集合
    //Scala默认的集合都是不可变的
    val list: List[Int] = List(1, 2, 3, 4)
    //通过索引获取数据
    println(list(0))
    //增加数据
    val list2: List[Int] = list :+ 1
    val list3: List[Int] = 1 +: list
    println(list2.mkString(",")) //1,2,3,4,1
    println(list3.mkString(",")) //1,1,2,3,4

    val list4: List[Int] = list2 ++ list3
    println(list4.mkString(",")) //1,2,3,4,1,1,1,2,3,4

    //list 中的' : '运算符的运算顺序是从右到左
    val list5: List[Int] = (7 :: (6 :: (5 :: list)))
    println(list5.mkString(",")) //7,6,5,1,2,3,4

    //val list6: List[Any] = 8 :: list2 :: list
    //println(list6.mkString(","))//8,List(1, 2, 3, 4, 1),1,2,3,4
    val list6: List[Any] = 8 :: list2 ::: list
    println(list6.mkString(",")) //8,1,2,3,4,1,1,2,3,4

    //特殊的集合
    println(List()) //List()
    println(Nil) //List()

    //修改
    val list7: List[Int] = list.updated(1, 10)
    //删除
    val list8: List[Int] = list.drop(1)


    //TODO 可变序列
    val listBuffer: ListBuffer[Int] = ListBuffer(1, 2, 3, 4)
    println(listBuffer.head)//1
    println(listBuffer.last)//4

    println(listBuffer.tail)//2,3,4
    println(listBuffer.init)//1,2,3

    //TODO Queue
    val queue: mutable.Queue[Int] = mutable.Queue(1,2,3,4)
    //添加元素
    queue.enqueue(5)
    println(queue)//Queue(1, 2, 3, 4, 5)
    //
    queue.dequeue()
    println(queue)//Queue(2, 3, 4, 5)
  }

}
