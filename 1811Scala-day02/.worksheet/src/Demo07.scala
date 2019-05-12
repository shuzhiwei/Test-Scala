import scala.collection.mutable.ListBuffer

object Demo07 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(104); 
  println("Welcome to the Scala worksheet");$skip(41); 
  
  //--声明定长List
  val l1=List(1,2,3,4);System.out.println("""l1  : List[Int] = """ + $show(l1 ));$skip(50); 
  
  val l2 = scala.collection.mutable.ListBuffer;System.out.println("""l2  : collection.mutable.ListBuffer.type = """ + $show(l2 ));$skip(22); 
  val l3 = ListBuffer;System.out.println("""l3  : scala.collection.mutable.ListBuffer.type = """ + $show(l3 ));$skip(24); val res$0 = 
  //在List左侧添加元素
  1+:l1;System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(29); val res$1 = 
  
  //在List右侧添加一个元素
  l1:+5;System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(100); val res$2 = 
  
  //--其他方法与Array类似
  
  
  //--集合间的类型转换
  //--类型转换, 比如某种集合类型没有distinct, 可以通过类型转换来实现
  l1.toArray;System.out.println("""res2: Array[Int] = """ + $show(res$2));$skip(27); 
  val l6 = List(1,1,2,3,4);System.out.println("""l6  : List[Int] = """ + $show(l6 ));$skip(29); val res$3 = 
  l6.toArray.distinct.toList;System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(25); val res$4 = 
  
  //--反转
  l6.reverse;System.out.println("""res4: List[Int] = """ + $show(res$4))}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
