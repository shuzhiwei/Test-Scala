/**
学习set
**/
object Demo08 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  //--声明一个定长set, 不包含重复元素
  val s1 = Set(1,1,2,3)                           //> s1  : scala.collection.immutable.Set[Int] = Set(1, 2, 3)
  //--声明一个变长set
  val s2 = scala.collection.mutable.Set(1,2,3,4)  //> s2  : scala.collection.mutable.Set[Int] = Set(1, 2, 3, 4)
  
  val s3 = Set(1,2,3)                             //> s3  : scala.collection.immutable.Set[Int] = Set(1, 2, 3)
  val s4 = Set(3,4,5)                             //> s4  : scala.collection.immutable.Set[Int] = Set(3, 4, 5)
  //--取交集
  s3.intersect(s4)                                //> res0: scala.collection.immutable.Set[Int] = Set(3)
  s3&s4                                           //> res1: scala.collection.immutable.Set[Int] = Set(3)
  
  //--取差集
  s3.diff(s4)                                     //> res2: scala.collection.immutable.Set[Int] = Set(1, 2)
  s3&~s4                                          //> res3: scala.collection.immutable.Set[Int] = Set(1, 2)
  
  //--合并set
  s3.union(s4)                                    //> res4: scala.collection.immutable.Set[Int] = Set(5, 1, 2, 3, 4)
  s3++s4                                          //> res5: scala.collection.immutable.Set[Int] = Set(5, 1, 2, 3, 4)
  
  val s5 = Set(1,2,3,4,5,6,7)                     //> s5  : scala.collection.immutable.Set[Int] = Set(5, 1, 6, 2, 7, 3, 4)
  //--将一个set拆成两个子set, 一个子set元素个数是4个, 另一个是3个
  //--应用场景: 将一个数据集拆成两个子集, 一个是样本集, 一个是测试集
  s5.splitAt(4)                                   //> res6: (scala.collection.immutable.Set[Int], scala.collection.immutable.Set[I
                                                  //| nt]) = (Set(5, 1, 6, 2),Set(7, 3, 4))
  
  
  
  
  
  
  
  
  
  
}