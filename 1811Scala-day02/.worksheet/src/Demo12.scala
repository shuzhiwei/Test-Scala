object Demo12 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet");$skip(59); 
  
  val l1=List("hello,world","hello,world","hello,1811");System.out.println("""l1  : List[String] = """ + $show(l1 ));$skip(93); val res$0 = 
  //--统计l1中单词频次
  l1.flatMap{x=>x.split(",")}.groupBy{x=>x}.mapValues { x => x.size }.toList;System.out.println("""res0: List[(String, Int)] = """ + $show(res$0));$skip(131); val res$1 = 
  
  //--
  l1.flatMap{line=>line.split(",")}.map{word=>(word,1)}.groupBy{x=>x._1}.mapValues{x=>x.map{x=>x._2}.reduce{_+_}}.toList;System.out.println("""res1: List[(String, Int)] = """ + $show(res$1));$skip(86); val res$2 = 
  l1.flatMap{_.split(",")}.map{(_,1)}.groupBy{_._1}.mapValues{_.map{_._2}.sum}.toList;System.out.println("""res2: List[(String, Int)] = """ + $show(res$2));$skip(139); val res$3 = 
  
  //操作l2, 取出频次最高的那一项单词数据
  l1.flatMap{_.split(",")}.map{(_,1)}.groupBy{_._1}.mapValues{_.map{_._2}.sum}.toArray.sortBy{_._2}.reverse(0);System.out.println("""res3: (String, Int) = """ + $show(res$3))}
}
