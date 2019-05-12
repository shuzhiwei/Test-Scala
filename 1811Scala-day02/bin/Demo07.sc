import scala.collection.mutable.ListBuffer

object Demo07 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //--声明定长List
  val l1=List(1,2,3,4)                            //> l1  : List[Int] = List(1, 2, 3, 4)
  
  val l2 = scala.collection.mutable.ListBuffer    //> l2  : collection.mutable.ListBuffer.type = scala.collection.mutable.ListBuff
                                                  //| er$@1a407d53
  val l3 = ListBuffer                             //> l3  : scala.collection.mutable.ListBuffer.type = scala.collection.mutable.Li
                                                  //| stBuffer$@1a407d53
  //在List左侧添加元素
  1+:l1                                           //> res0: List[Int] = List(1, 1, 2, 3, 4)
  
  //在List右侧添加一个元素
  l1:+5                                           //> res1: List[Int] = List(1, 2, 3, 4, 5)
  
  //--其他方法与Array类似
  
  
  //--集合间的类型转换
  //--类型转换, 比如某种集合类型没有distinct, 可以通过类型转换来实现
  l1.toArray                                      //> res2: Array[Int] = Array(1, 2, 3, 4)
  val l6 = List(1,1,2,3,4)                        //> l6  : List[Int] = List(1, 1, 2, 3, 4)
  l6.toArray.distinct.toList                      //> res3: List[Int] = List(1, 2, 3, 4)
  
  //--反转
  l6.reverse                                      //> res4: List[Int] = List(4, 3, 2, 1, 1)
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}