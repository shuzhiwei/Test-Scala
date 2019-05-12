object Demo14 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet");$skip(27); 
  
  //拉链
  val s1="hello";System.out.println("""s1  : String = """ + $show(s1 ));$skip(17); 
  val s2="world";System.out.println("""s2  : String = """ + $show(s2 ));$skip(15); val res$0 = 
  
  s1 zip s2;System.out.println("""res0: scala.collection.immutable.IndexedSeq[(Char, Char)] = """ + $show(res$0));$skip(22); 
  val a1=Array(1,2,3);System.out.println("""a1  : Array[Int] = """ + $show(a1 ));$skip(28); 
  val a2=Array("a","b","c");System.out.println("""a2  : Array[String] = """ + $show(a2 ));$skip(15); val res$1 = 
  
  a1 zip a2;System.out.println("""res1: Array[(Int, String)] = """ + $show(res$1));$skip(39); 
  
  val m1=Map("tom"->23, "rose"->34);System.out.println("""m1  : scala.collection.immutable.Map[String,Int] = """ + $show(m1 ));$skip(36); 
  val m2=Map("tom"->24, "rose"->35);System.out.println("""m2  : scala.collection.immutable.Map[String,Int] = """ + $show(m2 ));$skip(12); val res$2 = 
  m1 zip m2;System.out.println("""res2: scala.collection.immutable.Map[(String, Int),(String, Int)] = """ + $show(res$2))}
  
  
}
