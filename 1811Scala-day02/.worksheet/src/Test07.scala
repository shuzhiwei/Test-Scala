import scala.collection.mutable._
/**
7.编写一个函数，接收一个整数数组（Array[Int])，产出一个新的数组。
包含原数组中的所有正值，以原有顺序排列，之后的元素是所有零或负值，以原有顺序排列。

比如： Array(4, -2, 0, -3, 0, 1, 5) ，
处理后的结果是：Array（4 ,1, 5, 0, 0, -2, -3）

**/
object Test07 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(411); 

	def sigNumArr(arr:Array[Int])={
		val buf = new ArrayBuffer[Int]()
		buf++=(for(i<-arr if i>0) yield i)
		buf++=(for(i<-arr if i==0) yield i)
		buf++=(for(i<-arr if i<0) yield i)
		buf.toArray
	};System.out.println("""sigNumArr: (arr: Array[Int])Array[Int]""");$skip(42); 
	
	val arr = Array(4, -2, 0, -3, 0, 1, 5);System.out.println("""arr  : Array[Int] = """ + $show(arr ));$skip(33); 
	sigNumArr(arr).foreach{println}}

}
