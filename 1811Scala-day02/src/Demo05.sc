/**
知识点
1 通过lazy关键字声明一个懒值, 声明并不是马上赋值, 待真正被调用时才进行赋值
2 lazy只能修饰常量val, 不能修饰变量var
3 scala底层支持柯里化,允许将接收多个参数的函数变为接收单一参数的函数
**/
object Demo05 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val v1 = 100                                    //> v1  : Int = 100
  lazy val v2=100                                 //> v2: => Int
  
  println(v2)                                     //> 100
  
  //--scala底层支持柯里化,允许将接收多个参数的函数变为接收单一参数的函数
  def f1(a:Int)(b:Int) ={a+b}                     //> f1: (a: Int)(b: Int)Int
  f1(2)(3)                                        //> res0: Int = 5
  
  def f2(a:Int,b:Int,c:Int)={a+b+c}               //> f2: (a: Int, b: Int, c: Int)Int
  def f22(a:Int)(b:Int)(c:Int)={a+b+c}            //> f22: (a: Int)(b: Int)(c: Int)Int
  def f222(a:Int)(b:Int,c:Int)={a+b+c}            //> f222: (a: Int)(b: Int, c: Int)Int
  
  f22(1)(2)(3)                                    //> res1: Int = 6
  f222(1)(2,3)                                    //> res2: Int = 6
}