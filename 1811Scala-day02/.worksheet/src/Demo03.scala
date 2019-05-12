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
object Demo03 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(253); 
  println("Welcome to the Scala worksheet");$skip(31); 
  
  def f1(a:Int,b:Int)={a+b};System.out.println("""f1: (a: Int, b: Int)Int""");$skip(66); 
  
  //--声明一个匿名函数
  //--将匿名函数当做参数赋值
  val f2=(a:Int,b:Int)=>{a+b};System.out.println("""f2  : (Int, Int) => Int = """ + $show(f2 ));$skip(13); val res$0 = 
  
  f2(2,3);System.out.println("""res0: Int = """ + $show(res$0));$skip(143); 
  
  //--将匿名函数当做参数传递
  //--如果一个函数可以将匿名函数当做参数传递,则此函数称为高阶函数
  //--即f3是一个高阶函数,可以把函数当做参数传递
  def f3(a:Int,b:Int,f:(Int,Int)=>Int)={
  		f(a,b)
  };System.out.println("""f3: (a: Int, b: Int, f: (Int, Int) => Int)Int""");$skip(74); val res$1 = 
  
  //--调用f3,传入两个整型和一个匿名函数,要求实现两个数乘法运算
  
  f3(2,3,(a:Int,b:Int)=>{a*b});System.out.println("""res1: Int = """ + $show(res$1));$skip(23); val res$2 = 
  f3(2,3,(a,b)=>{a*b});System.out.println("""res2: Int = """ + $show(res$2));$skip(21); val res$3 = 
  f3(2,3,(a,b)=>a*b);System.out.println("""res3: Int = """ + $show(res$3));$skip(14); val res$4 = 
  f3(2,3,_*_);System.out.println("""res4: Int = """ + $show(res$4));$skip(65); 
  
  
  def f4(a:String,f:(String)=>Array[String])={
  	f(a)
  };System.out.println("""f4: (a: String, f: String => Array[String])Array[String]""");$skip(71); val res$5 = 
  //--根据下面的调用,把f4函数声明出来
  f4("hello,world",(a:String)=>{a.split(",")});System.out.println("""res5: Array[String] = """ + $show(res$5));$skip(38); val res$6 = 
  f4("hello,world",(a)=>a.split(","));System.out.println("""res6: Array[String] = """ + $show(res$6));$skip(36); val res$7 = 
  f4("hello,world",a=>a.split(","));System.out.println("""res7: Array[String] = """ + $show(res$7));$skip(33); val res$8 = 
  f4("hello,world",_.split(","));System.out.println("""res8: Array[String] = """ + $show(res$8));$skip(27); 
  
  val a1=Array(1,2,3,4);System.out.println("""a1  : Array[Int] = """ + $show(a1 ));$skip(40); 
  
  a1.foreach {(a:Int)=>{println(a)}};$skip(29); 
  a1.foreach {a=>println(a)};$skip(26); 
  a1.foreach {println(_)};$skip(29); val res$9 = 
  a1.filter {(a:Int)=>{a>2}};System.out.println("""res9: Array[Int] = """ + $show(res$9));$skip(21); val res$10 = 
  a1.filter {a=>a>2};System.out.println("""res10: Array[Int] = """ + $show(res$10));$skip(18); val res$11 = 
  a1.filter {_>2};System.out.println("""res11: Array[Int] = """ + $show(res$11))}
}
