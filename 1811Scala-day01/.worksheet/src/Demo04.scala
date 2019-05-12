/**
学习Scala的if else

知识点
1 scala的打印:print 打印不换行 println 打印换行
2 scala的if else用法结构通java
3 scala的if else是由返回值的, 可以接
4 scala的Unit相当于java中的void空类型
5 scala通用规则: 会把方法体{}的最后一行代码当做返回值返回
6 print或println 返回类型为Unit
7 scala通用的化简规则: 如果方法体{}只有一行代码, 则方法体{}可以省略
8 scala的while用法结构同java
**/
object Demo04 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(331); 
  println("Welcome to the Scala worksheet");$skip(16); 
  
  val i1 = 1;System.out.println("""i1  : Int = """ + $show(i1 ));$skip(129); 
  
  val r1 = if(i1>5){
  	println("big")
  	"1"
  	100
  	"hello man"
	}else{
		println("small")
		"2"
		200
		"hello woman"
	};System.out.println("""r1  : String = """ + $show(r1 ));$skip(58); 
	
	val r2 = if(i1>5) println("big") else println("small");System.out.println("""r2  : Unit = """ + $show(r2 ));$skip(25); 
	val a1 = Array(1,2,3,4);System.out.println("""a1  : Array[Int] = """ + $show(a1 ));$skip(15); 
	var index = 0;System.out.println("""index  : Int = """ + $show(index ));$skip(55); 
	while(index < a1.length){
		println(a1)
		index+=1
	}}
		
	
}
