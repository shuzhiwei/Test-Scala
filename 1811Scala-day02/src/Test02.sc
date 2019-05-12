import scala.collection.mutable.ListBuffer
/**
2.编写函数values(fun:(Int)=>Int,low:Int,high:Int),
该函数输出一个集合，对应给定区间内给定函数的输入 和输出。比如，
-5,-4,-3,-2,-1,0,1,2,3,4,5
values(x=>x*x,-5,5)应该产出一个对偶的集合(-5,25),(-4,16),(-3,9),…,(3,9),(5,25)

**/
object Test02 {

	def values(fun:(Int)=>Int,low:Int,high:Int)={
		var arr = ListBuffer[(Int,Int)]()
		for(num<-low to high){
			arr.append((num,fun(num)))
		}
		arr
	}                                         //> values: (fun: Int => Int, low: Int, high: Int)scala.collection.mutable.ListB
                                                  //| uffer[(Int, Int)]
	
	values(x=>x*x,-5,5)                       //> res0: scala.collection.mutable.ListBuffer[(Int, Int)] = ListBuffer((-5,25), 
                                                  //| (-4,16), (-3,9), (-2,4), (-1,1), (0,0), (1,1), (2,4), (3,9), (4,16), (5,25))
                                                  //| 
 
}