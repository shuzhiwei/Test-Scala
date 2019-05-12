/**
6.修改前一个函数，返回最大的输出对应的输入。
举例来说,largestAt(fun:(Int)=>Int,inputs:Seq[Int])应该返回5

**/
object Test06 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(215); 
	def largestAt(fun:(Int)=>Int,inputs:Seq[Int])={
		val s = inputs.reduce((a,b)=>if(fun(a)>fun(b)) a else b)
		s
	};System.out.println("""largestAt: (fun: Int => Int, inputs: Seq[Int])Int""");$skip(41); 
	
	val l1=largestAt(x=>10*x-x*x,1 to 10);System.out.println("""l1  : Int = """ + $show(l1 ))}

}
