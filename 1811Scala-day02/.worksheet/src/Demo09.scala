/**
学习map
**/
object Demo09 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(73); 
  println("Welcome to the Scala worksheet");$skip(64); 
  
  //--声明一个定长Map
  val m1=Map("tom"->23,"rose"->24,"jim"->35);System.out.println("""m1  : scala.collection.immutable.Map[String,Int] = """ + $show(m1 ));$skip(99); 
  //--声明一个变长Map, 可以追加新的KV对
  val m2 = scala.collection.mutable.Map("tom"->23,"rose"->24,"jim"->35);System.out.println("""m2  : scala.collection.mutable.Map[String,Int] = """ + $show(m2 ));$skip(26); val res$0 = 
  //--通过key取值
  m1("tom");System.out.println("""res0: Int = """ + $show(res$0));$skip(18); val res$1 = 
  m1.apply("tom");System.out.println("""res1: Int = """ + $show(res$1));$skip(49); 
  
  //--获取Map的key迭代器
  m1.keys.foreach{println};$skip(29); 
 	m1.values.foreach{println};$skip(28); val res$2 = 
  m1.values.filter{x=>x>30};System.out.println("""res2: Iterable[Int] = """ + $show(res$2));$skip(31); val res$3 = 
  
  m1.values.toList.distinct;System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(43); val res$4 = 
  
  //针对变长Map, 追加新的kv对
  m2+=("jary"->40);System.out.println("""res4: Demo09.m2.type = """ + $show(res$4));$skip(48); val res$5 = 
  
  //--用于操作Map类型的value
  m1.mapValues{x=>x*2};System.out.println("""res5: scala.collection.immutable.Map[String,Int] = """ + $show(res$5));$skip(29); val res$6 = 
  m1.map{case(k,v)=>(k,v*2)};System.out.println("""res6: scala.collection.immutable.Map[String,Int] = """ + $show(res$6));$skip(61); val res$7 = 
  //--通过key取值, 并可以指定没有对应key值的默认值
  m1.get("zs").getOrElse(0);System.out.println("""res7: Int = """ + $show(res$7));$skip(24); val res$8 = 
  
  m1.contains("tom");System.out.println("""res8: Boolean = """ + $show(res$8));$skip(13); val res$9 = 
  
  m1.size;System.out.println("""res9: Int = """ + $show(res$9))}
  
  
  
  
  
  
}
