/**
6.修改前一个函数，返回最大的输出对应的输入。
举例来说,largestAt(fun:(Int)=>Int,inputs:Seq[Int])应该返回5

**/
object Test06 {
	def largestAt(fun:(Int)=>Int,inputs:Seq[Int])={
		val s = inputs.reduce((a,b)=>if(fun(a)>fun(b)) a else b)
		s
	}                                         //> largestAt: (fun: Int => Int, inputs: Seq[Int])Int
	
	val l1=largestAt(x=>10*x-x*x,1 to 10)     //> l1  : Int = 5

}