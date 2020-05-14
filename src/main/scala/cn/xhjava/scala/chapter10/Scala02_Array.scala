package cn.xhjava.scala.chapter10

import scala.collection.mutable.ArrayBuffer

//数组
object Scala02_Array {
  def main(args: Array[String]): Unit = {
    //scala 数组,使用array实现,使用Array[type]实现,参考main方法
    val array = Array(1, 2, 3, 4, 5)
    println("第一个元素:" + array(0))
    println("数组长度:" + array.length)
    println("数组长度:" + array.update(4, 10))
    //打印数组内的元素
    array.foreach(println(_))
    for (i <- array)
      println(i)
    //将数组转化为字符串
    println(array.mkString(","))
    //array.foreach((i:Int)=>{println(i)})
    //array.foreach((i)=>{println(i)})
    //array.foreach({println(_)})
    //array.foreach(println(_))
    array.foreach(println)

    //增加元素
    val array2: Array[Int] = array :+ (20)
    array2.foreach(println)

    //数组是不可变的,但是数组可以添加元素,其实不是数组改变了,而是新建的一个数组

    val array4 = Array(1, 2, 3, 4)
    val array5: Array[Int] = array4 :+ (5)
    val array6: Array[Int] = 5 +: array4
    println(array5.mkString(",")) //1,2,3,4,5
    println(array6.mkString(",")) //5,1,2,3,4


    //TODO 可变数组
    val array7: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, 5)
    println("数组长度" + array7.size)
    array7(0) = 10
    //println(array7.mkString(","))
    array7+=(7)
    array7.insert(6,8)
    println(array7.mkString(","))
  }

}
