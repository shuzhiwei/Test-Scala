/**
非常重要的高阶函数总结:

1 map
2 filter
3 sortBy
4 mapValues
5 reduce
6 flatMap(扁平化)
7 groupBy(分组函数)
**/
object Demo11 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(157); 
  println("Welcome to the Scala worksheet");$skip(49); 
  
  val l1=List("hello","world","hello","1811");System.out.println("""l1  : List[String] = """ + $show(l1 ));$skip(99); 
  //--map映射方法, 把元素从一个形式映射到另外一个形式, 并返回一个新集合
  //--map方法只改变元素的形式, 不改变元素的个数
  val l2=l1.map{x=>(x,1)};System.out.println("""l2  : List[(String, Int)] = """ + $show(l2 ));$skip(41); 
  //--操作l2
  val l3=l2.map{case(k,v)=>k};System.out.println("""l3  : List[String] = """ + $show(l3 ));$skip(25); 
  val l4=l2.map{x=>x._1};System.out.println("""l4  : List[String] = """ + $show(l4 ));$skip(64); 
  
  val l5=List(("tom",18),("rose",25),("jim",20),("jary",15));System.out.println("""l5  : List[(String, Int)] = """ + $show(l5 ));$skip(57); 
  //--操作l4, 过滤出年龄大于18岁的数据
  val l6=l5.filter(x=>x._2>18);System.out.println("""l6  : List[(String, Int)] = """ + $show(l6 ));$skip(41); 
  
  //按年龄做升序排序
  val l7=l5.sortBy(_._2);System.out.println("""l7  : List[(String, Int)] = """ + $show(l7 ));$skip(48); 
  
  val m1=Map("tom"->23,"rose"->24,"jim"->30);System.out.println("""m1  : scala.collection.immutable.Map[String,Int] = """ + $show(m1 ));$skip(82); 
  //--操作m1,过滤出年龄大于20
  //--针对Map类型, 底层会将kv封装成元组的形式
  val m2=m1.filter{x=>x._2>20};System.out.println("""m2  : scala.collection.immutable.Map[String,Int] = """ + $show(m2 ));$skip(36); 
  val m3=m1.filter{case(k,v)=>v>20};System.out.println("""m3  : scala.collection.immutable.Map[String,Int] = """ + $show(m3 ));$skip(112); 
                                                  
  //--用reduce方法计算1~6的阶乘结果
  val m4=1 to 6 reduce{(a,b)=>a*b};System.out.println("""m4  : Int = """ + $show(m4 ));$skip(60); 
  
  val l8=List("hello,world","hello,hadoop","hello,1811");System.out.println("""l8  : List[String] = """ + $show(l8 ));$skip(33); 
  val l9=l8.map{x=>x.split(",")};System.out.println("""l9  : List[Array[String]] = """ + $show(l9 ));$skip(81); 
  //--扁平化map方法, 也是映射方法, 会改变元素的形式,元素的个数也会改变
  val l10=l8.flatMap{x=>x.split(",")};System.out.println("""l10  : List[String] = """ + $show(l10 ));$skip(103); 
  
  //--按指定的匿名函数分组, 并返回一个Map
  //--Map的key是分组条件, Map的Value是相同key聚合后的List
  val m5 = l10.groupBy{x=>x};System.out.println("""m5  : scala.collection.immutable.Map[String,List[String]] = """ + $show(m5 ));$skip(54); 
 	val l11 = List(("bj",1),("sh",2),("bj",3),("sh",4));System.out.println("""l11  : List[(String, Int)] = """ + $show(l11 ));$skip(32); 
 	val m6 = l11.groupBy{x=>x._1};System.out.println("""m6  : scala.collection.immutable.Map[String,List[(String, Int)]] = """ + $show(m6 ))}
                                                 
}
