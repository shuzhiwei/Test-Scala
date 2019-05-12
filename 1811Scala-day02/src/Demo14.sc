object Demo14 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //拉链
  val s1="hello"                                  //> s1  : String = hello
  val s2="world"                                  //> s2  : String = world
  
  s1 zip s2                                       //> res0: scala.collection.immutable.IndexedSeq[(Char, Char)] = Vector((h,w), (e
                                                  //| ,o), (l,r), (l,l), (o,d))
  val a1=Array(1,2,3)                             //> a1  : Array[Int] = Array(1, 2, 3)
  val a2=Array("a","b","c")                       //> a2  : Array[String] = Array(a, b, c)
  
  a1 zip a2                                       //> res1: Array[(Int, String)] = Array((1,a), (2,b), (3,c))
  
  val m1=Map("tom"->23, "rose"->34)               //> m1  : scala.collection.immutable.Map[String,Int] = Map(tom -> 23, rose -> 34
                                                  //| )
  val m2=Map("tom"->24, "rose"->35)               //> m2  : scala.collection.immutable.Map[String,Int] = Map(tom -> 24, rose -> 35
                                                  //| )
  m1 zip m2                                       //> res2: scala.collection.immutable.Map[(String, Int),(String, Int)] = Map((tom
                                                  //| ,23) -> (tom,24), (rose,34) -> (rose,35))
  
  
}