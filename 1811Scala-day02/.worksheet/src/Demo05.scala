/**
知识点
1 通过lazy关键字声明一个懒值, 声明并不是马上赋值, 待真正被调用时才进行赋值
2 lazy只能修饰常量val, 不能修饰变量var
3 scala底层支持柯里化,允许将接收多个参数的函数变为接收单一参数的函数
**/
object Demo05 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(180); 
  println("Welcome to the Scala worksheet");$skip(18); 
  
  val v1 = 100;System.out.println("""v1  : Int = """ + $show(v1 ));$skip(18); 
  lazy val v2=100;System.out.println("""v2: => Int""");$skip(17); 
  
  println(v2);$skip(76); 
  
  //--scala底层支持柯里化,允许将接收多个参数的函数变为接收单一参数的函数
  def f1(a:Int)(b:Int) ={a+b};System.out.println("""f1: (a: Int)(b: Int)Int""");$skip(11); val res$0 = 
  f1(2)(3);System.out.println("""res0: Int = """ + $show(res$0));$skip(39); 
  
  def f2(a:Int,b:Int,c:Int)={a+b+c};System.out.println("""f2: (a: Int, b: Int, c: Int)Int""");$skip(39); 
  def f22(a:Int)(b:Int)(c:Int)={a+b+c};System.out.println("""f22: (a: Int)(b: Int)(c: Int)Int""");$skip(39); 
  def f222(a:Int)(b:Int,c:Int)={a+b+c};System.out.println("""f222: (a: Int)(b: Int, c: Int)Int""");$skip(18); val res$1 = 
  
  f22(1)(2)(3);System.out.println("""res1: Int = """ + $show(res$1));$skip(15); val res$2 = 
  f222(1)(2,3);System.out.println("""res2: Int = """ + $show(res$2))}
}
