/**
编写函数计算x的n次方,其中n是整数，要考虑等n是0，正数，负数，正偶数，正奇数这几种情况

n是0时, mi(n)=0
n是正偶数, mi(n)=mi(n/2)*mi(n/2)
n是正奇数, mi(n)=x*mi(n-1)
n是负数, mi(n)=1/mi(-n)


**/

object Test01 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(204); 
  println("Welcome to the Scala worksheet");$skip(166); 
  
  def mi(x:Double, n:Int):Double={
  	if(n==0) 1
  	else if(n>0&&n%2==0){
  		mi(x,n/2)*mi(x,n/2)
  	}
  	else if(n>0&&n%2==1){x*mi(x,n-1)}
  	else 1/mi(x,-n)
  };System.out.println("""mi: (x: Double, n: Int)Double""");$skip(13); val res$0 = 
  
  mi(2,4);System.out.println("""res0: Double = """ + $show(res$0));$skip(118); 
  
   
   /**
   5.编写一个循环，将整数数组中相邻的元素置换
Array(1,2,3,4,5,6)
得到的结果：214365
   
   **/
   
   val a1 = Array(1,2,3,4,5,6);System.out.println("""a1  : Array[Int] = """ + $show(a1 ));$skip(92); 
   for(j<- 0 to a1.size-1 by 2){
   	val t = a1(j)
   	a1(j) = a1(j+1)
   	a1(j+1) = t
   };$skip(6); val res$1 = 
   a1;System.out.println("""res1: Array[Int] = """ + $show(res$1));$skip(259); 
   
   
   /**
   6.创建一个Map，包含一些你想要的一些装备，以及他们的价格。然后通过yield 构建另一个Map映射，采用同一组键，但是价格上打9折
比如定义一个Map：
var m1=Map("book"->10,"gun"->100,"ipad"->1000)
则输出的新map(m2）为：Map("book"->9,"gun"->90,"ipad"->900)
   
   **/
   val m1 = Map("book"->10, "gun"->100,"ipad"->1000);System.out.println("""m1  : scala.collection.immutable.Map[String,Int] = """ + $show(m1 ));$skip(54); 
   val m2 = for(i<- m1)yield{(i._1,(i._2*0.9).toInt)};System.out.println("""m2  : scala.collection.immutable.Map[String,Int] = """ + $show(m2 ));$skip(79); 
   
   /**
   1.对"Hello"和"World"进行拉链操作，会产生什么结果？
   
   **/
   val s1 = "Hello";System.out.println("""s1  : String = """ + $show(s1 ));$skip(20); 
   val s2 = "World";System.out.println("""s2  : String = """ + $show(s2 ));$skip(22); 
   val s3 = s1 zip s2;System.out.println("""s3  : scala.collection.immutable.IndexedSeq[(Char, Char)] = """ + $show(s3 ));$skip(401); 
   
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
   };System.out.println("""values: (fun: Int => Int, low: Int, high: Int)scala.collection.mutable.ListBuffer[(Int, Int)]""");$skip(23); val res$2 = 
   values(x=>x*x,-5,5);System.out.println("""res2: scala.collection.mutable.ListBuffer[(Int, Int)] = """ + $show(res$2));$skip(83); 
   /**
   3.如何用reduceLeft得到数组中的最大元素?
   
   **/
   
   val arr1 = Array(1,2,3,4,5);System.out.println("""arr1  : Array[Int] = """ + $show(arr1 ));$skip(51); 
   val max1 = arr1.reduce((a,b)=>if(a>b) a else b);System.out.println("""max1  : Int = """ + $show(max1 ));$skip(23); 
   val max2 = arr1.max;System.out.println("""max2  : Int = """ + $show(max2 ));$skip(85); val res$3 = 
   
   /**
   4.用to和reduceLeft实现阶乘函数
   
   **/
   (5 to 1 by -1).reduce((a,b)=>a*b);System.out.println("""res3: Int = """ + $show(res$3));$skip(283); 
   
   
   /**
   5.编写函数largest(fun:(Int)=>Int,inputs:Seq[Int]),输出在给定输入序列中给定函数的最大值。举例来说，
   largest(x=>10*x-x*x,1 to 10)应该返回25
1 2  3 4 …… 10
   
   **/
   
   def largest(fun:(Int)=>Int, inputs:Seq[Int])={
   	val num = inputs.reduce{(a,b)=>if(fun(a)>fun(b)) a else b}
   	num
   };System.out.println("""largest: (fun: Int => Int, inputs: Seq[Int])Int""");$skip(32); val res$4 = 
   largest(x=>10*x-x*x,1 to 10);System.out.println("""res4: Int = """ + $show(res$4));$skip(186); 
   
   
   /**
   7.给定一个整数数组，产出一个新的数组，包含原数组中的所有正值，以原有顺序排列，之后的元素是所有零或负值，以原有顺序排列。
比如： Array(1, -2, 0, -3, 0, 4, 5) ，处理后的结果是：1 4 5 0 0 -2 -3

   **/
   
   val a10 = Array(1,-2,0,-3,0,4,5);System.out.println("""a10  : Array[Int] = """ + $show(a10 ));$skip(57); 
   val a11 = scala.collection.mutable.ArrayBuffer[Int]();System.out.println("""a11  : scala.collection.mutable.ArrayBuffer[Int] = """ + $show(a11 ));$skip(56); 
   val l11 = scala.collection.mutable.ListBuffer[Int]();System.out.println("""l11  : scala.collection.mutable.ListBuffer[Int] = """ + $show(l11 ));$skip(45); 
   for(i <- a10 if i > 0){
   	a11.append(i)
   };$skip(45); 
   for(i<- a10 if i ==0){a11.append(i)};$skip(40); 
   for(i<- a10 if i < 0){a11.append(i)};$skip(47); val res$5 = 
   
   l11.++=( for(i <- a10 if i>0 )yield{i});System.out.println("""res5: Test01.l11.type = """ + $show(res$5));$skip(40); val res$6 = 
   l11.++=(for(i<-a10 if i==0) yield i);System.out.println("""res6: Test01.l11.type = """ + $show(res$6));$skip(44); val res$7 = 
   l11 ++= (for(i <- a10 if i < 0)yield{i});System.out.println("""res7: Test01.l11.type = """ + $show(res$7));$skip(7); val res$8 = 
   l11;System.out.println("""res8: scala.collection.mutable.ListBuffer[Int] = """ + $show(res$8));$skip(64); 
   
   val s4 = Array("hello,world","hello,java","hello,scala");System.out.println("""s4  : Array[String] = """ + $show(s4 ));$skip(95); 
   val s5 = s4.flatMap{_.split(",")}.groupBy{x=>x}.mapValues{x=>x.size}.toList.sortBy{x=>x._1};System.out.println("""s5  : List[(String, Int)] = """ + $show(s5 ));$skip(125); 
   val s6 = s4.flatMap{_.split(",")}.map{(_,1)}.groupBy{_._1}
   	.mapValues{x=>x.map{_._2}}.map{x=>(x._1,x._2.size)}.toList;System.out.println("""s6  : List[(String, Int)] = """ + $show(s6 ));$skip(111); 
   
   val s7 = s4.flatMap{_.split(",")}.map{(_,1)}.groupBy{_._1}.mapValues{x=>x.map{_._2}.reduce{_+_}}.toList;System.out.println("""s7  : List[(String, Int)] = """ + $show(s7 ));$skip(135); 
   
   val s8 = s4.flatMap{_.split(",")}.map{(_,1)}.groupBy{_._1}.mapValues{x=>x.map{_._2}.reduce{_+_}}.toList.sortBy{_._2}.reverse(0);System.out.println("""s8  : (String, Int) = """ + $show(s8 ));$skip(26); 
  
  val l0 = List[Int]();System.out.println("""l0  : List[Int] = """ + $show(l0 ));$skip(11); val res$9 = 
  l0.::(2);System.out.println("""res9: List[Int] = """ + $show(res$9));$skip(5); val res$10 = 
  l0;System.out.println("""res10: List[Int] = """ + $show(res$10));$skip(33); 
  
  
  
  val aa = Array(1,2,3);System.out.println("""aa  : Array[Int] = """ + $show(aa ));$skip(13); val res$11 = 
  aa.take(1);System.out.println("""res11: Array[Int] = """ + $show(res$11));$skip(18); val res$12 = 
  aa.takeRight(1);System.out.println("""res12: Array[Int] = """ + $show(res$12));$skip(16); val res$13 = 
  
  aa.drop(1);System.out.println("""res13: Array[Int] = """ + $show(res$13));$skip(18); val res$14 = 
  aa.dropRight(1);System.out.println("""res14: Array[Int] = """ + $show(res$14));$skip(22); 
  
  val ss = "hello";System.out.println("""ss  : String = """ + $show(ss ));$skip(18); val res$15 = 
  ss.dropRight(1);System.out.println("""res15: String = """ + $show(res$15));$skip(23); 
  
  val sss = "world";System.out.println("""sss  : String = """ + $show(sss ));$skip(14); val res$16 = 
  ss.zip(sss);System.out.println("""res16: scala.collection.immutable.IndexedSeq[(Char, Char)] = """ + $show(res$16));$skip(27); 
  
  val bb = Array(4,5,6);System.out.println("""bb  : Array[Int] = """ + $show(bb ));$skip(12); val res$17 = 
  ss ++ sss;System.out.println("""res17: String = """ + $show(res$17));$skip(12); val res$18 = 
  aa ++: bb;System.out.println("""res18: Array[Int] = """ + $show(res$18));$skip(11); val res$19 = 
  aa ++ bb;System.out.println("""res19: Array[Int] = """ + $show(res$19));$skip(11); val res$20 = 
  bb ++ aa;System.out.println("""res20: Array[Int] = """ + $show(res$20));$skip(23); 
  
  
  val t1 = (1,3);System.out.println("""t1  : (Int, Int) = """ + $show(t1 ));$skip(25); 
  val l1 = List(1,2,3,4);System.out.println("""l1  : List[Int] = """ + $show(l1 ));$skip(57); 
  
  val l2 = scala.collection.mutable.ListBuffer[Int]();System.out.println("""l2  : scala.collection.mutable.ListBuffer[Int] = """ + $show(l2 ));$skip(64); 
  l1.foreach{x=>
  	
  	val value = x*2
  	l2.append(value)
  };$skip(5); val res$21 = 
  l2;System.out.println("""res21: scala.collection.mutable.ListBuffer[Int] = """ + $show(res$21))}

  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
