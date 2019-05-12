/**
学习Tuple元组类型, Tuple是scala和spark最重要,最灵活的数据类型
**/
object Demo10 {
  println("Welcome to the Scala worksheet")
  
  //--声明一个tuple, 含5个元素
  val t1 = (1,2,3,4,5)
  
  val t2 = (1,"hello",Array(1,2,3),Map("tom"->23))
  //--元组的取值
  t1._3
  t2._2
  
  val t3 = (1,2,(1,2,3,4))
  t3._3._4
  
  val t4 = ("hello",100,Array((1,2,3),(2,3,4),(3,4,3),(6,7,8)))
  
  t4._3(3)._3
  
  //--下面表示声明一个Array, 泛型是二元Tuple, 必须统一, 不然取不了值
  val a1 = Array((1,2),(2,3),(3,4))
  
  
  
  
  
  
  
  
  
  
}