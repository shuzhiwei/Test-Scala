/**
编写函数计算x的n次方,其中n是整数，要考虑等n是0，正数，负数，正偶数，正奇数这几种情况

n是0时, mi(n)=0
n是正偶数, mi(n)=mi(n/2)*mi(n/2)
n是正奇数, mi(n)=x*mi(n-1)
n是负数, mi(n)=1/mi(-n)


**/

object Test01 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def mi(x:Double, n:Int):Double={
  	if(n==0) 1
  	else if(n>0&&n%2==0){
  		mi(x,n/2)*mi(x,n/2)
  	}
  	else if(n>0&&n%2==1){x*mi(x,n-1)}
  	else 1/mi(x,-n)
  }                                               //> mi: (x: Double, n: Int)Double
  
  mi(2,4)                                         //> res0: Double = 16.0
  
   
   /**
   5.编写一个循环，将整数数组中相邻的元素置换
Array(1,2,3,4,5,6)
得到的结果：214365
   
   **/
   
   val a1 = Array(1,2,3,4,5,6)                    //> a1  : Array[Int] = Array(1, 2, 3, 4, 5, 6)
   for(j<- 0 to a1.size-1 by 2){
   	val t = a1(j)
   	a1(j) = a1(j+1)
   	a1(j+1) = t
   }
   a1                                             //> res1: Array[Int] = Array(2, 1, 4, 3, 6, 5)
   
   
   /**
   6.创建一个Map，包含一些你想要的一些装备，以及他们的价格。然后通过yield 构建另一个Map映射，采用同一组键，但是价格上打9折
比如定义一个Map：
var m1=Map("book"->10,"gun"->100,"ipad"->1000)
则输出的新map(m2）为：Map("book"->9,"gun"->90,"ipad"->900)
   
   **/
   val m1 = Map("book"->10, "gun"->100,"ipad"->1000)
                                                  //> m1  : scala.collection.immutable.Map[String,Int] = Map(book -> 10, gun -> 10
                                                  //| 0, ipad -> 1000)
   val m2 = for(i<- m1)yield{(i._1,(i._2*0.9).toInt)}
                                                  //> m2  : scala.collection.immutable.Map[String,Int] = Map(book -> 9, gun -> 90,
                                                  //|  ipad -> 900)
   
   /**
   1.对"Hello"和"World"进行拉链操作，会产生什么结果？
   
   **/
   val s1 = "Hello"                               //> s1  : String = Hello
   val s2 = "World"                               //> s2  : String = World
   val s3 = s1 zip s2                             //> s3  : scala.collection.immutable.IndexedSeq[(Char, Char)] = Vector((H,W), (
                                                  //| e,o), (l,r), (l,l), (o,d))
   
   /**
   2.编写函数values(fun:(Int)=>Int,low:Int,high:Int),该函数输出一个集合，对应给定区间内给定函数的输入 和输出。比如，
-5,-4,-3,-2,-1,0,1,2,3,4,5
values(x=>x*x,-5,5)应该产出一个对偶的集合(-5,25),(-4,16),(-3,9),…,(3,9),(5,25)
   
   **/
   
   def values(fun:(Int)=>Int,low:Int,high:Int)={
   	val arr = scala.collection.mutable.ListBuffer[(Int,Int)]()
   	for(i <- low to high){
   		fun(i)
   		arr.append((i,fun(i)))
   	}
   	arr
   }                                              //> values: (fun: Int => Int, low: Int, high: Int)scala.collection.mutable.List
                                                  //| Buffer[(Int, Int)]
   values(x=>x*x,-5,5)                            //> res2: scala.collection.mutable.ListBuffer[(Int, Int)] = ListBuffer((-5,25),
                                                  //|  (-4,16), (-3,9), (-2,4), (-1,1), (0,0), (1,1), (2,4), (3,9), (4,16), (5,25
                                                  //| ))
   /**
   3.如何用reduceLeft得到数组中的最大元素?
   
   **/
   
   val arr1 = Array(1,2,3,4,5)                    //> arr1  : Array[Int] = Array(1, 2, 3, 4, 5)
   val max1 = arr1.reduce((a,b)=>if(a>b) a else b)//> max1  : Int = 5
   val max2 = arr1.max                            //> max2  : Int = 5
   
   /**
   4.用to和reduceLeft实现阶乘函数
   
   **/
   (5 to 1 by -1).reduce((a,b)=>a*b)              //> res3: Int = 120
   
   
   /**
   5.编写函数largest(fun:(Int)=>Int,inputs:Seq[Int]),输出在给定输入序列中给定函数的最大值。举例来说，
   largest(x=>10*x-x*x,1 to 10)应该返回25
1 2  3 4 …… 10
   
   **/
   
   def largest(fun:(Int)=>Int, inputs:Seq[Int])={
   	val num = inputs.reduce{(a,b)=>if(fun(a)>fun(b)) a else b}
   	num
   }                                              //> largest: (fun: Int => Int, inputs: Seq[Int])Int
   largest(x=>10*x-x*x,1 to 10)                   //> res4: Int = 5
   
   
   /**
   7.给定一个整数数组，产出一个新的数组，包含原数组中的所有正值，以原有顺序排列，之后的元素是所有零或负值，以原有顺序排列。
比如： Array(1, -2, 0, -3, 0, 4, 5) ，处理后的结果是：1 4 5 0 0 -2 -3

   **/
   
   val a10 = Array(1,-2,0,-3,0,4,5)               //> a10  : Array[Int] = Array(1, -2, 0, -3, 0, 4, 5)
   val a11 = scala.collection.mutable.ArrayBuffer[Int]()
                                                  //> a11  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
   val l11 = scala.collection.mutable.ListBuffer[Int]()
                                                  //> l11  : scala.collection.mutable.ListBuffer[Int] = ListBuffer()
   for(i <- a10 if i > 0){
   	a11.append(i)
   }
   for(i<- a10 if i ==0){a11.append(i)}
   for(i<- a10 if i < 0){a11.append(i)}
   
   l11.++=( for(i <- a10 if i>0 )yield{i})        //> res5: Test01.l11.type = ListBuffer(1, 4, 5)
   l11.++=(for(i<-a10 if i==0) yield i)           //> res6: Test01.l11.type = ListBuffer(1, 4, 5, 0, 0)
   l11 ++= (for(i <- a10 if i < 0)yield{i})       //> res7: Test01.l11.type = ListBuffer(1, 4, 5, 0, 0, -2, -3)
   l11                                            //> res8: scala.collection.mutable.ListBuffer[Int] = ListBuffer(1, 4, 5, 0, 0, 
                                                  //| -2, -3)
   
   val s4 = Array("hello,world","hello,java","hello,scala")
                                                  //> s4  : Array[String] = Array(hello,world, hello,java, hello,scala)
   val s5 = s4.flatMap{_.split(",")}.groupBy{x=>x}.mapValues{x=>x.size}.toList.sortBy{x=>x._1}
                                                  //> s5  : List[(String, Int)] = List((hello,3), (java,1), (scala,1), (world,1))
                                                  //| 
   val s6 = s4.flatMap{_.split(",")}.map{(_,1)}.groupBy{_._1}
   	.mapValues{x=>x.map{_._2}}.map{x=>(x._1,x._2.size)}.toList
                                                  //> s6  : List[(String, Int)] = List((scala,1), (world,1), (java,1), (hello,3))
                                                  //| 
   
   val s7 = s4.flatMap{_.split(",")}.map{(_,1)}.groupBy{_._1}.mapValues{x=>x.map{_._2}.reduce{_+_}}.toList
                                                  //> s7  : List[(String, Int)] = List((scala,1), (world,1), (java,1), (hello,3))
                                                  //| 
   
   val s8 = s4.flatMap{_.split(",")}.map{(_,1)}.groupBy{_._1}.mapValues{x=>x.map{_._2}.reduce{_+_}}.toList.sortBy{_._2}.reverse(0)
                                                  //> s8  : (String, Int) = (hello,3)
  
  val l0 = List[Int]()                            //> l0  : List[Int] = List()
  l0.::(2)                                        //> res9: List[Int] = List(2)
  l0                                              //> res10: List[Int] = List()
  
  
  
  val aa = Array(1,2,3)                           //> aa  : Array[Int] = Array(1, 2, 3)
  aa.take(1)                                      //> res11: Array[Int] = Array(1)
  aa.takeRight(1)                                 //> res12: Array[Int] = Array(3)
  
  aa.drop(1)                                      //> res13: Array[Int] = Array(2, 3)
  aa.dropRight(1)                                 //> res14: Array[Int] = Array(1, 2)
  
  val ss = "hello"                                //> ss  : String = hello
  ss.dropRight(1)                                 //> res15: String = hell
  
  val sss = "world"                               //> sss  : String = world
  ss.zip(sss)                                     //> res16: scala.collection.immutable.IndexedSeq[(Char, Char)] = Vector((h,w), 
                                                  //| (e,o), (l,r), (l,l), (o,d))
  
  val bb = Array(4,5,6)                           //> bb  : Array[Int] = Array(4, 5, 6)
  ss ++ sss                                       //> res17: String = helloworld
  aa ++: bb                                       //> res18: Array[Int] = Array(1, 2, 3, 4, 5, 6)
  aa ++ bb                                        //> res19: Array[Int] = Array(1, 2, 3, 4, 5, 6)
  bb ++ aa                                        //> res20: Array[Int] = Array(4, 5, 6, 1, 2, 3)
  
  
  val t1 = (1,3)                                  //> t1  : (Int, Int) = (1,3)
  val l1 = List(1,2,3,4)                          //> l1  : List[Int] = List(1, 2, 3, 4)
  
  val l2 = scala.collection.mutable.ListBuffer[Int]()
                                                  //> l2  : scala.collection.mutable.ListBuffer[Int] = ListBuffer()
  l1.foreach{x=>
  	
  	val value = x*2
  	l2.append(value)
  }
  l2                                              //> res21: scala.collection.mutable.ListBuffer[Int] = ListBuffer(2, 4, 6, 8)

  
  
  
  
  
  
  
  
  
  
  
  
  
  
}