object Demo13 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet");$skip(34); 
  
  val s1=new Student("tom",23);System.out.println("""s1  : Student = """ + $show(s1 ));$skip(31); 
  
  val s2=new Student("jim");System.out.println("""s2  : Student = """ + $show(s2 ));$skip(26); 
  
  val s3=new Student();System.out.println("""s3  : Student = """ + $show(s3 ));$skip(28); 
  
  val s4=new Student(23);System.out.println("""s4  : Student = """ + $show(s4 ));$skip(17); 
  
  Util.cook();$skip(16); 
  Student.eat();$skip(36); 
  
  val i1 = Item("xiaomi",2000.0);System.out.println("""i1  : Item = """ + $show(i1 ));$skip(16); 
  val i2 = Item;System.out.println("""i2  : Item.type = """ + $show(i2 ));$skip(41); 
  
  val m1 = Map("tom"->23, "rose"->30);System.out.println("""m1  : scala.collection.immutable.Map[String,Int] = """ + $show(m1 ));$skip(12); val res$0 = 
  m1("tom");System.out.println("""res0: Int = """ + $show(res$0));$skip(29); val res$1 = 
  m1.get("tom").getOrElse(0);System.out.println("""res1: Int = """ + $show(res$1));$skip(94); 
  
  def f1(a:Int,b:Int):Option[Int]={
  	if(b!=0){
  		Some(a/b)
  	}else{
  		None
  	}
  };System.out.println("""f1: (a: Int, b: Int)Option[Int]""");$skip(23); val res$2 = 
  f1(4,2).getOrElse(0);System.out.println("""res2: Int = """ + $show(res$2))}
  
  
  
  
  
  
  
  
  
  
  
}
