/**
非常重要的高阶函数总结:

1 map
2 filter
3 sortBy
4 mapValues
5 reduce
6 flatMap(扁平化)
7 groupBy(分组函数)
**/
object Demo11 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val l1=List("hello","world","hello","1811")     //> l1  : List[String] = List(hello, world, hello, 1811)
  //--map映射方法, 把元素从一个形式映射到另外一个形式, 并返回一个新集合
  //--map方法只改变元素的形式, 不改变元素的个数
  val l2=l1.map{x=>(x,1)}                         //> l2  : List[(String, Int)] = List((hello,1), (world,1), (hello,1), (1811,1))
                                                  //| 
  //--操作l2
  val l3=l2.map{case(k,v)=>k}                     //> l3  : List[String] = List(hello, world, hello, 1811)
  val l4=l2.map{x=>x._1}                          //> l4  : List[String] = List(hello, world, hello, 1811)
  
  val l5=List(("tom",18),("rose",25),("jim",20),("jary",15))
                                                  //> l5  : List[(String, Int)] = List((tom,18), (rose,25), (jim,20), (jary,15))
  //--操作l4, 过滤出年龄大于18岁的数据
  val l6=l5.filter(x=>x._2>18)                    //> l6  : List[(String, Int)] = List((rose,25), (jim,20))
  
  //按年龄做升序排序
  val l7=l5.sortBy(_._2)                          //> l7  : List[(String, Int)] = List((jary,15), (tom,18), (jim,20), (rose,25))
  
  val m1=Map("tom"->23,"rose"->24,"jim"->30)      //> m1  : scala.collection.immutable.Map[String,Int] = Map(tom -> 23, rose -> 24
                                                  //| , jim -> 30)
  //--操作m1,过滤出年龄大于20
  //--针对Map类型, 底层会将kv封装成元组的形式
  val m2=m1.filter{x=>x._2>20}                    //> m2  : scala.collection.immutable.Map[String,Int] = Map(tom -> 23, rose -> 24
                                                  //| , jim -> 30)
  val m3=m1.filter{case(k,v)=>v>20}               //> m3  : scala.collection.immutable.Map[String,Int] = Map(tom -> 23, rose -> 24
                                                  //| , jim -> 30)
                                                  
  //--用reduce方法计算1~6的阶乘结果
  val m4=1 to 6 reduce{(a,b)=>a*b}                //> m4  : Int = 720
  
  val l8=List("hello,world","hello,hadoop","hello,1811")
                                                  //> l8  : List[String] = List(hello,world, hello,hadoop, hello,1811)
  val l9=l8.map{x=>x.split(",")}                  //> l9  : List[Array[String]] = List(Array(hello, world), Array(hello, hadoop), 
                                                  //| Array(hello, 1811))
  //--扁平化map方法, 也是映射方法, 会改变元素的形式,元素的个数也会改变
  val l10=l8.flatMap{x=>x.split(",")}             //> l10  : List[String] = List(hello, world, hello, hadoop, hello, 1811)
  
  //--按指定的匿名函数分组, 并返回一个Map
  //--Map的key是分组条件, Map的Value是相同key聚合后的List
  val m5 = l10.groupBy{x=>x}                      //> m5  : scala.collection.immutable.Map[String,List[String]] = Map(hadoop -> L
                                                  //| ist(hadoop), world -> List(world), 1811 -> List(1811), hello -> List(hello,
                                                  //|  hello, hello))
 	val l11 = List(("bj",1),("sh",2),("bj",3),("sh",4))
                                                  //> l11  : List[(String, Int)] = List((bj,1), (sh,2), (bj,3), (sh,4))
 	val m6 = l11.groupBy{x=>x._1}             //> m6  : scala.collection.immutable.Map[String,List[(String, Int)]] = Map(bj -
                                                  //| > List((bj,1), (bj,3)), sh -> List((sh,2), (sh,4)))
                                                 
}