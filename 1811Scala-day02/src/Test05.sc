/**
5.编写函数largest(fun:(Int)=>Int,inputs:Seq[Int]),输出在给定输入序列中给定函数的最大值。
举例来说，
largest(x=>10*x-x*x,1 to 10)应该返回25
1=>x=>10*x-x*x=9
2=>x=>10*x-x*x=16
……
返回其中的最大值 25

**/
object Test05 {
	def largest(fun:(Int)=>Int, inputs:Seq[Int])={
		val s = inputs.reduce((a,b)=>if(fun(a)>fun(b)) a else b)
		fun(s)
	}                                         //> largest: (fun: Int => Int, inputs: Seq[Int])Int
	
	val l1 = largest(x=>10*x-x*x,1 to 10)     //> l1  : Int = 25
	

}