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

object Demo02 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(297); 
  println("Welcome to the Scala worksheet");$skip(43); 
  
  def f1():String={
  	"hello 1811"
  };System.out.println("""f1: ()String""");$skip(36); 
  
  def f2()={
  	Array(1,2,3)
  };System.out.println("""f2: ()Array[Int]""");$skip(35); 
  
  def f3(){
  	Array(1,2,3)
  };System.out.println("""f3: ()Unit""");$skip(38); 
  
  def f4(a:Int,b:Int)={
  	a+b
  };System.out.println("""f4: (a: Int, b: Int)Int""");$skip(13); val res$0 = 
  
  f4(2,3);System.out.println("""res0: Int = """ + $show(res$0));$skip(48); 
  
  def f5(str:String)={
  	str.split(",")
  };System.out.println("""f5: (str: String)Array[String]""");$skip(60); 
  
  def f6(arr:Array[Int])={
  	for(i<-arr) println(i)
  };System.out.println("""f6: (arr: Array[Int])Unit""");$skip(22); 
  
  f6(Array(1,2,3));$skip(99); 
  //--scala的默认参数机制, 可以在声明函数时, 为参数指定默认值
  def f7(a:String,b:String="*",c:String="&")={
  	b+a+c
  };System.out.println("""f7: (a: String, b: String, c: String)String""");$skip(17); val res$1 = 
  
  f7("hello");System.out.println("""res1: String = """ + $show(res$1));$skip(19); val res$2 = 
  f7("hello", "#");System.out.println("""res2: String = """ + $show(res$2));$skip(136); 
  
  //--scala的变长参数机制, 在类型后面加*
  //--变长参数类型本质是集合类型, 可以通过集合的方法来操作
  //--变长参数类型必须位于参数列表最后
  def f10(a:Int*)={
  	for(i<-a) println(i)
  };System.out.println("""f10: (a: Int*)Unit""");$skip(16); 
  
  f10(2,3,4);$skip(22); 
  val p1 = new Person;System.out.println("""p1  : Person = """ + $show(p1 ));$skip(11); 
  p1.eat()}
	
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
