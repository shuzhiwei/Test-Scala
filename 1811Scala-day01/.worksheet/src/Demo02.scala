/**
学习Scala的字符串类型的操作, 为后面处理文件数据打基础
知识点
1 操作scala的String类型时, 表面上是java的String, 但是底层通过:隐式转换机制
转换成scala的StringOps类型, 下面take takeRight...都是StringOps类型
即String-->StringOps
**/
object Demo02 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(229); 
  println("Welcome to the Scala worksheet");$skip(28); 
  
  val s1 = "hello world";System.out.println("""s1  : String = """ + $show(s1 ));$skip(28); 
  
  val r1 = s1.split(" ");System.out.println("""r1  : Array[String] = """ + $show(r1 ));$skip(40); 
  
  //取出前n个元素并返回
  val r2 = s1.take(2);System.out.println("""r2  : String = """ + $show(r2 ));$skip(43); 
  //取出尾部n个元素并返回
  val r3 = s1.takeRight(5);System.out.println("""r3  : String = """ + $show(r3 ));$skip(43); 
  //去掉前n个元素, 并返回剩余元素
  val r4 = s1.drop(2);System.out.println("""r4  : String = """ + $show(r4 ));$skip(27); 
  val r5 = s1.dropRight(2);System.out.println("""r5  : String = """ + $show(r5 ));$skip(28); 
  
  //重复n次
  val r6 = s1*2;System.out.println("""r6  : String = """ + $show(r6 ));$skip(33); 
  
  //去重
  val r7 = s1.distinct;System.out.println("""r7  : String = """ + $show(r7 ));$skip(32); 
  
  //反转
  val r8 = s1.reverse;System.out.println("""r8  : String = """ + $show(r8 ));$skip(19); 
  
  val s2 ="100";System.out.println("""s2  : String = """ + $show(s2 ));$skip(20); 
  val r9 = s2.toInt;System.out.println("""r9  : Int = """ + $show(r9 ));$skip(24); 
  val r10 = s2.toDouble;System.out.println("""r10  : Double = """ + $show(r10 ))}
  
  
  
  
  
}
