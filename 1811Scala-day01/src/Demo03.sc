/**
学习数值类型常用方法, 和操作符相关知识

知识点
1 scala的Int类型表面上是Java的Int类型, 实际上底层通过隐式转换-->RichInt, 然后
调用方法, 比如.to()
2 scala语言中, 其实没有基本数据类型, 都是对象和方法, 所以从这个角度来看, scala的面向对象比Java更彻底
3 RichInt RichFloat RichDouble RichChar RichByte
**/
object Demo03 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val i1 = 1                                      //> i1  : Int = 1
  
  //--用于生成区间, 一般用于循环遍历时, 生成范围
  val r1 = i1.to(5)                               //> r1  : scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5)
  
  //--用于生成区间, 并指定步长
  val r2 = i1.to(5, 2)                            //> r2  : scala.collection.immutable.Range.Inclusive = Range(1, 3, 5)
  
  //--生成区间, 不含尾元素
  val r3 = i1.until(5)                            //> r3  : scala.collection.immutable.Range = Range(1, 2, 3, 4)
  val r4 = i1.until(5, 2)                         //> r4  : scala.collection.immutable.Range = Range(1, 3)
  
  val r5 = 1+3*2                                  //> r5  : Int = 7
  //--以方法的调用来计算, 但是不建议用这种方式来计算
  //如果用操作符来计算, 优先级同java
  val r6 = 1.+(3).*(2)                            //> r6  : Int = 8
  
  //--scala有4中前缀操作符, 前缀才操作符前需要加空格
  //--正数
  val i2 = +2                                     //> i2  : Int = 2
  //--负数
  val i3 = -2                                     //> i3  : Int = -2
  //--布尔取反
  val i4 = !true                                  //> i4  : Boolean = false
  //--二进制取反
  val i5 = ~0XFF                                  //> i5  : Int = -256
  
  //--避免出现歧义, 也可以用下面的方式来表示
  val i6 = 2.unary_+                              //> i6  : Int = 2
  val i7 = 2.unary_-                              //> i7  : Int = -2
  val i8 = true.unary_!                           //> i8  : Boolean = false
  val i9 = 0XFF.unary_~                           //> i9  : Int = -256
  
  
  
  
}