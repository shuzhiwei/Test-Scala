/**
学习set
**/
object Demo08 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(73); 
  println("Welcome to the Scala worksheet");$skip(49); 
  //--声明一个定长set, 不包含重复元素
  val s1 = Set(1,1,2,3);System.out.println("""s1  : scala.collection.immutable.Set[Int] = """ + $show(s1 ));$skip(65); 
  //--声明一个变长set
  val s2 = scala.collection.mutable.Set(1,2,3,4);System.out.println("""s2  : scala.collection.mutable.Set[Int] = """ + $show(s2 ));$skip(25); 
  
  val s3 = Set(1,2,3);System.out.println("""s3  : scala.collection.immutable.Set[Int] = """ + $show(s3 ));$skip(22); 
  val s4 = Set(3,4,5);System.out.println("""s4  : scala.collection.immutable.Set[Int] = """ + $show(s4 ));$skip(29); val res$0 = 
  //--取交集
  s3.intersect(s4);System.out.println("""res0: scala.collection.immutable.Set[Int] = """ + $show(res$0));$skip(8); val res$1 = 
  s3&s4;System.out.println("""res1: scala.collection.immutable.Set[Int] = """ + $show(res$1));$skip(27); val res$2 = 
  
  //--取差集
  s3.diff(s4);System.out.println("""res2: scala.collection.immutable.Set[Int] = """ + $show(res$2));$skip(9); val res$3 = 
  s3&~s4;System.out.println("""res3: scala.collection.immutable.Set[Int] = """ + $show(res$3));$skip(30); val res$4 = 
  
  //--合并set
  s3.union(s4);System.out.println("""res4: scala.collection.immutable.Set[Int] = """ + $show(res$4));$skip(9); val res$5 = 
  s3++s4;System.out.println("""res5: scala.collection.immutable.Set[Int] = """ + $show(res$5));$skip(33); 
  
  val s5 = Set(1,2,3,4,5,6,7);System.out.println("""s5  : scala.collection.immutable.Set[Int] = """ + $show(s5 ));$skip(101); val res$6 = 
  //--将一个set拆成两个子set, 一个子set元素个数是4个, 另一个是3个
  //--应用场景: 将一个数据集拆成两个子集, 一个是样本集, 一个是测试集
  s5.splitAt(4);System.out.println("""res6: (scala.collection.immutable.Set[Int], scala.collection.immutable.Set[Int]) = """ + $show(res$6))}
  
  
  
  
  
  
  
  
  
  
}
