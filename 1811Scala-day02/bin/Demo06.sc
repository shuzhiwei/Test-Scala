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
object Demo06 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val a1 = Array(1,2,3,4)                         //> a1  : Array[Int] = Array(1, 2, 3, 4)
  val a2:Array[Int] = Array(1,2,3,4)              //> a2  : Array[Int] = Array(1, 2, 3, 4)
  val a3 = new Array[Int](3)                      //> a3  : Array[Int] = Array(0, 0, 0)
  
  //a1,a2,a3都是定长数组
  
  //声明一个变长数组
  val a4 = scala.collection.mutable.ArrayBuffer(1,2,3,4)
                                                  //> a4  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4)
  
  //通过下标操作数组
  a1(0)                                           //> res0: Int = 1
  a1(0)=10
  a1                                              //> res1: Array[Int] = Array(10, 2, 3, 4)
  
  for(i<-5 to 10) {a4.append(i)}
  a4                                              //> res2: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, 5,
                                                  //|  6, 7, 8, 9, 10)
  val a6=Array(1,1,2,2,3,8,7,4,5)                 //> a6  : Array[Int] = Array(1, 1, 2, 2, 3, 8, 7, 4, 5)
  a6.max                                          //> res3: Int = 8
  a6.min                                          //> res4: Int = 1
  a6.distinct                                     //> res5: Array[Int] = Array(1, 2, 3, 8, 7, 4, 5)
  a6.count(x=>x%2==0)                             //> res6: Int = 4
  val a7 = a6.take(2)                             //> a7  : Array[Int] = Array(1, 1)
  //返回头元素
  a6.head                                         //> res7: Int = 1
  //返回尾远古三
  a6.last                                         //> res8: Int = 5
  a6.filter{x=>x%2==0&&x>4}                       //> res9: Array[Int] = Array(8)
  //遍历方法
  a6.foreach{println}                             //> 1
                                                  //| 1
                                                  //| 2
                                                  //| 2
                                                  //| 3
                                                  //| 8
                                                  //| 7
                                                  //| 4
                                                  //| 5
  //将数组以指定分割符, 返回一个字符串
  a6.mkString(",")                                //> res10: String = 1,1,2,2,3,8,7,4,5
  
  
  
  //根据匿名函数判断元素是否存在
  a6.exists{x=>x%2==0&&x>9}                       //> res11: Boolean = false
  
  //根据匿名函数排序, 并返回一个新的数组
  a6.sortBy{x=>x}                                 //> res12: Array[Int] = Array(1, 1, 2, 2, 3, 4, 5, 7, 8)
  //降序
  a6.sortBy{x=> -x}                               //> res13: Array[Int] = Array(8, 7, 5, 4, 3, 2, 2, 1, 1)
  
  //比较两个文件的相同部分
  val a14=Array(1,2,3)                            //> a14  : Array[Int] = Array(1, 2, 3)
  val a15=Array(2,3,4)                            //> a15  : Array[Int] = Array(2, 3, 4)
  val a16=a14.intersect(a15)                      //> a16  : Array[Int] = Array(2, 3)
  
  //取并集
  a14.union(a15)                                  //> res14: Array[Int] = Array(1, 2, 3, 2, 3, 4)
  
  //取差集
  a14.diff(a15)                                   //> res15: Array[Int] = Array(1)
 
 //--映射方法, 根据匿名函数, 将集合中的元素从一个形式转变成另一种形式
  val a18 = a14.map(x=>x*2)                       //> a18  : Array[Int] = Array(2, 4, 6)
  
  //--规约方法, 底层的工作机制
  //--①a=1, b=2, a+b=3
  //--①a=3, b=3, a+b=6
  //--①a=6, b=4, a+b=10
  //--①a=10, b=5, a+b=15
  val a19 = a14.reduce((a,b)=>a+b)                //> a19  : Int = 6
  
}