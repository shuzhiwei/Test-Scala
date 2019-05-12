/**
学习map
**/
object Demo09 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //--声明一个定长Map
  val m1=Map("tom"->23,"rose"->24,"jim"->35)      //> m1  : scala.collection.immutable.Map[String,Int] = Map(tom -> 23, rose -> 24
                                                  //| , jim -> 35)
  //--声明一个变长Map, 可以追加新的KV对
  val m2 = scala.collection.mutable.Map("tom"->23,"rose"->24,"jim"->35)
                                                  //> m2  : scala.collection.mutable.Map[String,Int] = Map(jim -> 35, rose -> 24, 
                                                  //| tom -> 23)
  //--通过key取值
  m1("tom")                                       //> res0: Int = 23
  m1.apply("tom")                                 //> res1: Int = 23
  
  //--获取Map的key迭代器
  m1.keys.foreach{println}                        //> tom
                                                  //| rose
                                                  //| jim
 	m1.values.foreach{println}                //> 23
                                                  //| 24
                                                  //| 35
  m1.values.filter{x=>x>30}                       //> res2: Iterable[Int] = List(35)
  
  m1.values.toList.distinct                       //> res3: List[Int] = List(23, 24, 35)
  
  //针对变长Map, 追加新的kv对
  m2+=("jary"->40)                                //> res4: Demo09.m2.type = Map(jary -> 40, jim -> 35, rose -> 24, tom -> 23)
  
  //--用于操作Map类型的value
  m1.mapValues{x=>x*2}                            //> res5: scala.collection.immutable.Map[String,Int] = Map(tom -> 46, rose -> 48
                                                  //| , jim -> 70)
  m1.map{case(k,v)=>(k,v*2)}                      //> res6: scala.collection.immutable.Map[String,Int] = Map(tom -> 46, rose -> 48
                                                  //| , jim -> 70)
  //--通过key取值, 并可以指定没有对应key值的默认值
  m1.get("zs").getOrElse(0)                       //> res7: Int = 0
  
  m1.contains("tom")                              //> res8: Boolean = true
  
  m1.size                                         //> res9: Int = 3
  
  
  
  
  
  
}