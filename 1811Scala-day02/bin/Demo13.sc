object Demo13 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val s1=new Student("tom",23)                    //> s1  : Student = Student@36d64342
  
  val s2=new Student("jim")                       //> s2  : Student = Student@39ba5a14
  
  val s3=new Student()                            //> s3  : Student = Student@511baa65
  
  val s4=new Student(23)                          //> s4  : Student = Student@340f438e
  
  Util.cook()
  Student.eat()                                   //> eat food
  
  val i1 = Item("xiaomi",2000.0)                  //> i1  : Item = Item(xiaomi,2000.0)
  val i2 = Item                                   //> i2  : Item.type = Item
  
  val m1 = Map("tom"->23, "rose"->30)             //> m1  : scala.collection.immutable.Map[String,Int] = Map(tom -> 23, rose -> 30
                                                  //| )
  m1("tom")                                       //> res0: Int = 23
  m1.get("tom").getOrElse(0)                      //> res1: Int = 23
  
  def f1(a:Int,b:Int):Option[Int]={
  	if(b!=0){
  		Some(a/b)
  	}else{
  		None
  	}
  }                                               //> f1: (a: Int, b: Int)Option[Int]
  f1(4,2).getOrElse(0)                            //> res2: Int = 2
  
  
  
  
  
  
  
  
  
  
  
}