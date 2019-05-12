/**
重点: scala的for循环

知识点
1 scala for循环的遍历  <-
2 scala 通用的化简规则: 在调用方式时, 如果方法的参数只有一个, 则. ()可以省略
**/
object Demo05 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(157); 
  println("Welcome to the Scala worksheet");$skip(29); 
  
  val a1 = Array(1,2,3,4);System.out.println("""a1  : Array[Int] = """ + $show(a1 ));$skip(33); 
  
  for(i <- a1){
  	println(i)
  };$skip(48); 
  
  //val a2 = 1.to(10)
  val a2 = 1 to 10;System.out.println("""a2  : scala.collection.immutable.Range.Inclusive = """ + $show(a2 ));$skip(26); 
  for(i <- a2) println(i);$skip(31); 
  for(i <- 1 to 10) println(i);$skip(126); 
  //课堂练习: 用scala打印99乘法表
  for(i <- 1 to 9){
  	for(j <- 1 to i){
  		print(j + "*" + i +"=" + i*j + "\t")
  	}
  	println
  };$skip(76); 
  //--scala支持在for(写条件语句)
  for(i <- 1 to 10; if i>6&&i%2==0){
  	println(i)
  };$skip(57); 
  for(i <- 1 to 10; if i>6;if i%2==0){
  	println(i)
  };$skip(103); 
  
  for(a <- 1 to 9; b<-1 to a; val seq=if(b==a) "\r\n" else "\t"){
  	print(b+"*"+a+"="+b*a+seq)
  };$skip(100); 
  for(a <- 1 to 9; b<-1 to a; val seq=if(b==a) "\r\n" else "\t"){
  	print(s"$b*$a=${b*a}$seq")
  };$skip(83); 
  
  //--声明一个map(key->value)
  val m1 = Map("tom"->23, "rose"->18, "jack"->20);System.out.println("""m1  : scala.collection.immutable.Map[String,Int] = """ + $show(m1 ));$skip(12); val res$0 = 
  m1("tom");System.out.println("""res0: Int = """ + $show(res$0));$skip(26); 
  for(i <- m1) println(i);$skip(47); 
  //掌握此种操作map的方式
  for((k,v)<-m1) println((k));$skip(77); 
                                                  
  val a3 = Array(1,2,3,4);System.out.println("""a3  : Array[Int] = """ + $show(a3 ));$skip(263); 
  //--将a3中的每个元素*2, 并返回到一个新的数组中
  //--for yield表达式可以达成这个要求
  //--这个表达式的作用: 遍历一个集合(collection), 返回一个新集合
  //--scala的集合是一个大的概念:
  //--Array,List,Map,Range,Set,Tuple
  //--即通过for yield, 遍历的是Array, 返回的就是Array
  //--即遍历的是什么类型, 返回的就是什么类型
  val a4 = for(i<-a3)yield{i*2};System.out.println("""a4  : Array[Int] = """ + $show(a4 ));$skip(76); 
                                                  
  val l1 = List(1,2,3,4);System.out.println("""l1  : List[Int] = """ + $show(l1 ));$skip(32); 
  val l2 = for(i<-l1)yield{i*3};System.out.println("""l2  : List[Int] = """ + $show(l2 ))}
                                                  
                                                  
                                                  
}
