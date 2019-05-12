/**
3.如何用reduce得到数组中的最大元素?
Array(1,2,3,4,5)
要求不能出现max函数

**/
object Test03 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(105); 

	val arr = Array(1,2,3,4,5);System.out.println("""arr  : Array[Int] = """ + $show(arr ));$skip(10); val res$0 = 

	arr.max;System.out.println("""res0: Int = """ + $show(res$0));$skip(45); 
	
	print(arr.reduce((a,b)=>if(a>b)a else b))}
}
