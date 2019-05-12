/**
学习数值类型常用方法, 和操作符相关知识

知识点
1 scala的Int类型表面上是Java的Int类型, 实际上底层通过隐式转换-->RichInt, 然后
调用方法, 比如.to()
2 scala语言中, 其实没有基本数据类型, 都是对象和方法, 所以从这个角度来看, scala的面向对象比Java更彻底
3 RichInt RichFloat RichDouble RichChar RichByte
**/
object Demo03 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(274); 
  println("Welcome to the Scala worksheet");$skip(16); 
  
  val i1 = 1;System.out.println("""i1  : Int = """ + $show(i1 ));$skip(53); 
  
  //--用于生成区间, 一般用于循环遍历时, 生成范围
  val r1 = i1.to(5);System.out.println("""r1  : scala.collection.immutable.Range.Inclusive = """ + $show(r1 ));$skip(46); 
  
  //--用于生成区间, 并指定步长
  val r2 = i1.to(5, 2);System.out.println("""r2  : scala.collection.immutable.Range.Inclusive = """ + $show(r2 ));$skip(44); 
  
  //--生成区间, 不含尾元素
  val r3 = i1.until(5);System.out.println("""r3  : scala.collection.immutable.Range = """ + $show(r3 ));$skip(26); 
  val r4 = i1.until(5, 2);System.out.println("""r4  : scala.collection.immutable.Range = """ + $show(r4 ));$skip(20); 
  
  val r5 = 1+3*2;System.out.println("""r5  : Int = """ + $show(r5 ));$skip(78); 
  //--以方法的调用来计算, 但是不建议用这种方式来计算
  //如果用操作符来计算, 优先级同java
  val r6 = 1.+(3).*(2);System.out.println("""r6  : Int = """ + $show(r6 ));$skip(60); 
  
  //--scala有4中前缀操作符, 前缀才操作符前需要加空格
  //--正数
  val i2 = +2;System.out.println("""i2  : Int = """ + $show(i2 ));$skip(23); 
  //--负数
  val i3 = -2;System.out.println("""i3  : Int = """ + $show(i3 ));$skip(28); 
  //--布尔取反
  val i4 = !true;System.out.println("""i4  : Boolean = """ + $show(i4 ));$skip(29); 
  //--二进制取反
  val i5 = ~0XFF;System.out.println("""i5  : Int = """ + $show(i5 ));$skip(51); 
  
  //--避免出现歧义, 也可以用下面的方式来表示
  val i6 = 2.unary_+;System.out.println("""i6  : Int = """ + $show(i6 ));$skip(21); 
  val i7 = 2.unary_-;System.out.println("""i7  : Int = """ + $show(i7 ));$skip(24); 
  val i8 = true.unary_!;System.out.println("""i8  : Boolean = """ + $show(i8 ));$skip(24); 
  val i9 = 0XFF.unary_~;System.out.println("""i9  : Int = """ + $show(i9 ))}
  
  
  
  
}
