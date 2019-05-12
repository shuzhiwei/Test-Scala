/**
学习Tuple元组类型, Tuple是scala和spark最重要,最灵活的数据类型
**/
object Demo10 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(110); 
  println("Welcome to the Scala worksheet");$skip(49); 
  
  //--声明一个tuple, 含5个元素
  val t1 = (1,2,3,4,5);System.out.println("""t1  : (Int, Int, Int, Int, Int) = """ + $show(t1 ));$skip(54); 
  
  val t2 = (1,"hello",Array(1,2,3),Map("tom"->23));System.out.println("""t2  : (Int, String, Array[Int], scala.collection.immutable.Map[String,Int]) = """ + $show(t2 ));$skip(20); val res$0 = 
  //--元组的取值
  t1._3;System.out.println("""res0: Int = """ + $show(res$0));$skip(8); val res$1 = 
  t2._2;System.out.println("""res1: String = """ + $show(res$1));$skip(30); 
  
  val t3 = (1,2,(1,2,3,4));System.out.println("""t3  : (Int, Int, (Int, Int, Int, Int)) = """ + $show(t3 ));$skip(11); val res$2 = 
  t3._3._4;System.out.println("""res2: Int = """ + $show(res$2));$skip(67); 
  
  val t4 = ("hello",100,Array((1,2,3),(2,3,4),(3,4,3),(6,7,8)));System.out.println("""t4  : (String, Int, Array[(Int, Int, Int)]) = """ + $show(t4 ));$skip(17); val res$3 = 
  
  t4._3(3)._3;System.out.println("""res3: Int = """ + $show(res$3));$skip(85); 
  
  //--下面表示声明一个Array, 泛型是二元Tuple, 必须统一, 不然取不了值
  val a1 = Array((1,2),(2,3),(3,4));System.out.println("""a1  : Array[(Int, Int)] = """ + $show(a1 ))}
  
  
  
  
  
  
  
  
  
  
}
