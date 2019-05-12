object Demo12 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val l1=List("hello,world","hello,world","hello,1811")
                                                  //> l1  : List[String] = List(hello,world, hello,world, hello,1811)
  //--统计l1中单词频次
  l1.flatMap{x=>x.split(",")}.groupBy{x=>x}.mapValues { x => x.size }.toList
                                                  //> res0: List[(String, Int)] = List((world,2), (1811,1), (hello,3))
  
  //--
  l1.flatMap{line=>line.split(",")}.map{word=>(word,1)}.groupBy{x=>x._1}.mapValues{x=>x.map{x=>x._2}.reduce{_+_}}.toList
                                                  //> res1: List[(String, Int)] = List((world,2), (1811,1), (hello,3))
  l1.flatMap{_.split(",")}.map{(_,1)}.groupBy{_._1}.mapValues{_.map{_._2}.sum}.toList
                                                  //> res2: List[(String, Int)] = List((world,2), (1811,1), (hello,3))
  
  //操作l2, 取出频次最高的那一项单词数据
  l1.flatMap{_.split(",")}.map{(_,1)}.groupBy{_._1}.mapValues{_.map{_._2}.sum}.toArray.sortBy{_._2}.reverse(0)
                                                  //> res3: (String, Int) = (hello,3)
}