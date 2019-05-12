/**
学习Scala的字符串类型的操作, 为后面处理文件数据打基础
知识点
1 操作scala的String类型时, 表面上是java的String, 但是底层通过:隐式转换机制
转换成scala的StringOps类型, 下面take takeRight...都是StringOps类型
即String-->StringOps
**/
object Demo02 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val s1 = "hello world"                          //> s1  : String = hello world
  
  val r1 = s1.split(" ")                          //> r1  : Array[String] = Array(hello, world)
  
  //取出前n个元素并返回
  val r2 = s1.take(2)                             //> r2  : String = he
  //取出尾部n个元素并返回
  val r3 = s1.takeRight(5)                        //> r3  : String = world
  //去掉前n个元素, 并返回剩余元素
  val r4 = s1.drop(2)                             //> r4  : String = llo world
  val r5 = s1.dropRight(2)                        //> r5  : String = hello wor
  
  //重复n次
  val r6 = s1*2                                   //> r6  : String = hello worldhello world
  
  //去重
  val r7 = s1.distinct                            //> r7  : String = helo wrd
  
  //反转
  val r8 = s1.reverse                             //> r8  : String = dlrow olleh
  
  val s2 ="100"                                   //> s2  : String = 100
  val r9 = s2.toInt                               //> r9  : Int = 100
  val r10 = s2.toDouble                           //> r10  : Double = 100.0
  
  
  
  
  
}