/**
重点:学习匿名函数和高阶函数

知识点
1.匿名函数没有函数名, (参数列表)=>{方法体}
2.匿名函数可以当做参数进行赋值或传递
3.高阶函数可以将函数作为参数传递
4.通用的化简规则:如果匿名函数的参数类型可以推断出来,则类型可以省略
5.通用的化简规则:如果匿名函数的参数列表只有一个参数,则()可以省略
6.最终级的化简规则:可以通过_(占位符)来代替参数化简
**/
object Demo03 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def f1(a:Int,b:Int)={a+b}                       //> f1: (a: Int, b: Int)Int
  
  //--声明一个匿名函数
  //--将匿名函数当做参数赋值
  val f2=(a:Int,b:Int)=>{a+b}                     //> f2  : (Int, Int) => Int = <function2>
  
  f2(2,3)                                         //> res0: Int = 5
  
  //--将匿名函数当做参数传递
  //--如果一个函数可以将匿名函数当做参数传递,则此函数称为高阶函数
  //--即f3是一个高阶函数,可以把函数当做参数传递
  def f3(a:Int,b:Int,f:(Int,Int)=>Int)={
  		f(a,b)
  }                                               //> f3: (a: Int, b: Int, f: (Int, Int) => Int)Int
  
  //--调用f3,传入两个整型和一个匿名函数,要求实现两个数乘法运算
  
  f3(2,3,(a:Int,b:Int)=>{a*b})                    //> res1: Int = 6
  f3(2,3,(a,b)=>{a*b})                            //> res2: Int = 6
  f3(2,3,(a,b)=>a*b)                              //> res3: Int = 6
  f3(2,3,_*_)                                     //> res4: Int = 6
  
  
  def f4(a:String,f:(String)=>Array[String])={
  	f(a)
  }                                               //> f4: (a: String, f: String => Array[String])Array[String]
  //--根据下面的调用,把f4函数声明出来
  f4("hello,world",(a:String)=>{a.split(",")})    //> res5: Array[String] = Array(hello, world)
  f4("hello,world",(a)=>a.split(","))             //> res6: Array[String] = Array(hello, world)
  f4("hello,world",a=>a.split(","))               //> res7: Array[String] = Array(hello, world)
  f4("hello,world",_.split(","))                  //> res8: Array[String] = Array(hello, world)
  
  val a1=Array(1,2,3,4)                           //> a1  : Array[Int] = Array(1, 2, 3, 4)
  
  a1.foreach {(a:Int)=>{println(a)}}              //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
  a1.foreach {a=>println(a)}                      //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
  a1.foreach {println(_)}                         //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
  a1.filter {(a:Int)=>{a>2}}                      //> res9: Array[Int] = Array(3, 4)
  a1.filter {a=>a>2}                              //> res10: Array[Int] = Array(3, 4)
  a1.filter {_>2}                                 //> res11: Array[Int] = Array(3, 4)
}