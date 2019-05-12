/**
重点: 学习scala函数的声明和调用

知识点
1 scala通过def关键字来声明函数
2 def前可以具有修饰符, private或protected修饰
3 默认是public(def前什么都不加)
4 此外也可以通过final和override来修饰
5 def 函数名(参数列表):函数的返回值类型={方法体}
6 scala可以通过方法体的返回值, 自动推断出返回值类型
7 如果函数没有=号, 则返回值一律为unit(即自动推断机制不生效)
**/

object Demo02 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def f1():String={
  	"hello 1811"
  }                                               //> f1: ()String
  
  def f2()={
  	Array(1,2,3)
  }                                               //> f2: ()Array[Int]
  
  def f3(){
  	Array(1,2,3)
  }                                               //> f3: ()Unit
  
  def f4(a:Int,b:Int)={
  	a+b
  }                                               //> f4: (a: Int, b: Int)Int
  
  f4(2,3)                                         //> res0: Int = 5
  
  def f5(str:String)={
  	str.split(",")
  }                                               //> f5: (str: String)Array[String]
  
  def f6(arr:Array[Int])={
  	for(i<-arr) println(i)
  }                                               //> f6: (arr: Array[Int])Unit
  
  f6(Array(1,2,3))                                //> 1
                                                  //| 2
                                                  //| 3
  //--scala的默认参数机制, 可以在声明函数时, 为参数指定默认值
  def f7(a:String,b:String="*",c:String="&")={
  	b+a+c
  }                                               //> f7: (a: String, b: String, c: String)String
  
  f7("hello")                                     //> res1: String = *hello&
  f7("hello", "#")                                //> res2: String = #hello&
  
  //--scala的变长参数机制, 在类型后面加*
  //--变长参数类型本质是集合类型, 可以通过集合的方法来操作
  //--变长参数类型必须位于参数列表最后
  def f10(a:Int*)={
  	for(i<-a) println(i)
  }                                               //> f10: (a: Int*)Unit
  
  f10(2,3,4)                                      //> 2
                                                  //| 3
                                                  //| 4
  val p1 = new Person                             //> p1  : Person = Person@6fadae5d
  p1.eat()                                        //> eat food
	
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}