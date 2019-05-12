/**
scala的WorkSheet是一种交互式编译窗口

知识点:
1 scala的变量和常量
2 scala是行语言, 不需要加;
3 如果在一行中写多个语句, 则需要用;隔开 例如val v3 = "word"; val v4 = "scala"
4 scala语言可以根据结果自动推断出类型, 不需要声明数据的类型
5 可以显示的声明类型 例如 val v5:String = "hello"
**/

object demo01 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(266); 
  println("Welcome to the Scala worksheet");$skip(26); 
  //声明一个变量
  var v1 = 100;System.out.println("""v1  : Int = """ + $show(v1 ));$skip(11); 
  v1 = 200;$skip(30); 
  //声明一个常量
  val v2 = "hello";System.out.println("""v2  : String = """ + $show(v2 ));$skip(39); 
  
  val v3 = "word"; val v4 = "scala";System.out.println("""v3  : String = """ + $show(v3 ));System.out.println("""v4  : String = """ + $show(v4 ));$skip(26); 
  val v5:String = "hello";System.out.println("""v5  : String = """ + $show(v5 ));$skip(29); 
  
  val v6 = Array(1,2,3,5);System.out.println("""v6  : Array[Int] = """ + $show(v6 ))}
  
  
  
  
  
  
  
  
  
  
  
  
                                           
}
