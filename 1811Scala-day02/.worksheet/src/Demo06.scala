/**
知识点
1 scala的Collection(集合)是一个大的概念, 常见的包含:Array,List,Set,Map,Tuple
     本节学习Array的声明以及方法
2 定长数组Array   变长数组ArrayBuffer
3 immutable定长		mutable变长
4 Array和List通用且重要的方法
		max
		min
		take
		takeRight
		drop
		dropRight
		head
		last
		filter(过滤)
		count
		exists
		sortBy(排序)
		foreach
		intersect(交集)
		union(并集)
		diff(差集)
		map(映射方法)
		reduce(规约方法)
		distinct
		mkString
		reverse(反转)
		mapValues(只有Map类型有,专用于操作map的value)
		sum(求和)

以上的方法中,再重点掌握:filter;map;sortBy;reduce;mapValues

**/
object Demo06 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(547); 
  println("Welcome to the Scala worksheet");$skip(29); 
  
  val a1 = Array(1,2,3,4);System.out.println("""a1  : Array[Int] = """ + $show(a1 ));$skip(37); 
  val a2:Array[Int] = Array(1,2,3,4);System.out.println("""a2  : Array[Int] = """ + $show(a2 ));$skip(29); 
  val a3 = new Array[Int](3);System.out.println("""a3  : Array[Int] = """ + $show(a3 ));$skip(95); 
  
  //a1,a2,a3都是定长数组
  
  //声明一个变长数组
  val a4 = scala.collection.mutable.ArrayBuffer(1,2,3,4);System.out.println("""a4  : scala.collection.mutable.ArrayBuffer[Int] = """ + $show(a4 ));$skip(24); val res$0 = 
  
  //通过下标操作数组
  a1(0);System.out.println("""res0: Int = """ + $show(res$0));$skip(11); 
  a1(0)=10;$skip(5); val res$1 = 
  a1;System.out.println("""res1: Array[Int] = """ + $show(res$1));$skip(36); 
  
  for(i<-5 to 10) {a4.append(i)};$skip(5); val res$2 = 
  a4;System.out.println("""res2: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$2));$skip(34); 
  val a6=Array(1,1,2,2,3,8,7,4,5);System.out.println("""a6  : Array[Int] = """ + $show(a6 ));$skip(9); val res$3 = 
  a6.max;System.out.println("""res3: Int = """ + $show(res$3));$skip(9); val res$4 = 
  a6.min;System.out.println("""res4: Int = """ + $show(res$4));$skip(14); val res$5 = 
  a6.distinct;System.out.println("""res5: Array[Int] = """ + $show(res$5));$skip(22); val res$6 = 
  a6.count(x=>x%2==0);System.out.println("""res6: Int = """ + $show(res$6));$skip(22); 
  val a7 = a6.take(2);System.out.println("""a7  : Array[Int] = """ + $show(a7 ));$skip(20); val res$7 = 
  //返回头元素
  a6.head;System.out.println("""res7: Int = """ + $show(res$7));$skip(21); val res$8 = 
  //返回尾远古三
  a6.last;System.out.println("""res8: Int = """ + $show(res$8));$skip(28); val res$9 = 
  a6.filter{x=>x%2==0&&x>4};System.out.println("""res9: Array[Int] = """ + $show(res$9));$skip(31); 
  //遍历方法
  a6.foreach{println};$skip(42); val res$10 = 
  //将数组以指定分割符, 返回一个字符串
  a6.mkString(",");System.out.println("""res10: String = """ + $show(res$10));$skip(56); val res$11 = 
  
  
  
  //根据匿名函数判断元素是否存在
  a6.exists{x=>x%2==0&&x>9};System.out.println("""res11: Boolean = """ + $show(res$11));$skip(45); val res$12 = 
  
  //根据匿名函数排序, 并返回一个新的数组
  a6.sortBy{x=>x};System.out.println("""res12: Array[Int] = """ + $show(res$12));$skip(27); val res$13 = 
  //降序
  a6.sortBy{x=> -x};System.out.println("""res13: Array[Int] = """ + $show(res$13));$skip(42); 
  
  //比较两个文件的相同部分
  val a14=Array(1,2,3);System.out.println("""a14  : Array[Int] = """ + $show(a14 ));$skip(23); 
  val a15=Array(2,3,4);System.out.println("""a15  : Array[Int] = """ + $show(a15 ));$skip(29); 
  val a16=a14.intersect(a15);System.out.println("""a16  : Array[Int] = """ + $show(a16 ));$skip(28); val res$14 = 
  
  //取并集
  a14.union(a15);System.out.println("""res14: Array[Int] = """ + $show(res$14));$skip(27); val res$15 = 
  
  //取差集
  a14.diff(a15);System.out.println("""res15: Array[Int] = """ + $show(res$15));$skip(70); 
 
 //--映射方法, 根据匿名函数, 将集合中的元素从一个形式转变成另一种形式
  val a18 = a14.map(x=>x*2);System.out.println("""a18  : Array[Int] = """ + $show(a18 ));$skip(153); 
  
  //--规约方法, 底层的工作机制
  //--①a=1, b=2, a+b=3
  //--①a=3, b=3, a+b=6
  //--①a=6, b=4, a+b=10
  //--①a=10, b=5, a+b=15
  val a19 = a14.reduce((a,b)=>a+b);System.out.println("""a19  : Int = """ + $show(a19 ))}
  
}
