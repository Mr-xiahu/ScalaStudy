package cn.xhjava.scala.chapter060708

//多特质混入
object Scala09_interface4 {
  def main(args: Array[String]): Unit = {
    val mysql = new MySQL9
    mysql.insert()
    //    Insert trait
    //    FileInsert trait
    //    DBInsert trait
    //    向数据库
    //    向文件
    //    插入数据......
    /**
      * 多特质混入时:代码执行顺序:父特质-->左特质-->右特质
      * 方法调用顺序:父特质-->右特质-->左特质
      *
      * 特质中中的super关键字,不是指向父特质,而是指向上一级特质
      * 如果需要指定指向父特质,需要增加特殊操作
      * super[Insert].insert  指定super的对象
      */
  }

}

trait Insert {
  println("Insert trait")

  def insert() = {
    println("插入数据......")
  }
}

//特质是可以继承其他特质的
//特质重写父特质的方法
trait DBInsert extends Insert {
  println("DBInsert trait")

  //重写父类的特质需要加:override
  override def insert() = {
    println("向数据库")
    super.insert()
  }
}


trait FileInsert extends Insert {
  println("FileInsert trait")

  //重写父类的特质需要加:override
  override def insert() = {
    println("向文件")
    super.insert()
  }
}

class MySQL9 extends FileInsert with DBInsert {
}


