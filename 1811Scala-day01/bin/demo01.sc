/**
scala的WorkSheet是一种交互式编译窗口

知识点:
1 scala的变量和常量
2 scala是行语言, 不需要加;
3 如果在一行中写多个语句, 则需要用;隔开 例如val v3 = "word"; val v4 = "scala"
4 scala语言可以根据结果自动推断出类型, 不需要声明数据的类型
5 可以显示的声明类型 例如 val v5:String = "hello"
**/

object demo01 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  //声明一个变量
  var v1 = 100                                    //> v1  : Int = 100
  v1 = 200
  //声明一个常量
  val v2 = "hello"                                //> v2  : String = hello
  
  val v3 = "word"; val v4 = "scala"               //> v3  : String = word
                                                  //| v4  : String = scala
  val v5:String = "hello"                         //> v5  : String = hello
  
  val v6 = Array(1,2,3,5)                         //> v6  : Array[Int] = Array(1, 2, 3, 5)
  
  
  
  
  
  
  
  
  
  
  
  
                                           
}